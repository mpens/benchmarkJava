package com.mercadolibre.workshop;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class Ejercicio1 {
    //MeasureApplicationPerformance.appAverageTimeCalculation  avgt   40  0,044 ± 0,001   s/op
    //MeasureApplicationPerformance.appAverageTimeCalculation  avgt   40  0,006 ±  0,001   s/op
    public static String resolve(String input, String keys) {
        // insert your code here
    }

    public static void main(String[] args) {
        String input = "Hellow World";
        String keys = "awo";
        String expectedResult = "Hell Wrld";
        String result = resolve(input, keys);
        if (!result.equals(expectedResult)) {
            throw new IllegalArgumentException("Not match");
        }
    }
}
