package com.arrays;

public class IndexOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]); //index of array starts from zeroth index.
        System.out.println(arr[1]); //prints the second element of arr.

        int[] arr2 = new int[5]; //this automatically creates an array with 5 zeros.
        System.out.println(arr2[0]);

        String[] names = new String[5];
        System.out.println(names[1]); //this will return null.

        //null in java:

//        null a = null;
        //we can't do this.
        //its a literal in java.

        String a = null; //this is valid.
        //but we cant assign it to any primitives.
//        int a = null; //this is invalid.

        //null is just a value which can be assigned to any reference variable.
        //its just a by-default value a reference variable is pointing towards.
    }
}
