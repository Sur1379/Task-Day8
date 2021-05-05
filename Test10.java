package com.company.TaskDay8;

public class Test10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k;
        int j = 9;
        for (int i = 0; i < array.length / 2; i++) {
            k = array[i];
            array[i] = array[j];
            array[j] = k;
            j--;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

