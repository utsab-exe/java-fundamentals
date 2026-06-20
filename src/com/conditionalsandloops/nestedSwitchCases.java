package com.conditionalsandloops;

import java.util.Scanner;
public class nestedSwitchCases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> {
                System.out.println("Utsab Khadka");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department mentioned");
                }
            }
            case 2 -> {
                System.out.println("Subodh Chettri");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department mentioned");
                }
            }
            case 3 -> {
                System.out.println("Basanta Subedi");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department mentioned");
                }
            }
            default -> System.out.println("Enter correct emp ID");
        }

    }
}
