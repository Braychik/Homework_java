package org.example.lesson2.Homework;

import java.util.Arrays;

// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
//         Пример:
//         Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
//         Сумма индексов двузначных элементов массива = 1+2+3+7 = 13
//         Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
public class Hw3 {
    public static void main(String[] args) {
        int[] array = {1, 22, 33, -44, 5, -5, -3, 23, -7};

        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 9){
                sumIndex += i;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if(array[j] < 0){
                array[j] = sumIndex;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
