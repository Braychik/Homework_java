package org.example.lesson3.HomeWork.hw3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Books books = new Books("Мастер и Маргарита", "Булгаков", 520, 1940, 553);
        Books books2 = new Books("Дорога", "Маккарти", 440, 2015, 7);
        Books books3 = new Books("Мцыри", "Тургенев", 500, 1840, 465);
        Books books4 = new Books("Голодные игры", "Каллинз", 350, 2011, 13);
        Books books5 = new Books("Тарас Бульба", "Гоголь", 600, 1842, 653);
        ArrayList<Books> booksList = new ArrayList<>();
        booksList.add(books);
        booksList.add(books2);
        booksList.add(books3);
        booksList.add(books4);
        booksList.add(books5);
        System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Books books1 : booksList) {
            if (isPrime(books1.getCount()) && books1.getSurname().toLowerCase().contains("а")) {
                if (books1.getYear() >= 2010 && books1.getYear() <= 2023) {
                    sortedBooks.append(books1.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }
    private static boolean isPrime(Integer n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
