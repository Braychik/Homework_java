package org.example.lesson1.HomeWork;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        System.out.println("zadanie2(n, scanner) = " + Homework2(scanner));

    }

    private static int Homework2(Scanner scanner) {
        int sum = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        int i = 0;
        while (a != 0) {
                b = scanner.nextInt();
                if (a > 0 && b < 0) sum+=a;
                a = b;
                i++;
            }
        return sum;
    }
}