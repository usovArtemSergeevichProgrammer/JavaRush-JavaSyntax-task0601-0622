package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat grandFather = new Cat(grandFatherName);
        Cat grandMother = new Cat(grandMotherName);
        Cat catFather = new Cat(fatherName,grandFather,null);
        Cat catMother = new Cat(motherName,null,grandMother);
        Cat catSon = new Cat(sonName,catFather,catMother);
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentFather;
        private Cat parentMother;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

        @Override
        public String toString() {
            if (parentFather == null && parentMother == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (parentFather != null && parentMother != null) {
                return "The cat's name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
            } else if (parentFather != null) {
                return "The cat's name is " + name + ", no mother, father is " + parentFather.name;
            } else {
                return "The cat's name is " + name + ", mother is " + parentMother.name + ", no father";
            }
        }
    }

}
