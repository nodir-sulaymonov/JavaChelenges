package com.company.JavaSysntax.Level4;





import java.util.Scanner;

public class PosNegNumber {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int pos = 0;
        int neg = 0;
        if (num1 > 0 && num1 != 0) pos++;
        if (num1 < 0 && num1 != 0) neg++;
        if (num2 > 0 && num2 != 0) pos++;
        if (num2 < 0 && num2 != 0) neg++;
        if (num3 > 0 && num3 != 0) pos++;
        if (num3 < 0 && num3 != 0) neg++;
        System.out.println("количество отрицательных чисел: " + neg);
        System.out.println("количество положительных чисел: " + pos);
    }
}
