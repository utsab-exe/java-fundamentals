package com.conditionalsandloops;

import java.util.Scanner;
public class switchProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();


//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter a valid day.");
//        }

        // to find weekdays and weekends:
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }

    }
}
