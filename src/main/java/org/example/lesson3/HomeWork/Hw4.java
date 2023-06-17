package org.example.lesson3.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hw4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        double avg = getAverage(numbers);
        System.out.println("Collections.max(numbers) = " + Collections.max(numbers));
        System.out.println("Collections.min(numbers) = " + Collections.min(numbers));
        System.out.println("avg = " + avg);

    }

    private static Double getAverage(ArrayList<Integer> numbers) {
        return numbers.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }
}
