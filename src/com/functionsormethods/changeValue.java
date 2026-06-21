package com.functionsormethods;

import java.util.Arrays;

public class changeValue {

    static void change(int[] arr) {
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

        /*
        array is an object in java.
        hence, java possess a copy of the reference to the array.

        Both references point to the same array elements.
        actual ref --> {1,2,3,4,5}
        copy ref --> {1,2,3,4,5}

        hence, change in one does affect other.


        But, changing the copy reference itself won't affect the actual reference.

        example:

        static void change(int[] arr) {
            arr = new int[](9,9,9);
        }

        this won't modify the actual reference.
        after this:
        actual ref --> {1,2,3,4,5}
        copy ref --> {9,9,9}

        */

}
