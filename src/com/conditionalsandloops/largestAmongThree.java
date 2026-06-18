package com.conditionalsandloops;

import java.util.Scanner;

public class largestAmongThree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2, num3;
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        System.out.print("Enter third number: ");
        num3 = in.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("greatest number = " + num1);
        } else if(num2 > num3) {
            System.out.println("greatest number = " + num2);
        } else{
            System.out.println("greatest number = " + num3);
        }
    }
}
