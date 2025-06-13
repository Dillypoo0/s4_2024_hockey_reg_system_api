package com.keyin.rest.Game;

import jakarta.persistence.*;


@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String homeTeam;
    private String awayTeam;
    private String location;
    private String scheduledDate;

    // Getters and setters
    public Long getId() { return id; }
    public String getHomeTeam() { return homeTeam; }
    public void setHomeTeam(String homeTeam) { this.homeTeam = homeTeam; }
    public String getAwayTeam() { return awayTeam; }
    public void setAwayTeam(String awayTeam) { this.awayTeam = awayTeam; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getScheduledDate() { return scheduledDate; }
    public void setScheduledDate( String scheduledDate) { this.scheduledDate = scheduledDate; }
}
