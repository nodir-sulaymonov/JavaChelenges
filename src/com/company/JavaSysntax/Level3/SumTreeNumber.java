package com.company.JavaSysntax.Level3;

public class SumTreeNumber {
    /*
Сумма цифр трехзначного числа
// Метод sumDigitsInNumber вызывается с параметром 546.
*/

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sotni = number / 100;
        int chislo = number % 100;
        int desatki = chislo / 10;
        int edinich = number % 10;
        return edinich + sotni + desatki;
    }
}

