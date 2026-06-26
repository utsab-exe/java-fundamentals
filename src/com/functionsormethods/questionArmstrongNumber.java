package com.functionsormethods;

public class questionArmstrongNumber {
    public static void main(String[] args) {

        //Q: print all Armstrong numbers from 1 to 1000.
        for (int i = 1; i <= 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static Boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int rem = 0;
        while(n > 0) {
            rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

        return sum == originalNumber;
    }
}
