package com.company;

import com.company.Animal;

public class AnimalApp {
    public static void main(String[] args) {
// What just happened? Comment your understanding of object-oriented programming from the four classes created above. Where is the method executing encapsulation? Inheritance? Or polymorphism?
//
//Create 2 more animal classes (i.e. Dog, Mouse, etc.) and extend the animal class to verify your understanding
        // Animal class created
        Animal a = new Animal();// animal object called a is created using constructor
        print(a.eat());         // a calls eat from animal class
        print(a.sleep());       // a calls spleep from animal class

        Cat c = new Cat();     // Cat c is created using its own class constructor
        print(c.eat());        // c calls it's own overriden eat methods - polymorphizm happened
        print(c.sleep());      // c  calls its own overriden sleep methods - polymorphism
        print(c.purr());       // c calls its own additional method calles


        Bird b = new Bird(); // Bird b is created using its own class constructor
        print(b.eat());      // b calls it's own overriden eat methods - polymorphizm happened
        print(b.sleep());    // b  calls its own overriden sleep methods - polymorphism
        print(b.fly());      // b calls its own overriden sleep methods - polymorphism

        Dog d = new Dog();     // Dog d is created using its own class constructor
        print(d.eat());        // d calls it's own overriden eat methods - polymorphizm happened
        print(d.sleep());      // d  calls its own overriden sleep methods - polymorphism
        print(d.bark());       // d calls its own additional method calles


        Mouse m = new Mouse(); // Mouse m is created using its own class constructor
        print(m.eat());      // m calls it's own overriden eat methods - polymorphizm happened
        print(m.sleep());    // m  calls its own overriden sleep methods - polymorphism
        print(m.sense());      // m calls its own overriden sleep methods - polymorphism

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
