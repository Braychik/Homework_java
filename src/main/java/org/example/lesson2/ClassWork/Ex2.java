package org.example.lesson2.ClassWork;

import java.util.Scanner;

/**
 * 2) Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5,
 * перед которыми идет четное число.
 */
public class Ex2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if(n2 % 10 == 5 && n1 % 2 == 0) sum += n2;
            n1 = n2;
        }
        System.out.println(sum);
    }
}
