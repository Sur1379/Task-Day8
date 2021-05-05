package com.company.TaskDay8;

public class Test4 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 7, 7, 9};
        for (int i = 0; i < 5; i++) {
            if(array[i] < array[i+1]){
                System.out.println(array[i+1]);
            }
        }
    }
}
