package organizationmanagement.controller;

import organizationmanagement.dto.DepartmentDTO;
import organizationmanagement.dto.TeamCreateDTO;
import organizationmanagement.dto.TeamDTO;
import organizationmanagement.model.Department;
import organizationmanagement.model.Team;
import organizationmanagement.service.DepartmentService;
import organizationmanagement.service.TeamService;
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
@RequestMapping("/api/teams")
@RequiredArgsConstructor
@Tag(name = "Team", description = "Manage teams")
public class TeamController {

    private final TeamService service;
    private final DepartmentService departmentService;

    @Operation(summary = "Get all teams", responses = {
            @ApiResponse(responseCode = "200", description = "List of teams",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamDTO.class)))
    })
    @GetMapping
    public List<TeamDTO> getAll() {
        return service.getAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Operation(summary = "Create a team", responses = {
            @ApiResponse(responseCode = "201", description = "Team created",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamDTO.class)))
    })
    @PostMapping
    public TeamDTO create(@RequestBody TeamCreateDTO teamDto) {
        Team teamEntity = convertToEntity(teamDto);
        Team saved = service.create(teamEntity);
        return convertToDTO(saved);
    }

    @Operation(summary = "Get a team by ID", responses = {
            @ApiResponse(responseCode = "200", description = "Team found",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = TeamDTO.class))),
            @ApiResponse(responseCode = "404", description = "Team not found")
    })
    @GetMapping("/{id}")
    public TeamDTO getById(
            @Parameter(description = "ID of the team") @PathVariable Long id) {
        Team team = service.getById(id);
        if (team == null) {
            // Handle not found, you can throw exception or return null
            return null;
        }
        return convertToDTO(team);
    }

    @Operation(summary = "Delete a team", responses = {
            @ApiResponse(responseCode = "204", description = "Team deleted"),
            @ApiResponse(responseCode = "404", description = "Team not found")
    })
    @DeleteMapping("/{id}")
    public void delete(
            @Parameter(description = "ID of the team to delete") @PathVariable Long id) {
        service.delete(id);
    }

    // Mapping methods

    private TeamDTO convertToDTO(Team team) {
        TeamDTO dto = new TeamDTO();
        dto.setId(team.getId());
        dto.setName(team.getName());

        Department dept = team.getDepartment();
        if (dept != null) {
            DepartmentDTO deptDto = new DepartmentDTO();
            deptDto.setId(dept.getId());
            deptDto.setName(dept.getName());
            // Optionally set organization if you want nested fully
            dto.setDepartment(deptDto);
        }
        return dto;
    }

    private Team convertToEntity(TeamCreateDTO dto) {
        Team team = new Team();
        team.setName(dto.getName());
        if (dto.getDepartmentId() != null) {
            Department dept = departmentService.getById(dto.getDepartmentId());
            team.setDepartment(dept);
        }
        return team;
    }
}
