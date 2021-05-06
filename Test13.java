package com.company.TaskDay8;

import java.util.Arrays;

public class Test13 {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 8, 9, 5, 6};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int k = 0;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                k = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                j = i;
            }
        }int n = array[j];
        array[j] = array[k];
        array[k] = n;
        System.out.println(Arrays.toString(array));
    }
}