package com.company.JavaSysntax.level7;
import java.io.IOException;
import java.util.Scanner;

/*
Массивный максимум
*/

public class ArrayMax {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        Scanner sc =  new Scanner(System.in);
        int [] drop = new int[20];
        for (int i = 0; i <drop.length ; i++) {
            drop[i] = sc.nextInt();
        }
        return drop;
    }

    public static int max(int[] array) {
        int man = array[0];
        for (int value : array) {
            if (man < value) {
                man = value;
            }
        }
        return man;
    }
}
