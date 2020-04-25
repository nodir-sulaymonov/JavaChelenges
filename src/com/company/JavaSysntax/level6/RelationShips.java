package com.company.JavaSysntax.level6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class RelationShips {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfName = reader.readLine();
        Cat catGrandDad = new Cat(grandfName);

        String grandmName = reader.readLine();
        Cat catGrandM = new Cat(grandmName);

        String DadName = reader.readLine();
        Cat catDad = new Cat(DadName, catGrandDad, null);

        String MomName = reader.readLine();
        Cat catMom = new Cat(MomName, null, catGrandM);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, catDad, catMom);

        String GirlName = reader.readLine();
        Cat catGirl = new Cat(GirlName, catDad, catMom);

        System.out.println(catGrandDad);
        System.out.println(catGrandM);
        System.out.println(catDad);
        System.out.println(catMom);
        System.out.println(catSon);
        System.out.println(catGirl);



    }

    public static class Cat {
        private String name;
        private Cat parentDad;
        private Cat parentMother;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentDad, Cat parentMother) {
            this.name = name;
            this.parentDad = parentDad;
            this.parentMother = parentMother;
        }


        @Override
        public String toString() {
            if(parentDad == null && parentMother == null){
                return "The cat's name is " + name + ", no mother, no father ";
            }
            else if(parentMother == null){
                return "The cat's name is " + name + ", no mother, father is " + parentDad.name;
            }
            else if(parentDad == null){
                return "The cat's name is " + name + ", mother is " + parentMother.name + " no father ";
            }
            else if(name!= null){
                return "The cat's name is " + name + ", mother is " + parentMother.name + " father is " + parentDad.name;
            }
            else {
                return "The cat's name is " + name + ", mother is " + parentMother.name + " father is " + parentDad.name;
            }
        }
    }

}

