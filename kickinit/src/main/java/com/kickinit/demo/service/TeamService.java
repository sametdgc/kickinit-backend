package com.kickinit.demo.service;

import com.kickinit.demo.model.Team;
import com.kickinit.demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Team getTeamById(String id) {
        Optional<Team> optionalTeam = teamRepository.findById(id);
        return optionalTeam.orElse(null);
    }

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

//    public Team updateTeam(String id, Team team) {
//        Optional<Team> optionalTeam = teamRepository.findById(id);
//        if (optionalTeam.isPresent()) {
//            Team existingTeam = optionalTeam.get();
//            existingTeam.setName(team.getName());
//            existingTeam.setPlayerIds(team.getPlayerIds());
//            return teamRepository.save(existingTeam);
//        }
//        return null;
//    }

    public void deleteTeam(String id) {
        teamRepository.deleteById(id);
    }
}