package com.company.JavaSysntax.Level5;
/*Консоль-копилка
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PageBank {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            String lip = buffer.readLine();
            if (lip.equals("сумма")){
                break;
            }
            int lop = Integer.parseInt(lip);
            sum += lop;
        }
        System.out.println(sum);
    }
}
