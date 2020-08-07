package com.mercadolibre.workshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Ejercicio1Test
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testString1()
    {
        String input = "Hellow World";
        String keys = "awo";
        String expectedResult = "Hell Wrld";
        String result = Ejercicio1.resolve(input, keys);
        assertEquals(result, expectedResult);
    }

    @Test
    public void testString2()
    {
        String input = "abcdegh";
        String keys = "ehb";
        String expectedResult = "acdg";
        String result = Ejercicio1.resolve(input, keys);
        assertEquals(result, expectedResult);
    }
}
