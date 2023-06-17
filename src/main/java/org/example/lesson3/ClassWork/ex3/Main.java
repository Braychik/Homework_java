package org.example.lesson3.ClassWork.ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "Желтый", "Деревянный");
        Cube cube2 = new Cube(4, "Красный", "Металлический");
        Cube cube3 = new Cube(2, "Красный", "Деревянный");
        Cube cube4 = new Cube(3, "Желтый", "Стальной");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println("cubeList = " + cubeList);
        Integer k = 0;
        Integer volume = 0;
        Integer kWood = 0;
        for (Cube cube : cubeList) {
            if(cube.getColor().equals("Желтый")){
                k++;
                volume += cube.volumeCube();
            }
            if (cube.getMaterial().equals("Деревянный") && cube.getSize() == 3){
                kWood++;
            }

        }
        System.out.println("k = " + k);
        System.out.println("volume = " + volume);
        System.out.println("kWood = " + kWood);
        System.out.println("unicomListCube(cubeList) = " + unicomListCube(cubeList));
    }

    /**
     *
     * @param cubeList входной список кубов
     * @return уникальная коллекция
     */
    private static Collection unicomListCube(List<Cube> cubeList) {
        return new HashSet(cubeList);
    }
}
