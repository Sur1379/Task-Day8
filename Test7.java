package com.company.TaskDay8;

public class Test7 {
    public static void main(String[] args) {
        int[] array = {-1, 5, 4, -8, -9, 51, 1};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            if (array[i] > 0) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        }
        System.out.println(min);

    }

}

