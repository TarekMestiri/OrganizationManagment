package organizationmanagement.controller;

import organizationmanagement.model.Team;
import organizationmanagement.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService service;

    @GetMapping
    public List<Team> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Team create(@RequestBody Team team) {
        return service.create(team);
    }

    @GetMapping("/{id}")
    public Team getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

