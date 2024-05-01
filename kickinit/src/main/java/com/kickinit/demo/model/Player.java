package com.kickinit.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "players")
@AllArgsConstructor
@Data
public class Player {

    @Id
    private String id;

    //    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private List<String> preferredPositions;



}
