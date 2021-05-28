package com.company.TaskDay8;

public class Test17 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 1};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                if (i == array.length - 2) {
                    System.out.println("Sorted array");
                }
            } else {
                System.out.println("Not sorted array");
                break;
            }
        }

    }
}
