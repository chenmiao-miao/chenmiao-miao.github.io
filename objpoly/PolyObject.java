package com.Exer08.poly.objpoly;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.cry();

        System.out.println("===========");

        animal = new Dog();
        animal.cry();

        System.out.println("===========");

        animal = new Cat();
        animal.cry();

    }
}
