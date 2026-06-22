package com.functionsormethods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //System.out.println(num); //here num gives error because scope of num is in random method only.


        //Block scope
        {
//            int a = 56; //this gives error because we can't initialize same variable within its scope.
            a = 78; //but we can modify the value of initialized variable.
            // this reassign the origin reference to some other value.
            int c = 29;
            //value initialized inside a block, remains inside the block.
        }

        System.out.println(a); //prints 78;


        //scoping in for loops:

        for(int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90;
//            int a = 10; //can't initialize a again as it it is already initialized in this main scope.
        }
//        System.out.println(i); //from outside, can't access any variable initialized in the loops
    }

    //Anything initialized outside the block can be accessed inside block but cant be re-initialized.
    //But anything initialized inside a block, can be re-initialized outside but can't be accessed outside.

    static void random(){
        // System.out.println(a); //gives error because a doesn't exist in random method.
        int num = 67;
    }
}
