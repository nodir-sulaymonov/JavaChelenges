package com.company.JavaSysntax.level7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Играем в Jолушку
*/

public class NumberDivision {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> num3 = new ArrayList<Integer>();
        ArrayList<Integer> num4 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            num1.add(sc.nextInt());
        }
        Collections.sort(num1);
        for (int i = 0; i < num1.size(); i++) {
            if(num1.get(i)%3 == 0){
                num2.add(num1.get(i));
            }
            if(num1.get(i)%2 == 0){
                num3.add(num1.get(i));
            }
            if(num1.get(i)%3 != 0 && num1.get(i)%2 != 0) {
                num4.add(num1.get(i));
            }
        }

        printList(num2);
        printList(num3);
        printList(num4);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
