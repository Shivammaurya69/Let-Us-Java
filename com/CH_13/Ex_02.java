package com.CH_13;

class Ex{
    public void fun(){
        System.out.println("Inside Ex-fun()");
    }
    public void save(){
        System.out.println("Inside Ex-save()");
    }
    public void enc(){
        System.out.println("Inside Ex-enc()");
    }
    public void open(){
        System.out.println("Inside Ex-open()");
    }
}
class NewEx extends Ex{
    public void save(){
        System.out.println("Inside NewEx-save()");
    }
    public void enc(){
        System.out.println("Inside NewEx-enc()");
    }
    public void autoUpdate(){
        System.out.println("Inside NewEx-autoUpdate()");
    }
    public void open(){
        System.out.println("Inside NewEx-open()");
        super.open();
    }
}
public class Ex_02 {
    public static void main(String[] args) {
        NewEx e= new NewEx();
        e.fun();
        e.save();
        e.enc();
        e.autoUpdate();
        e.open();
    }
}
