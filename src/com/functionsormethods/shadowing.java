package com.functionsormethods;

//Shadowing is basically concept of using two variables with a same name within the scope that overlaps.

public class shadowing {
    static int x = 90; //this will be initialized for all over its block.
    //this will be shadowed at line 14.
    public static void main(String[] args) {
        System.out.println(x); //print 90
        int x;// //class variable at line 6 is shadowed by this.
//        System.out.println(x); //scope will only begin when value is initialized.
        //otherwise there'll be error in between declaration and initialization.
        x = 40;
        System.out.println(x); //print 40
        fun();
    }

    static void fun() {
        System.out.println(x); //print 90
    }
}
