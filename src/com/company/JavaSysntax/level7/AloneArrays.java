package com.company.JavaSysntax.level7;
/*
Общение одиноких массивов
*/

import java.util.Scanner;

public class AloneArrays {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String [] str = new String[10];
        int [] num = new int[10];
        for (int i = 0; i < str.length ; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i <str.length ; i++) {
            num[i] = str[i].length();
        }
        for (int value : num) {
            System.out.println(value);
        }
    }
}
