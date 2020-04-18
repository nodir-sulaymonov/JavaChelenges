package com.company.JavaSysntax.Level5;
/*
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.

*/
public class FightsCats {
    public static int count = 0;
    public static int fightCount = 0;

    public int age;
    public int weight;
    public int strength;

    public FightsCats() {
    }

    public boolean fight(FightsCats anotherCat) {
        int i = 0;
        int j = 0;
        if(this.age > anotherCat.age) i++;
        else if(this.age < anotherCat.age) j++;

        if(this.weight > anotherCat.weight) i++;
        else if(this.weight < anotherCat.weight) j++;

        if(this.strength > anotherCat.strength) i++;
        else if(this.strength < anotherCat.strength) j++;


        if(j < i) return true;
        else if(i < j) return false;
        else return false;
    }

    public static void main(String[] args) {


    }
}
