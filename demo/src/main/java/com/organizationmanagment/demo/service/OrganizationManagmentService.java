package com.organizationmanagment.demo.service;

import com.organizationmanagment.demo.dto.OrganizationManagmentDTO;
import com.organizationmanagment.demo.model.OrganizationManagment;
import com.organizationmanagment.demo.repository.OrganizationManagmentRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrganizationManagmentService {

    private final OrganizationManagmentRepo organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public OrganizationManagment createOrganization(OrganizationManagmentDTO dto) {
        Organization organization = new Organization();
        organization.setName(dto.getName());
        organization.setType(dto.getType());
        organization.setParentOrganizationId(dto.getParentOrganizationId());
        return organizationRepository.save(organization);
    }

    public List<OrganizationManagment> getAllOrganizations() {
        return organizationRepository.findAll();
    }

    public OrganizationManagment getOrganizationById(Long id) {
        return organizationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Organization not found"));
    }

    public OrganizationManagment updateOrganization(Long id, OrganizationUpdateDTO dto) {
        Organization org = getOrganizationById(id);
        org.setName(dto.getName());
        org.setType(dto.getType());
        org.setParentOrganizationId(dto.getParentOrganizationId());
        return organizationRepository.save(org);
    }

    public void deleteOrganization(Long id) {
        organizationRepository.deleteById(id);
    }
}


