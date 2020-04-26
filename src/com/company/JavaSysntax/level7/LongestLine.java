package com.company.JavaSysntax.level7;

import java.util.ArrayList;
import java.util.Scanner;

/*
Самая длинная строка
*/

public class LongestLine {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        strings = new ArrayList<String>();


        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            strings.add(s);
        }
        int buf = strings.get(0).length();
        for (String string : strings) {
            if (string.length() > buf) {
                buf = string.length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if(strings.get(i).length() == buf){
                System.out.println(strings.get(i));
            }
        }

    }
}
