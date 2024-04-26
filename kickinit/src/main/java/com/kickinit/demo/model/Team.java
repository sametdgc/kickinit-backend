package com.kickinit.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "teams")
@AllArgsConstructor
@Data
public class Team {

    @Id
    private String id;

    private String name;
    private List<String> playerIds;

    // Constructors, getters, setters, etc.
}
