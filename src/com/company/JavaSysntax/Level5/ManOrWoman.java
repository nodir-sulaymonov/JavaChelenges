package com.company.JavaSysntax.Level5;

public class ManOrWoman {

    public static void main(String[] args) {

        Man man = new Man("Tom", 23, "Moskow");
        Man man1 = new Man(12, "Sara", "Narniya");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        Woman wm = new Woman("London", "Rita", 23);
        Woman wm1 = new Woman(33, "Monica", "Leningrad");
        System.out.println(wm.name + " " + wm.age + " " + wm.address);
        System.out.println(wm1.name + " " + wm1.age + " " + wm1.address);

    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Man(int age, String name, String address) {
            this.age = age;
            this.name = name;
            this.address = address;
        }
        public Man(String address, String name, int age) {
            this.address = address;
            this.name = name;
            this.age = age;
        }

    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(int age, String name, String address) {
            this.age = age;
            this.name = name;
            this.address = address;
        }

        public Woman(String address, String name, int age) {
            this.address = address;
            this.name = name;
            this.age = age;
        }
    }
}
