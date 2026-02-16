package com.itshaala.inheritance;

public class Demo9 {
    public static void main(String[] args) {
        class Parent {
            int a = 1;
            int b = 2;
        }

        class Child extends Parent {
            int a = 10;
            int b = 20;

            void print(int a, int b) {
                System.out.println("local variables");
                System.out.println(a + "\t" + b);//100 200

                System.out.println("child class variables");
                System.out.println(this.a + "\t" + this.b);//10 20

                System.out.println("parent class variables");
                System.out.println(super.a + "\t" + super.b);//1 2
            }
        }

        Child child = new Child();
        child.print(100, 200);
    }
}
