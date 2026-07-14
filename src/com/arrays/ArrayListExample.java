package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    //We use arraylist when we don't know the amount of elements to be listed inside.
    // basically ArrayList can handle any number of elements inside it.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax:
        ArrayList<Integer> list = new ArrayList<Integer>(10); //here list is just a ref-variable that is pointing towards a new ArrayList.

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println(list.contains(5)); //to check whether it contains 6 or not. returns boolean value.

        System.out.println(list);

        list.set(0,99); //updating the 0th index to 99.
        System.out.println(list);

        list.remove(0); //removing the 0th index
        System.out.print(list);


        // input:
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index:
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //list[index] wont work here. we need to use get method.
        }

    }
}
