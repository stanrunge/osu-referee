package com.stanrunge.opt3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RefereeLogicTest {
    @Test
    void choosePickOrBanTest() {
        int roll1 = RefereeLogic.roll();
        int roll2 = RefereeLogic.roll();
        assertEquals("pick", RefereeLogic.choosePickOrBan());
    }
}
