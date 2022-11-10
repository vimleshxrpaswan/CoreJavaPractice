package com.abcd;

public class A {
    protected int i;

}
class B extends A{
    public void show(){
        System.out.println(i); //i declared in A class as protected

    }
}
