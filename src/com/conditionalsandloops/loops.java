package com.conditionalsandloops;

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        // Q: print numbers from 1 to 5.

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

        // this is not a right way to do, if a task is to do be done repeatedly.

        //HERE COMES THE CONCEPT OF LOOPS :
        //there are three types of loops;

        //no.1
        /*
        Syntax of for loops:

        for (initialization; condition; increment/decrement) {
            //body
        }

        */

        // Q: print numbers from 1 to 5.
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }


        //no.2
        /*
        Syntax of while loops:

        while(condition) {
            //body
        }
        in while loops the initialization takes place before the loop, and increment/decrement is done
        within the loop.
        */

        //Q: print the even numbers from 1 to 100
        int i = 1;

        while(i <= 100) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        //no. 3

        /*

        Syntax of do-while loops:

        do{
            //body
        } while(condition);

        this type of loops execute the body at least once and only checks the condition for the second iteration.

        */

        //Q: Take input from user unless they press x.
        Scanner in = new Scanner(System.in);
        int ch;
        do{
            System.out.print("Enter a number(to quit enter 7) : ");
            ch = in.nextInt();
        }while(ch != 7);
        System.out.println("Program terminated");
        in.close();
    }
}
