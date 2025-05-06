package com.organizationmanagment.demo.controller;

import com.organizationmanagment.demo.dto.OrganizationManagmentDTO;
import com.organizationmanagment.demo.model.OrganizationManagment;
import com.organizationmanagment.demo.service.OrganizationManagmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organizations")
@preauthorise
public class OrganizationManagmentController {

    private final OrganizationManagmentService organizationService;

    public OrganizationManagmentController(OrganizationManagmentService organizationService) {
        this.organizationService = organizationService;
    }

    @PostMapping
    public ResponseEntity<OrganizationManagment> createOrganization(@RequestBody OrganizationManagmentDTO dto) {
        return ResponseEntity.ok(organizationService.createOrganization(dto));
    }

    @GetMapping
    public ResponseEntity<List<OrganizationManagment>> getAllOrganizations() {
        return ResponseEntity.ok(organizationService.getAllOrganizations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrganizationManagment> getOrganizationById(@PathVariable Long id) {
        return ResponseEntity.ok(organizationService.getOrganizationById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrganizationManagment> updateOrganization(@PathVariable Long id, @RequestBody OrganizationManagmentDTO dto) {
        return ResponseEntity.ok(organizationService.updateOrganization(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganization(@PathVariable Long id) {
        organizationService.deleteOrganization(id);
        return ResponseEntity.noContent().build();
    }
}
