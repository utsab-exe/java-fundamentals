package com.conditionalsandloops;

import java.util.Scanner;
public class swichCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        Switch Cases in Java:

        Syntax:
        switch(expression){
            //cases:
            case one:
                //do something
                break;
            case two:
                //do something
                break;
            default:
                //do something
        }
        */

        String fruits;
        fruits = in.next();

        switch (fruits) {
            case "Apple" :
                System.out.println("a red fruit");
                break;
            case "Mango" :
                System.out.println("a yellow fruit");
                break;
            case "Grape" :
                System.out.println("small green fruits");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }

    }
}
