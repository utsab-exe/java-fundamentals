package com.conditionalsandloops;

import java.util.Scanner;
public class enhanceSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits) {
            case "Apple" -> System.out.println("a red fruit");
            case "Mango" -> System.out.println("a yellow fruit");
            case "Grape" -> System.out.println("small green fruits");
            default -> System.out.println("please enter a valid fruit");
        }
    }
}
