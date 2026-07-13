package com.arrays;

public class IntroToArrays {
    public static void main(String[] args) {
        //Q: Store a role number:
        int a = 19;


        //Q: Store a person's name.
        String name = "Utsab Khadka";

        //Q: Store 5 roll numbers:
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        //we can't do this for a larger no. of data, so we use arrays

        //Syntax of Arrays:
        // data_type[] variable_name = new data_type[size];

        //Store 5 roll no:
//        int[] rnos = new int[5];
//        //or directly iterate:
//        int[] rnos2 = {1,3,4,5,6};

        //Array is a collection of value of similar data-types.

        int[] ros; //declaration of array. ros is getting defined in the stack. //this is compile time.
        ros = new int[5]; // initialization: actually here object is being created in the memory(heap) //this is run time.

        //NEW keyword:
            //new keyword is just used to create an object.
    }
}
