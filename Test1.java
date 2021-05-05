package com.company.TaskDay8;

import java.util.Scanner;
import java.util.SortedMap;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int N = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int i = 0;
        while (i < N) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }i++;
        }

//        for(int i = 0; i < N; i++){
//          if (){}
//            System.out.println(array[i]);
//        }
//        int j = 1;
//        for (int i = 0; i < N ; i++) {
//            while(j<=N){
//                array[i] = j;
//                if( i % 2 == 0){
//                    System.out.println(array[i]);
//                }j++;
//                break;
//            }
//        }
    }
}
