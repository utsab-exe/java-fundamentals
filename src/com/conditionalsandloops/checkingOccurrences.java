package com.conditionalsandloops;

public class checkingOccurrences {
    public static void main(String[] args) {
        int n = 1385757879;

        //Q: check the occurrence of 7 in above number.
        int rem = 0;
        int count = 0;
        while(n > 0) {
            rem = n % 10;
            if (rem == 7) {
                count += 1;
            }
            n = n/10;
        }
        System.out.println("Total occurrence of 7 = " + count);
    }
}
