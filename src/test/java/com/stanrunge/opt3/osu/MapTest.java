package com.stanrunge.opt3.osu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {
    Map testMap = new Map(1, "NM", 1);

    @Test
    void testGetId() {
        assertEquals(testMap.getId(), 1);
    }

    @Test
    void testGetMod() {
        assertEquals(testMap.getMod(), "NM");
    }

    @Test
    void testGetModnum() {
        assertEquals(testMap.getModnum(), 1);
    }
}