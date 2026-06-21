package com.functionsormethods;

import java.util.Scanner;
public class returnTypesAndArguments {

    //return_type example
    //here static int sum() must return an integer value otherwise it will give error
    //return sum returns the sum to the main function, and is stored in a referenceVariable ans.

    public static void main(String[] args) {
//        int ans = sum();
//        System.out.println("Sum = " + ans);

        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int product = product(num1, num2);
//        System.out.println("Product of " + num1 + " & " + num2 + " = " + product);


        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println(greeting(name));




    }
    static int sum() {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = n1 + n2;
        return sum;
    }

    //Arguments passing in Function

    static int product (int a, int b) {
        int product = a * b;
        return product;
    }

    //lets take a String example

    static String greeting(String name) {
        String greeting = "hello " + name;
        return greeting;
    }
}
