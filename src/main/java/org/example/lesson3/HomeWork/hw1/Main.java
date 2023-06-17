package org.example.lesson3.HomeWork.hw1;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Products products = new Products("Мука высший сорт", 100, 1);
        Products products2 = new Products("Яблоко", 90, 3);
        Products products3= new Products("Груша", 110, 2);
        Products products4 = new Products("Персик высший сорт", 80, 1);
        Products products5 = new Products("Мука высший мельник", 120, 1);
        ArrayList<Products> proguctList = new ArrayList<>();
        proguctList.add(products);
        proguctList.add(products2);
        proguctList.add(products3);
        proguctList.add(products4);
        proguctList.add(products5);
        System.out.println(proguctList);
        Integer maxPrice = 0;
        String namesMaxPrice = "";
        String searchName = "высший";
        for (Products product : proguctList) {
            if (product.getName().toLowerCase().contains(searchName) && (product.getSorts() == 1 || product.getSorts() == 2)){
                if (maxPrice < product.getPrice()){
                    maxPrice = product.getPrice();
                }
            }
        }
        for (Products product : proguctList) {
            if (product.getName().toLowerCase().contains(searchName) && (product.getSorts() == 1 || product.getSorts() == 2)){
                if (Objects.equals(product.getPrice(), maxPrice)){
                    namesMaxPrice += product.getName() + "\n";
                }
            }

        }
        System.out.println("namesMaxPrice = " + namesMaxPrice);
        System.out.println("maxPrice = " + maxPrice);

    }
}
