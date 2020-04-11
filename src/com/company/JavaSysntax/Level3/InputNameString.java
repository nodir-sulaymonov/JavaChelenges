package com.company.JavaSysntax.Level3;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class InputNameString {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year = reader.readLine();
        int yeaR = Integer.parseInt(year);
        System.out.println(name + " захватит мир через " + yeaR + "лет. Му-ха-ха!");
    }

}


