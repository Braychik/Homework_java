package org.example.lesson5.homework;

import java.util.HashMap;
import java.util.Map;

public class Hw1 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        countWords(text);
    }
    public static void countWords(String str) {
        str = str.replaceAll("[^а-яА-я\\s]", "").replaceAll("\\s{2,}", " ");
        String[] word = str.toLowerCase().split(" ");
        Map<String, Integer> mapWords = new HashMap<>();
        for (String s : word) {
            mapWords.putIfAbsent(s, 0);
            mapWords.put(s, mapWords.get(s) + 1);
        }
        for (Map.Entry<String, Integer> items : mapWords.entrySet()) {
            System.out.printf("%s - %d раз(а)%n", items.getKey(), items.getValue());
        }
    }
}
