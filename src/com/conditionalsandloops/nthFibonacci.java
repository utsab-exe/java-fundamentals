package com.conditionalsandloops;


import java.util.Scanner;
public class nthFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n number to find its fibonnaci: ");
        int n = in.nextInt();
        if(n == 0) {
            System.out.println(0);
        }else if(n == 1) {
            System.out.println(1);
        }else{
            int a = 0;
            int b = 1;
            int count = 2;

            while(count <= n) {
                int temp = a+b;
                a = b;
                b = temp;
                count++;
            }

            System.out.println(b);
        }
        }
}
