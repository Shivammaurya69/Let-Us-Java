package com.CH_13;

class Index {
    protected int count;

    public Index() {
        count = 0;
    }

    public void display() {
        System.out.println("Count = " + count);
    }

    public void increment() {
        count += 1;
    }
}

class Index1 extends Index {
    public void decrement(){
        count-=1;
    }
}

public class Ex_01 {
    public static void main(String[] args) {
        Index1 i;
        i=new Index1();
        i.increment();
        i.display();
        i.decrement();
        i.display();
    }
}
