// package com.company;

class A{
    public void meth2(){
        System.out.println("I am a method of class A");

    }
}
class B extends A{
    public void meth2(){
        System.out.println("I am a method of class B");
    }
    public void meth3(int a){
        System.out.println("The result is method overriding");
    }
}
public class CWH_overriding {
    public static void main(String[] args){
        A a= new A();
        a.meth2();
        B b= new B();
        b.meth2();
        b.meth3(5);

    }
}
