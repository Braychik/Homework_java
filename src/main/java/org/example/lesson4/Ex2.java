package org.example.lesson4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = creatList(n);
        System.out.println("linkedList = " + linkedList);
        // Построить однонаправленный список целых чисел. Найти сумму четных элементов
        int sum = 0;
        for (Integer el : linkedList) {
            if (el % 2 == 0) sum += el;
        }
        System.out.println("sum = " + sum);

        //Заменить некратные 3 элементы списка, суммой нечетных элементов.
        zadanie3(linkedList);

    }

    private static void zadanie3(LinkedList<Integer> linkedList) {
        int sum1 = 0;
        for (Integer el : linkedList) {
            if (el % 2 != 0){
                sum1 += el;
            }
        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 3 != 0){
                linkedList.set(i, sum1);
            }

        }
        System.out.println("linkedList = " + linkedList);
    }

    private static LinkedList<Integer> creatList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}
