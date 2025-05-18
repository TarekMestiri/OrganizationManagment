package organizationmanagement.service;

import organizationmanagement.exception.ResourceNotFoundException;
import organizationmanagement.model.Team;
import organizationmanagement.repository.DepartmentRepository;
import organizationmanagement.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    private final DepartmentRepository departmentRepository;

    public List<Team> getAll() {
        return teamRepository.findAll();
    }

    public Team create(Team team) {
        return teamRepository.save(team);
    }

    public Team getById(Long id) {
        return teamRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Team not found with id: " + id));
    }

    public void delete(Long id) {
        if (!teamRepository.existsById(id)) {
            throw new ResourceNotFoundException("Team not found with id: " + id);
        }
        teamRepository.deleteById(id);
    }

    public List<Team> getByDepartmentId(Long departmentId) {
        return teamRepository.findByDepartmentId(departmentId);
    }

    public Team createUnderDepartment(Long deptId, Team team) {
        return departmentRepository.findById(deptId)
                .map(dept -> {
                    team.setDepartment(dept);
                    return teamRepository.save(team);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + deptId));
    }
}
