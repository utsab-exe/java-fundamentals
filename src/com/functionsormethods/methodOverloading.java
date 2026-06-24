package com.functionsormethods;

// Two methods with same names can only exist if no. of arguments is different
// or type of arguments is different
public class methodOverloading {
    public static void main(String[] args) {
        fun(69);
        fun("Utsab");

        //This happens at compile time.

        int ans = sum(2,3);
        System.out.println(ans);

        ans = sum(2,3,4);
        System.out.println(ans);

//        ans = sum(); //this will give an error.
        //because it is in state of ambiguity.
        //compiler can't decide which function to run.
    }

    static int sum (int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
}
