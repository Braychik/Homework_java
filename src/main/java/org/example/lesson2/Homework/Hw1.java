package org.example.lesson2.Homework;

import java.util.Scanner;

//Дана последовательность N целых чисел. Найти сумму простых чисел.
public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        System.out.println("homework1(n, scanner) = " + homework1(n, scanner));
    }

    private static int homework1(int n, Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int count = scanner.nextInt();
            if (count % 2 != 0){
                sum += count;
            }
        }
        return sum;
    }
}
