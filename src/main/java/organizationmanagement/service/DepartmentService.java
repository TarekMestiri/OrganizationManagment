package organizationmanagement.service;



import organizationmanagement.model.Department;
import organizationmanagement.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    public Department create(Department dept) {
        return departmentRepository.save(dept);
    }

    public Department getById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        departmentRepository.deleteById(id);
    }
}
