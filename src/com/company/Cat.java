package com.company;

/*
 * All Cats are Animals but all Animals are not Cats
 */
public class Cat extends Animal {

    public Cat() {
        //super();
        System.out.println("Now I am a Cat! note // Super()");
    }

    @Override
    public String sleep() {// customized for this class polym
        return "A cat sleeps...";
    }

    @Override
    public String eat() {// customized for this class polym
        return "A cat eats...";
    }

    public String purr() {// this is not an overriden method.
        return "purrr...";
    }

}
