package org.example.lesson3.ClassWork.Ex2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students{
    private String name;
    private int groupNumber;
    private int salary;
    private List<Integer> scores;
}
