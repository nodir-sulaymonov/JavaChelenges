package com.company.JavaSysntax.Level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String deb = reader.readLine();
        int rip = Integer.parseInt(deb);
        if (rip > 0){
            int[] a = new int[rip];
            int i = 0;
            while (i < rip){
                String step = reader.readLine();
                int lof = Integer.parseInt(step);
                a[i] = lof;
                i++;
            }
            int maximum = a[0];
            for (int value : a) {
                if (value >= maximum) {
                    maximum = value;
                }
            }
            System.out.println(maximum);
        }
    }
}
