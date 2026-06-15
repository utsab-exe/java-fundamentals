package com.datatypes;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll no : ");
        int roll_no = input.nextInt();
        System.out.println("Your roll no is " + roll_no);

        float marks = input.nextFloat();
        System.out.println("marks obtained = " + marks);

        String name = input.next();
        System.out.println("Hello, " + name);

        //here, next() takes the next word until a space while nextLine() takes thw whole_line as an input.

    }
}
