package com.company.JavaSysntax.Level5;

import java.util.Scanner;

public class AverageSomeNumber {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            int d = sc.nextInt();
            if(d == -1){
                break;
            }
            count++;
            sum += d;
        }

        System.out.println((float)sum / count);
    }
}
