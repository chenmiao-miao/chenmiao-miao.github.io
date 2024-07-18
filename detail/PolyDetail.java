package com.Exer08.poly.detail;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();

        animal.eat();//猫吃鱼..
        animal.run();//跑
        animal.show();//hello,你好
        animal.sleep();//睡

        System.out.println("=========");

        Cat cat = (Cat) animal;
        cat.catchMouse();

        System.out.println("=========");

//        Dog dog = (Dog) animal;
//        dog.ok();


    }
}
