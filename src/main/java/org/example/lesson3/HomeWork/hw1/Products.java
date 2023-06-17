package org.example.lesson3.HomeWork.hw1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    private String name;
    private Integer price;
    private Integer sorts;
}
