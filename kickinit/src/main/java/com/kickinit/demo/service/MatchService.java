package com.kickinit.demo.service;

import com.kickinit.demo.model.Match;
import com.kickinit.demo.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    // Create or update a match
    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    // Get a match by ID
    public Optional<Match> getMatchById(String id) {
        return matchRepository.findById(id);
    }

    // Get all matches
    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    // Delete a match by ID
    public void deleteMatchById(String id) {
        matchRepository.deleteById(id);
    }


}