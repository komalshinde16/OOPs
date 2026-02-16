package com.itshaala.inheritance;

public class Demo8 {
    public static void main(String[] args) {
        class Parent{
            Parent(){
                System.out.println("parent class :: constructor");
            }
        }
        class Child extends Parent{
            Child(){
                super();
                System.out.println("child class :: construcyor");
            }
        }
        Child child = new Child();
    }
}
