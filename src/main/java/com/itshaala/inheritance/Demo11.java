package com.itshaala.inheritance;

public class Demo11 {
    public static void main(String[] args) {
        class Parent {
            int a = 1;
            int b = 2;

            void m1() {
                System.out.println("m1 from Parent class");
            }
            void m2() {
                System.out.println("m2 from Parent class");
            }
        }
        class Child extends Parent {
            int a = 10;
            int b = 20;

            void m1() {
                System.out.println("m1 from child class");
            }

        }

        Child child = new Child();
        System.out.println(child.a);
        System.out.println(child.b);
        child.m1();
        child.m2();
    }
}




//Java first checks → “Does Child have m1()?”
//        ✅ Yes → So it runs Child m1().
//
//Java checks → “Does Child have m2()?”
//        ❌ No → So it goes to Parent and runs Parent m2().
//
//        👉 Java always first looks inside the Child class, then Parent if not found.
