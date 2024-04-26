package com.kickinit.demo.service;

import com.kickinit.demo.model.Team;
import com.kickinit.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    // Add more methods as needed for team-related operations
}
