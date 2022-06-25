package com.stanrunge.opt3.osu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreTest {
    Map testMap = new Map(1, "NM", 1);
    Player testPlayer = new Player(1, "test player", 2);
    Score testScore = new Score(1, testMap, testPlayer, 1000);

    @Test
    void getId() {
        assertEquals(testScore.getId(), 1);
    }

    @Test
    void getMap() {
        assertEquals(testScore.getMap(), testMap);
    }

    @Test
    void getPlayer() {
        assertEquals(testScore.getPlayer(), testPlayer);
    }

    @Test
    void getScore() {
        assertEquals(testScore.getScore(), 1000);
    }

}