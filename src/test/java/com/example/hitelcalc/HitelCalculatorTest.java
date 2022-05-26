package com.example.hitelcalc;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HitelCalculatorTest {

    HitelCalculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new HitelCalculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void kamat() {
        assertEquals("179.6869066406349",underTest.Kamat("10000","60","0.03"));
    }

    @Test
    void visszafiz() {
        assertEquals("10781.214398438095",underTest.Visszafiz("10000","60","0.03"));

    }
}