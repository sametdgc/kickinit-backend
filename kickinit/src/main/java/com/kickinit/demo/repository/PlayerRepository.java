package com.kickinit.demo.repository;

import com.kickinit.demo.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String> {


}
