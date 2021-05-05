package com.company.TaskDay8;

import java.sql.Array;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input N");
        int N = scanner.nextInt();
        int[] array = new int[N];
        int j = 1;
        for (int i = 0; i < N; i++) {
            while (j <= N) {
                array[i] = j;
                if (j % 2 == 0) {
                    System.out.println(array[i]);
                }
                j++;
                break;
            }
        }

    }
}

