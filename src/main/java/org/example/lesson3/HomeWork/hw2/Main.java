package org.example.lesson3.HomeWork.hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Products products = new Products("Мука", "Россия", 10, 600, 1);
        Products products2 = new Products("Яблоко", "Польша", 5, 60, 2);
        Products products3 = new Products("Груша", "Греция", 11, 170, 3);
        Products products4 = new Products("Персик", "Турция", 10, 155, 2);
        Products products5 = new Products("Банан", "Юар", 10, 100, 1);
        ArrayList<Products> productList = new ArrayList<>();
        productList.add(products);
        productList.add(products2);
        productList.add(products3);
        productList.add(products4);
        productList.add(products5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер сорта: ");
        String sort = scanner.nextLine();
        int ourSort = 0;
        boolean flag = true;
        if (Integer.parseInt(sort) > 0 && Integer.parseInt(sort) <= 3) {
            flag = false;
            ourSort = Integer.parseInt(sort);
        }else {
            System.out.println("Такого сорта нет. Попробуйте еще раз.");
        }
        scanner.close();

        Integer minPrice = productList.get(0).getPrice();
        for (Products products1 : productList) {
            if (products1.getSorts().equals(ourSort)) {
                if (products1.getPrice() < minPrice) {
                    minPrice = products1.getPrice();
                }
            }
        }
        StringBuilder ourNames = new StringBuilder();
        for (Products products1 : productList) {
            if (products1.getSorts().equals(ourSort) && (products1.getPrice() == minPrice)) {
                ourNames.append(products1.getName()).append("\n");
            }
        }
        System.out.println("Самые бюджетные товары сорта " + ourSort + ": \n" + ourNames);
    }
}
