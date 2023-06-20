package org.example.lesson4.Homework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов ");
        int n = scanner.nextInt();
        scanner.close();
        Deque<Integer> deq = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deq.add(i);
        }
        System.out.println(deq);

        System.out.println("Перевернутый список");
        while (deq.size() > 0) {
            System.out.print(deq.pollLast() + " ");
        }
    }
}
