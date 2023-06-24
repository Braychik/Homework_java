package org.example.lesson5.classWork;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    //2)	Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
    //В противном случае (false).
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 1, 4};
        System.out.println("checkArrayDouble(array) = " + checkArrayDouble(array));
    }
    private static boolean checkArrayDouble(int[] array){
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (intMap.containsKey(array[i])){
                return true;
            }else {
                intMap.put(array[i], 1);
            }
        }
        return false;
    }
}
