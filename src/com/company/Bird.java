package com.company;

public class Bird extends Animal {
        public Bird() {
            super();    // wheather super() is used or not the base class constructor will call the super class constructor
            System.out.println("A bird is hatched... note: super() is used");
        }


        @Override
        public String sleep() { // customized for this class polym
            return "A bird sleeps soundly...";
        }

        @Override
        public String eat() {// customized for this class polym
            return "A bird eats...";
        }


        public String fly() {
            //Birds can fly but other animals can't so this method
            //is unique to the Bird class
            return "A bird flies...";
        }
    }

