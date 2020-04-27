package com.company.JavaSysntax.level7;

import java.io.IOException;
import java.util.ArrayList;;
import java.util.Scanner;

/*
Проверка на упорядоченность
*/
public class OrderleesNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i).length() > list.get(i + 1).length()){
                System.out.println(i+1);
                break;
            }
            else {
                System.out.println("");
            }
        }
    }
    // Sorting
//    private static void sortStringListByLength(ArrayList<String> list) {
//        System.out.println("-- sorting list of string --");
//        list.sort(Comparator.comparing(String::length));
//        //list.forEach(System.out::println);
//    }
}
