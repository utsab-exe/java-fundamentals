package com.functionsormethods;

import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static Boolean isPrime(int n) {
        int c = 2;

        if(n <= 1){
            return false;
        }
        while(c < n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
