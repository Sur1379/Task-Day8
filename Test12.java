package com.company.TaskDay8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i -= 1) {
            array[i] = array[i - 1];
        }
        array[0] = n;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
//        System.out.println(Arrays.toString(array));
        }
    }
}


