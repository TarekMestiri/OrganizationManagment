package organizationmanagement.service;

import organizationmanagement.model.Team;
import organizationmanagement.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    public List<Team> getAll() {
        return teamRepository.findAll();
    }

    public Team create(Team team) {
        return teamRepository.save(team);
    }

    public Team getById(Long id) {
        return teamRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        teamRepository.deleteById(id);
    }
}
