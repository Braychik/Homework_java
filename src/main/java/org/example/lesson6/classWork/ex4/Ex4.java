package org.example.lesson6.classWork.ex4;

//4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
//для валидного перевода величин. Метод для конвертации назовите "convertValue".
public class Ex4 {
    public static void main(String[] args) {
        double temp = 1.0;
        System.out.println("Cel = " + new Cels().convertValue(temp));
        System.out.println("Kel = " + new Kelvin().convertValue(temp));
        System.out.println("Far = " + new Faren().convertValue(temp));
    }
}
