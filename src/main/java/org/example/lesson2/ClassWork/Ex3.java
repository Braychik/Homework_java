package org.example.lesson2.ClassWork;

import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        System.out.println("zadanie3(mass, sc) = " + zadanie3(mass, sc));
    }

    /**
     * 3) Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент
     * вдвое больше второго.
     * @param mass
     * @param sc
     * @return
     */
    private static int zadanie3(int[] mass, Scanner sc) {
        int k = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if(mass[i] == mass[i + 1] *2){
                k++;
            }
        }
        return k;
    }
}
