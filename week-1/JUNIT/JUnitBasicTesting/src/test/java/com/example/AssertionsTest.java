package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testAssertEquals() {
        assertEquals(10, 5 + 5);
    }

    @Test
    void testAssertTrue() {
        assertTrue(10 > 5);
    }

    @Test
    void testAssertFalse() {
        assertFalse(5 > 10);
    }

    @Test
    void testAssertNull() {
        String name = null;
        assertNull(name);
    }

    @Test
    void testAssertNotNull() {
        String name = "Naveesh";
        assertNotNull(name);
    }
}