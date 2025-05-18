package organizationmanagement.controller;

import organizationmanagement.model.Organization;
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

@RestController
@RequestMapping("/api/organizations")
@RequiredArgsConstructor
@Tag(name = "Organization", description = "Manage organizations")
public class OrganizationController {

    private final OrganizationService service;

    @Operation(summary = "Get all organizations", responses = {
            @ApiResponse(responseCode = "200", description = "List of organizations",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Organization.class)))
    })
    @GetMapping
    public List<Organization> getAll() {
        return service.getAll();
    }

    @Operation(summary = "Create an organization", responses = {
            @ApiResponse(responseCode = "201", description = "Organization created",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Organization.class)))
    })
    @PostMapping
    public Organization create(@RequestBody Organization org) {
        return service.create(org);
    }

    @Operation(summary = "Get an organization by ID", responses = {
            @ApiResponse(responseCode = "200", description = "Organization found",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Organization.class))),
            @ApiResponse(responseCode = "404", description = "Organization not found")
    })
    @GetMapping("/{id}")
    public Organization getById(
            @Parameter(description = "ID of the organization") @PathVariable Long id) {
        return service.getById(id);
    }

    @Operation(summary = "Delete an organization", responses = {
            @ApiResponse(responseCode = "204", description = "Organization deleted"),
            @ApiResponse(responseCode = "404", description = "Organization not found")
    })
    @DeleteMapping("/{id}")
    public void delete(
            @Parameter(description = "ID of the organization to delete") @PathVariable Long id) {
        service.delete(id);
    }
}
