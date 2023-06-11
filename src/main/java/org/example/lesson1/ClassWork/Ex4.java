package org.example.lesson1.ClassWork;

public class Ex4 {
    public static void main(String[] args) {
        int[] array = {2,4,5,7,8,6,1,2};
        System.out.println("palindrom(array) = " + palindrom(array));
    }

    /**
     * @apiNote дан массив целых чисел.Верно ли, что массив является симметричным
     * @param array входной массив
     * @return результат проверки
     */
    private static boolean palindrom(int[] array) {
        int len = array.length-1;
        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] != array[len - i]) return false;
        }
        return true;
    }
}
