package com.Exer08.poly;

import java.sql.SQLOutput;

public class PloyMethod {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.sum(1,5));
        System.out.println(a.sum(1,5,6));

        //
        B b=new B();
        a.say();
        b.say();

    }


}

class B {//父类

    public void say() {
        System.out.println("Bsay()方法被调用...");
    }
}

class A extends B {//子类

    public int sum(int n1, int n2) {//和下面sum构成重载
        return n1 + n2;
    }

    public int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}