package com.company.TaskDay8;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {-1, 5, -7, 2, -1, 9};
        for (int i = 0; i < 5 ; i++) {
            if(array[i] >= 0 && array[i+1] >= 0){
                System.out.println(array[i]+" "+array[i+1]);
            break;}
            if(array[i] < 0 && array[i+1] < 0){
                System.out.println(array[i]+" "+array[i+1]);
            break;}
        }
    }
}
