package com.company.TaskDay8;

public class Test8 {
    public static void main(String[] args) {
        int[] array = {1, 1, 5, 4, 6, 3, 3, 7};
        int count = 1;
        int i = 0;
        for (int j = 1; j < 8; j++) {
            if (array[i] != array[j]) {
                count++;
                array[i] = array[j];
            }
        }
        System.out.println(count);
    }
}

