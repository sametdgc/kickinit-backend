package com.kickinit.demo.repository;

import com.kickinit.demo.model.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match, String> {


}
