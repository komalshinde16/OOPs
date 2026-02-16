package com.itshaala.inheritance;

public class Demo10 {
    public static void main(String[] args) {
        class Parent{
            int a = 1;
            int b = 2;
        }
        class Child extends Parent{
            int a = 10;
            int b = 20;
        }
        Parent parent = new Parent();
        System.out.println(parent.a);
        System.out.println(parent.b);
    }
}
