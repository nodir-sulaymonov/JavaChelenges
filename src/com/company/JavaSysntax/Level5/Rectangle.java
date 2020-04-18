package com.company.JavaSysntax.Level5;

/*Собираем прямоугольник
        Примеры:
        - заданы 4 параметра: left, top, width, height
        - ширина/высота не задана (оба равны 0)
        - высота не задана (равно ширине) создаём квадрат
        - создаём копию другого прямоугольника (он и передаётся в параметрах)*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public  Rectangle(Rectangle p) {
        this(p.left, p.top, p.width, p.height);
    }

    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize(int top){
        this.top = top;
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public static void main(String[] args) {

    }
}
