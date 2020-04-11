package com.company.JavaSysntax.Level4;


import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class TrafficLightTransition {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ar = reader.readLine();
        double a = Double.parseDouble(ar);

        if (a  % 5 >= 0 && (a % 5) < 3){
            System.out.println("зелёный");
        }
        else if(a % 5 >= 3 && a % 5 < 4){
            System.out.println("жёлтый");
        }
        else if(a % 5 >= 4){
            System.out.println("красный");
        }
    }
}