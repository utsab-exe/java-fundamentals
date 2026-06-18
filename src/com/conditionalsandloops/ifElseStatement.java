package com.conditionalsandloops;
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

        // multiple if-else statements:
        if(salary > 10000) {
            salary += 2000;
        } else if(salary > 20000) { //if the first condition is false, then this is checked.
            salary += 3000;
        } else{
            salary += 1000;
        }
    }
}

