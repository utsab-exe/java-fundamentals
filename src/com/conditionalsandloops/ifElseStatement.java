package com.conditionalsandloops;

import com.datatypes.SumOfTwoNumbers;

import java.sql.SQLOutput;

/*

syntax of if-else statements:
    if(condition){
        do this;
    }
    else{
        do this;
    }

*/
public class ifElseStatement {
    public static void main(String[] args) {
        //example:
        int salary = 25400;
        if(salary > 10000){
            salary = salary + 2000;
        }
        else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
