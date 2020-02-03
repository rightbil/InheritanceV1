package com.company;

public class Mouse extends Animal {
    public Mouse() {
        super();
        System.out.println("Now I am a mouse note Super is used");
    }

    @Override
    public String sleep() {
        return "mouse sleeps";
    }

    @Override
    public String eat() {
        return "mouse eats";
    }
    public String sense(){
        return "mouse senses deep sounds ";
    }
}
