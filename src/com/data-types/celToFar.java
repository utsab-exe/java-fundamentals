package com.utsab;

import java.util.Scanner;
public class celToFar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float celsius = input.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius +" C = " + fahrenheit + " F");
    }
}
