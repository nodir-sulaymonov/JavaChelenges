package com.company.JavaSysntax.level7;
/*
Один большой массив и два маленьких
*/

import java.util.Arrays;
import java.util.Scanner;

public class OnebigTwosmalArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[20];
        int [] num1 = new int[10];
        int [] num2 = new int[10];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        int[] newArray = Arrays.copyOfRange(arr, 0, 10);
//        int[] newArray1 = Arrays.copyOfRange(arr, 10, 20);

        for (int i = 0; i <arr.length / 2 ; i++) {
            num1[i] = arr[i];
        }
        for (int i = arr.length/2; i <arr.length ; i++) {
            num2[i - 10] = arr[i];
        }
        for (int value : num2) {
            System.out.println(value);
        }
    }
}

