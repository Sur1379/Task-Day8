package com.company.TaskDay8;

public class Test15 {
    public static void main(String[] args) {
        int[] array = {1, 5, 1, 3, 2, 2, 4, 6, 6, 9};
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
                if (count == 1 && j == array.length - 1) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
