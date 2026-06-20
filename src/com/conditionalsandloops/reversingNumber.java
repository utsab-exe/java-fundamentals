package com.conditionalsandloops;

public class reversingNumber {
    public static void main(String[] args) {
        int n = 12321;
        int originalNum = n;
        int rev = 0, rem = 0;
        while(n > 0) {
            rem = n % 10;
            rev = rev*10 + rem;
            n = n/10;
        }

        System.out.println("Reversed number = " + rev);

        // to check a palindrome number, logic is same..
        if(originalNum == rev) {
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not a Palindrome number");
        }
    }
}
