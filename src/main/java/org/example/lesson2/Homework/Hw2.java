package org.example.lesson2.Homework;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int n = scanner.nextInt();
        System.out.println("homework2(n, scanner) = " + homework2(n, scanner));

    }
//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
    private static boolean homework2(int n, Scanner scanner) {
        boolean mass = true;
        int count = 0;
        int a = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
        int m = scanner.nextInt();
            if(a > m){
                count+=1;
            }
            a = m;
            if(count != 0){
                mass = false;
            }
        }
        return mass;
    }
}
