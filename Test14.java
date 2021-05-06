package com.company.TaskDay8;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 4, 7, 8, 5, 6, 1, 2};
        System.out.println("input index to remove");
        int index = scanner.nextInt();
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

