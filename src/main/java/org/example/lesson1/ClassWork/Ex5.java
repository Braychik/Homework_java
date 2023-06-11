package org.example.lesson1.ClassWork;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] resArr = namberSum(array);
//        for (int i : resArr) {
//
//        }
        for (int elem: resArr) {
            System.out.print(elem + " ");
        }
    }

    /**
     * @apiNote Задан массив nums. Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]…nums[i]).
     * Возвращает текущую сумму nums.
     * @param array массив чисел
     * @return массив чисел
     */
    private static int[] namberSum(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i - 1] + array[i];
        }
        return result;
    }
}
