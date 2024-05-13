package com.CH_10;

public class Ex_08 {
    public static void main(String[] args) {
        Exm e=new Exm();
        Exm e1=new Exm();
        e.setData(1,2.5f);
        e1.setData(4,6.5f);
        e.displayData();
        e1.displayData();
        fun(e1);
        e1.displayData();
    }
    static void fun(Exm p){
        p.setData(3, 8.5f);
    }
}
class Exm{
    private int i;
    private float f;
    public void setData(int x, float y){
        i=x;
        f=y;
    }
    public void displayData(){
        System.out.println("i : "+i+" f : i"+f);
    }
}
