package com.conditionalsandloops;

import java.util.Scanner;
public class fibonnaciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n upto which you want fibonacci series: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print(a + " " + b + " ");

        while(count <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.print(b + " ");
            count++;
        }
    }
}
