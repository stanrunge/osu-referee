package com.stanrunge.opt3.osu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    Person testPlayer = new Player(1, "test player", 2);
    StaffMember testStaff = new StaffMember(1, "test player", 2, 3);

    @Test
    void getId() {
        assertEquals(testPlayer.getId(), 1);
    }

    @Test
    void getUsername() {
        assertEquals(testPlayer.getUsername(), "test player");
    }

    @Test
    void getDiscordId() {
        assertEquals(testPlayer.getDiscordId(), 2);
    }

    @Test
    void getOsuId() {
        assertEquals(testStaff.getOsuId(), 3);
    }
}