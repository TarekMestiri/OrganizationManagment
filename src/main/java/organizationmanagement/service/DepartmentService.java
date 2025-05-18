package organizationmanagement.service;

import organizationmanagement.exception.ResourceNotFoundException;
import organizationmanagement.model.Department;
import organizationmanagement.repository.DepartmentRepository;
import organizationmanagement.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final OrganizationRepository organizationRepository;

    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    public Department create(Department dept) {
        return departmentRepository.save(dept);
    }

    public Department getById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id " + id));
    }

    public void delete(Long id) {
        if (!departmentRepository.existsById(id)) {
            throw new ResourceNotFoundException("Department not found with id " + id);
        }
        departmentRepository.deleteById(id);
    }

    public List<Department> getByOrganizationId(Long organizationId) {
        return departmentRepository.findByOrganizationId(organizationId);
    }

    public Department createUnderOrganization(Long orgId, Department dept) {
        return organizationRepository.findById(orgId)
                .map(org -> {
                    dept.setOrganization(org);
                    return departmentRepository.save(dept);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Organization not found with id " + orgId));
    }
}
