package com.functionsormethods;

import java.util.Scanner;

class checkPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(is_prime(n));

    }

    static boolean is_prime(int n) {
        int c = 2;
        if(n <= 1) {
            return false;
        }

        while(c*c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
