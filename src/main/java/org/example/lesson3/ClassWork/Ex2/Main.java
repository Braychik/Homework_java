package org.example.lesson3.ClassWork.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Иванов", 23, 1000, List.of(3, 4, 5));
        Students student2 = new Students("Петрова", 13, 1500, List.of(5, 4, 5));
        Students student3 = new Students("Сидоров", 14, 2000, List.of(4, 4, 3));
        ArrayList<Students> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        for (Students students : studentList) {
            int sum =  sumScores(students.getScores());
            if(students.getName().endsWith("ова") && sum % 2 == 0);{
                System.out.println(students.getSalary());
            }
            
        }
    }

    private static int sumScores(List<Integer> scores) {
        int sum = 0;
        for (Integer score: scores) {
            sum += score;
        }
        return sum;
    }
}
