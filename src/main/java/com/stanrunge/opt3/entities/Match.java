package com.stanrunge.opt3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match {

    public Match() {
        // get team 1 by id
        setTeam2(team);

        // get team 2 by id
        setTeam2(team);
    }

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "round_id")
    private Integer roundId;

    @Column(name = "team1_id")
    private Integer team1Id;

    @Column(name = "team2_id")
    private Integer team2Id;

    private Team team1;
    private Team team2;

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Integer getTeam2Id() {
        return team2Id;
    }

    public void setTeam2Id(Integer team2Id) {
        this.team2Id = team2Id;
    }

    public Integer getTeam1Id() {
        return team1Id;
    }

    public void setTeam1Id(Integer team1Id) {
        this.team1Id = team1Id;
    }

    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
