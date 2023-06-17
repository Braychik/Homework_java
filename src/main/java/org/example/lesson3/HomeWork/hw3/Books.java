package org.example.lesson3.HomeWork.hw3;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Books {
    private String name;
    private String surname;
    private Integer price;
    private Integer year;
    private Integer count;

}
