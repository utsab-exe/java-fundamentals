package com.functionsormethods;

import java.util.Arrays;

//Variable length Arguments
public class varArguments {
    public static void main(String[] args) {

            fun(23, 12, 14, 190, 45, 82, 91);
            multiple(1,2, "Utsab", "Basanta", "Subodh");

    }
    //when we don't know how much variable to pass in a method.
    static void fun(int ...v) { //here v will be explicitly declared as an array of int.

        System.out.println(Arrays.toString(v));

    }

    //This is also possible.
    static void multiple(int a, int b, String ...u) {
        System.out.println(a + " " + b + " " + Arrays.toString(u));
    }

    //The variable length arguments should always come at last.
//    static void errorCheck(int a, int ...v, int b) {
//        //This will give an error.
//        //Because the compiler wont know when to initialize b. because v could be of any length..
//    }

}
