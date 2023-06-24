package org.example.lesson5.classWork;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        //1)	Посчитать количество вхождений каждого символа в текст.
        Map<Character, Integer> chMap = new HashMap<>();
        String str = "adjmeaikc nsjvcki snoc osd ncsjksnkc";
        for (int i = 0; i < str.length(); i++) {
            if (!chMap.containsKey(str.charAt(i))){
                chMap.put(str.charAt(i), i);
            }else{
                chMap.put(str.charAt(i), chMap.get(str.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry:chMap.entrySet()) {
            System.out.println(entry.getKey() + "Встретилась:" + entry.getValue() + "раз(а)");

        }
    }
}
