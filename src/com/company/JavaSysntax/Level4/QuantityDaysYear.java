package com.company.JavaSysntax.Level4;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuantityDaysYear {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int num = Integer.parseInt(input);
        int x = 366;

        if (num % 400 == 0 && (num % 100 == 0)){
            System.out.println("количество дней в году: " + x);
        }
        else if((num % 100 == 0)){
            System.out.println("количество дней в году: " + (x -1));
        }
        else if (num % 4 == 0){
            System.out.println("количество дней в году: " + x);
        }
        else {
            System.out.println("количество дней в году: " + (x -1));
        }
    }
}
