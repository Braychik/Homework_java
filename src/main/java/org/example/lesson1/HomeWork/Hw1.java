package org.example.lesson1.HomeWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("zadanie3(str) = " + revers_word(str));
        scanner.close();
    }

    private static String revers_word(String str) {
        List<String> words = Arrays.asList(str.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}

