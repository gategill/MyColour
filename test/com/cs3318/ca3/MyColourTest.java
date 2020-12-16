package com.cs3318.ca3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyColourTest {
    @Test
    public void checkAValidColour(){
        MyColour validator = new MyColour();
        boolean result = validator.checkColour("Red");
        assertTrue(result);
    }

    @Test
    public void checkAnInvalidColour(){
        MyColour validator = new MyColour();
        boolean result = validator.checkColour("Reed");
        assertFalse(result);
    }

}
