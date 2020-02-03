package com.company;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Dog is created");
    }

    @Override
    public String sleep() {
        return "A dog sleeps";
    }

    @Override
    public String eat() {
        return "A dog eats bones";
    }

    public String bark(){
        return "A dog barks....";
    }
}
