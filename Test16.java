package com.company.TaskDay8;

import java.util.Arrays;

public class Test16 {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 1, 0, 0, 1};
        int count = 0;
        int i = 0;
        while (count < array.length - 1) {
            count++;
            if (array[i] == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}