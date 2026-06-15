package com.datatypes;

public class AutomaticTypePromotion {
    public static void main(String[] args) {
        int a = 257;
        byte b = (byte) a;
        System.out.println(b);
    }
}

