package org.example.lesson5.classWork;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I', 1);
        characterIntegerMap.put('V', 5);
        characterIntegerMap.put('X', 10);
        characterIntegerMap.put('L', 50);
        characterIntegerMap.put('C', 100);
        characterIntegerMap.put('D', 500);
        characterIntegerMap.put('M', 1000);
        int result = 0;
        String str = "MCMXCIV";
        for (int i = 0; i < str.length() - 1; i++) {
            if (characterIntegerMap.containsKey(str.charAt(i))){
                if (characterIntegerMap.get(str.charAt(i)) < characterIntegerMap.get(str.charAt(i + 1))){
                    result += characterIntegerMap.get(str.charAt(i + 1)) - characterIntegerMap.get(str.charAt(i));
                    if (i + 2 < str.length()){
                        i++;
                    }
                }else {
                    result += characterIntegerMap.get(str.charAt(i));
                }

            }
        }
        System.out.println(result);
    }
}
