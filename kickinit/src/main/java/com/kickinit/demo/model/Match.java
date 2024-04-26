package com.kickinit.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "matches")
public class Match {

    @Id
    private String id;

    private Date date;
    private String homeTeamId;
    private String awayTeamId;
    private int homeTeamScore;
    private int awayTeamScore;

    // Constructors, getters, setters, etc.
}
