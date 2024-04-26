package com.kickinit.demo.repository;

import com.kickinit.demo.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {

    // Define additional query methods if needed
}
