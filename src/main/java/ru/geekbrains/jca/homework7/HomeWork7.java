package ru.geekbrains.jca.homework7;

import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {
        catsAndBowls2_3();

        System.out.println("\n\nExercise4 \n");
        catsAndBowls4();


    }

    private static void catsAndBowls2_3() {
        Cat[] cats = {
                new Cat("Murzik", 10),
                new Cat("Barsik", 15),
                new Cat("Vaska", 80)
        };

        Bowl bowl = new Bowl(100);

        for (Cat cat : cats) {
            cat.eat2_3(bowl);
        }

        System.out.println("Finally int the bowl: " + bowl.getFoodAmount());


    }

    private static void catsAndBowls4() {
        Cat[] cats = {
                new Cat("Murzik", 10),
                new Cat("Barsik", 15),
                new Cat("Vaska", 80)
        };

        Bowl bowl = new Bowl(100);

        for (Cat cat : cats) {
            cat.eat4(bowl);
        }

        System.out.println("Finally int the bowl: " + bowl.getFoodAmount());


    }



}
