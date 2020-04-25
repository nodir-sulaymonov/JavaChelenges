package com.company.JavaSysntax.level6;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/

public class NumberAscending {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr []  = new int[5];
        for (int j = 0; j < arr.length; j++) {
            int d = Integer.parseInt(reader.readLine());
            arr[j] = d;
        }
        boolean isSorted = true;
        while (isSorted){
            int buff;
            for (int i = 0; i <arr.length - 1 ; i++) {
                if (arr[i] > arr[i + 1]){
                    buff = arr[i];
                    arr[i] = arr[i+1];
                    arr[i + 1] = buff;
                    isSorted = false;
                }
            }
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
