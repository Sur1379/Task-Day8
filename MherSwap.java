package com.company.TaskDay8;

import java.util.Arrays;

public class MherSwap {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int j = 1;
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int k = array[i];
            array[i] = array[array.length - j];
            array[array.length - j] = k;
            j++;
        }
        System.out.println(Arrays.toString(array));
    }
}
