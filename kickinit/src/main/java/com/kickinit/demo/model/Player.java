package com.kickinit.demo.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "players")
@AllArgsConstructor
public class Player {

    @Id
    private String id;

//    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private List<String> preferredPositions;

    // Constructors, getters, setters, etc.
}
