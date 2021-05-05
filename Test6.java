package com.company.TaskDay8;

public class Test6 {
    public static void main(String[] args) {

        int[] array = {-1, 5, 9, 2, -1, 8};
        int i = 0;
        int max = array[i];
        for (i = 0; i < 5; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        System.out.print("largest num = " + max);
        for (i = 0; i < 5; i++) {
            if (max == array[i]) {
                System.out.println(" index = " + i);
                break;
            }
        }
    }
}
