package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int number : arr) { //here number represents the element of array
//            System.out.print(number + " ");
//        }

        String[] names = new String[5];
        for(int i = 0; i < names.length; i++) {
            names[i] = in.next();
        }

        System.out.print(Arrays.toString(names));
    }
}
