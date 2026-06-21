package com.functionsormethods;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        //this doesn't swap the numbers, but why?
        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Utsab Khadka";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) { // Strings are immutable, hence no change occurs
        name = "Basnata Subedi";
    }


    static void swap(int a, int b) {

        /*
        Java is all about pass by value, pass by reference doesn't exist in Java.
        in case of primitives:
        Examples: int, char, double, boolean, float, short, long, byte

        the copy of the actual value is passed to the method.
        a --> 10
        b --> 20
        a (copy) --> 10
        b (copy) --> 20

        after swapping, we get:
        a (copy) --> 20
        b (copy) --> 10

        but the actual values remain unchanged hence, we can't modify primitives using method without returning it.
        */
        int temp = a;
        a = b;
        b = temp;
    }
}
