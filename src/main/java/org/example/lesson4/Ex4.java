package org.example.lesson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,-3,-2,-1,4,5,-6,7));
        System.out.println("linkedList = " + linkedList);
        //Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) < 0){
                linkedList.remove(i);
                --i;
            }
        }
        System.out.println("linkedList = " + linkedList);
    }
}
