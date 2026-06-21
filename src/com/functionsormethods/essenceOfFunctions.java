package com.functionsormethods;

import java.util.Scanner;

public class essenceOfFunctions {
    public static void main(String[] args) {
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        sum();
        // we can call as much time as we want.
    }

    //methods are always defined outside the main function.
    static void sum () {
        Scanner in = new Scanner(System.in);
        int n1, n2, sum;

        System.out.print("enter number 1: ");
        n1 = in.nextInt();

        System.out.print("enter number 2: ");
        n2 = in.nextInt();

        sum = n1 + n2;
        System.out.println("Sum = " + sum);

    }


//        Scanner in = new Scanner(System.in);
//        int n1, n2, sum;
//        //Q : take input of two numbers and print the sum.
//        System.out.print("enter number 1: ");
//        n1 = in.nextInt();
//
//        System.out.print("enter number 2: ");
//        n2 = in.nextInt();
//
//        sum = n1 + n2;
//        System.out.println("Sum = " + sum);

        //Lets suppose we ought to do this sum about a 100 times we won't just copy and paste
        //we make a method for the sum which can be used later again and again.

        //Method is a block of code which performs a certain task after we call it.

        /*

        Syntax of methods in Java:

        return_type name() {
            //body
            return statement;
        }

        */

}
