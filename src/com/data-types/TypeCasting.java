package com.utsab;

//manual conversion of data-types performed by the user
//larger fata-types --> smaller data-types
//known as explicit conversion or narrowing
//Syntax: (smaller data-type) value;

public class TypeCasting {
    public static void main(String[] args) {
        float number = 67.99f;
        int num = (int)number; //manual conversion from float --> int
        System.out.println(num);
    }
}
