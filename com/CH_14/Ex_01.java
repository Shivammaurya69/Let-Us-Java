package com.CH_14;

abstract class Vehicle {
    public abstract void speed();

    public void maintenance() {
        System.out.println("In maintenance of FourWheeler hiii");
    }

//    public abstract void value();
}

class FourWheeler extends Vehicle {

    public void speed() {
        System.out.println("In Speed of FourWheeler");
    }
    public void maintenance() {
        System.out.println("In maintenance of FourWheeler");
        super.maintenance();
    }
//    public void value() {
//        System.out.println("In Value of FourWheeler");
//    }
}

class TwoWheeler extends Vehicle {
    public void speed() {
        System.out.println("In Speed of TwoWheeler");
    }

    public void maintenance() {
        System.out.println("In maintenance of TwoWheeler");
    }
//    public void value() {
//        System.out.println("In Value of TwoWheeler");
//    }
}
 class Airborne extends Vehicle{
      public void speed() {
        System.out.println("In Speed of Airborne");
    }
    public void maintenance() {
        System.out.println("In maintenance of Airborne");
    }
//    public void value() {
//        System.out.println("In Value of Airborne");
//    }
}

public class Ex_01 {
    public static void main(String[] args) {
        Vehicle maruti, bajaj, jumbo;
        maruti = new FourWheeler();
        bajaj=new TwoWheeler();
        jumbo= new Airborne();

        maruti.speed();
        maruti.maintenance();
//        maruti.value();
        System.out.println(" ");

        bajaj.speed();
        bajaj.maintenance();
//        bajaj.value();
        System.out.println(" ");

        jumbo.speed();
        jumbo.maintenance();
//        jumbo.value();
    }
}