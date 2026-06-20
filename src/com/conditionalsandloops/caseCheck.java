package com.conditionalsandloops;

import java.util.Scanner;
public class caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // to obtain the first letter of a word we can do:

        /*
        String word;
        System.out.println(in.next().trim().charAt(0));
        */

        System.out.print("Enter a word: ");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase word");
        }else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("uppercase word");
        }else{
            System.out.println("not an alphabet");
        }
    }
}
