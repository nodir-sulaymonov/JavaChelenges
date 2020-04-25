package com.company.JavaSysntax.level6;
/*
Чётные и нечётные циферки
*/

import java.io.IOException;
import java.util.Scanner;

public class EvenNoteven {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int drep = sc.nextInt();
        int rest = 0;
        while (drep != 0) {
            rest = drep % 10;
            drep = drep / 10;
            if (rest % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}

