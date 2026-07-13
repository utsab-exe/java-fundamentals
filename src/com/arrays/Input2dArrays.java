package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Input2dArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            //for each col of the row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //printing the elements of the array:
        int row = 0;
        while(row < arr.length) {
            int col = 0;
            while(col < arr[row].length) {
                System.out.print(arr[row][col] + " ");
                col++;
            }
            System.out.println();
            row++;
        }

    }
}
