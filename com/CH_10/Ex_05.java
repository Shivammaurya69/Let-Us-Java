package com.CH_10;
class exmpl{
    private int i;
    public void setData(int ii){
        i=ii; //One way to set data
        this.i=ii; //Another way to set data
    }
    public void showData(){
        System.out.println(i); //One way to show data
        System.out.println(this.i); //Another way to show data
    }
}
public class Ex_05 {
    public static void main(String[] args) {
        exmpl e1;
        e1 = new exmpl();
        e1.setData(10);
        e1.showData();
    }
}
