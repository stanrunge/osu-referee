package com.stanrunge.opt3.entities;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false)
    private String username;

    @Lob
    @Column(name = "hashed_password", nullable = false)
    private String hashedPassword;

    @Column(name = "discord_id")
    private Integer discordId;

    public Integer getDiscordId() {
        return discordId;
    }

    public void setDiscordId(Integer discordId) {
        this.discordId = discordId;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
