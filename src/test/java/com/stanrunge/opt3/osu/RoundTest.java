package com.stanrunge.opt3.osu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {
    Round testRound = new Round("test round", 2, 9);
    Map testMap = new Map(1, "NM", 1);
    ArrayList<Map> testMappool = new ArrayList<Map>();

    @Test
    void addAndGetMap() {
        testRound.addMap(testMap);
        testMappool.add(testMap);
        assertEquals(testRound.getMappool(), testMappool);
    }

    @Test
    void getName() {
        assertEquals(testRound.getName(), "test round");
    }

    @Test
    void getBans() {
        assertEquals(testRound.getBans(), 2);
    }

    @Test
    void getBestOf() {
        assertEquals(testRound.getBestOf(), 9);
    }
}