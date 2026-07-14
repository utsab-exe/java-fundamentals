package com.arrays;

public class maximumItem {
    public static void main(String[] args) {
        int[] arr = {44, 77, 23, 89, 167};

        System.out.println(maxItem(arr));
        System.out.println(maxRange(arr, 0, 2));
    }
    //imagine that array isn't empty
    static int maxItem(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //work on edgecases here, like array being null.
    static int maxRange(int[] arr, int start, int end) {

        if (end < start) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }
        int maxVal = arr[start];

        for (int i = start+1; i <=end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
