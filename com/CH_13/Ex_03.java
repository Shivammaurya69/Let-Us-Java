package com.CH_13;

class a {
    public a() {
        System.out.println("com.CH_15.a's 0-arg Ctor");
    }

    public a(int xx) {
        System.out.println("com.CH_15.a's 1-arg Ctor");
    }
}
class b extends a{
    public b(){
        System.out.println("b's 0-arg Ctor");
    }
    public b(int x){
        super(x);
        System.out.println("b's 1-arg Ctor");
    }
}

public class Ex_03 {
    public static void main(String[] args) {
        b y = new b();
        b z = new b(10);
    }
}
