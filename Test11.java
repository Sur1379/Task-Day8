package com.company.TaskDay8;

public class Test11 {
    public static void main(String[] args) {
        int[] array = {1, 7, 9, 6, 5, 3, 4};
        int k;
        int n = array.length;
        if (array.length % 2 == 1) {
            n = n - 1;
        }
        for (int i = 0; i < n; i += 2) {
            k = array[i + 1];
            array[i + 1] = array[i];
            array[i] = k;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
