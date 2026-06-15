package com.utsab;

//automatic conversion done by the java-compiler itself
//small data-type --> large data-type
//known as implicit conversion or widening

public class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        double b = a; //automatic conversion from int --> double
        System.out.println(b);
    }
}
