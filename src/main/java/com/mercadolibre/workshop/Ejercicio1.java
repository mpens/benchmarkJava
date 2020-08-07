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
        Set<Character> keysToDelete= new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : keys.toCharArray()) {
            keysToDelete.add(c);
        }
        for (Character c : input.toCharArray()) { // O(n)
            boolean keyContainLetter = keysToDelete.contains(c);//O(1)
            if (!keyContainLetter) {// O(1)
                stringBuilder.append(c); // O(1)
            }
        }

        return stringBuilder.toString();
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
