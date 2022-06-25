package com.stanrunge.opt3.osu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {
    Event testEvent = new Event(1, "Test event");

    @Test
    void testGetName() {
        assertEquals(testEvent.getName(), "Test event");
    }
}