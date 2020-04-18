package com.company.JavaSysntax.Level5;
/*- Имя,
        - Имя, вес, возраст
        - Имя, возраст (вес стандартный)
        - вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
        - вес, цвет, адрес (чужой домашний кот)

        Задача инициализатора - сделать объект валидным.
        Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
        Кот не может ничего не весить.
        То же касается возраста и цвета.
        А вот имени может и не быть (null).
        То же касается адреса: null.*/
public class CatInitiation {String name = null;
    String address = null;
    int age = 3;
    int weight = 3;
    String color = "Green";

    public void initialize(String name){
        this.name = name;
        this.weight = 10;
        this.color = "white";
        this.address = null;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
        this.address = null;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;

    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 10;
        this.name = null;
    }

    public static void main(String[] args) {

    }
}
