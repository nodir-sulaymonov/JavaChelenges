package com.company.JavaSysntax.level7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Самые-самые
*/
public class theMostMost {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }
        int min = list.get(0).length();
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                minIndex = i;
            }
        }
        int max = list.get(0).length();
        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                maxIndex = i;
            }
        }

        if (minIndex > maxIndex) {
            System.out.println(list.get(maxIndex));
        } else {
            System.out.println(list.get(minIndex));
        }
    }
}
