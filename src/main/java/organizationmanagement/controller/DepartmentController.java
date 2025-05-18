package organizationmanagement.controller;

import organizationmanagement.dto.DepartmentCreateDTO;
import organizationmanagement.dto.DepartmentDTO;
import organizationmanagement.dto.OrganizationDTO;
import organizationmanagement.model.Department;
import organizationmanagement.model.Organization;
import organizationmanagement.service.DepartmentService;
import organizationmanagement.service.OrganizationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
@Tag(name = "Department", description = "Manage departments")
public class DepartmentController {

    private final DepartmentService service;
    private final OrganizationService organizationService;

    @Operation(summary = "Get all departments", responses = {
            @ApiResponse(responseCode = "200", description = "List of departments",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentDTO.class)))
    })
    @GetMapping
    public List<DepartmentDTO> getAll() {
        return service.getAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Operation(summary = "Create a department", responses = {
            @ApiResponse(responseCode = "201", description = "Department created",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentDTO.class)))
    })
    @PostMapping
    public DepartmentDTO create(@RequestBody DepartmentCreateDTO deptDto) {
        Department deptEntity = convertToEntity(deptDto);
        Department saved = service.create(deptEntity);
        return convertToDTO(saved);
    }

    @Operation(summary = "Get a department by ID", responses = {
            @ApiResponse(responseCode = "200", description = "Department found",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepartmentDTO.class))),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @GetMapping("/{id}")
    public DepartmentDTO getById(
            @Parameter(description = "ID of the department") @PathVariable Long id) {
        Department dept = service.getById(id);
        if (dept == null) {
            // Handle not found, you can throw exception or return null
            return null;
        }
        return convertToDTO(dept);
    }

    @Operation(summary = "Delete a department", responses = {
            @ApiResponse(responseCode = "204", description = "Department deleted"),
            @ApiResponse(responseCode = "404", description = "Department not found")
    })
    @DeleteMapping("/{id}")
    public void delete(
            @Parameter(description = "ID of the department to delete") @PathVariable Long id) {
        service.delete(id);
    }

    // Mapping methods

    private DepartmentDTO convertToDTO(Department dept) {
        DepartmentDTO dto = new DepartmentDTO();
        dto.setId(dept.getId());
        dto.setName(dept.getName());

        Organization org = dept.getOrganization();
        if (org != null) {
            OrganizationDTO orgDto = new OrganizationDTO();
            orgDto.setId(org.getId());
            orgDto.setName(org.getName());
            dto.setOrganization(orgDto);
        }
        return dto;
    }

    private Department convertToEntity(DepartmentCreateDTO dto) {
        Department dept = new Department();
        dept.setName(dto.getName());
        if (dto.getOrganizationId() != null) {
            Organization org = organizationService.getById(dto.getOrganizationId());
            dept.setOrganization(org);
        }
        return dept;
    }
}
