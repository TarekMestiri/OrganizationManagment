package organizationmanagement.service;

import organizationmanagement.model.Organization;
import organizationmanagement.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    public List<Organization> getAll() {
        return organizationRepository.findAll();
    }

    public Organization create(Organization org) {
        return organizationRepository.save(org);
    }

    public Organization getById(Long id) {
        return organizationRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        organizationRepository.deleteById(id);
    }
}
