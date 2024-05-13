package com.CH_10;

public class EX_06 {
    public static void main(String[] args) {
        Ex e1 = new Ex(10);
        Ex.showCount();
        Ex e3 = new Ex(30);
        Ex e4 = new Ex(30);
        Ex e5 = new Ex(30);
        Ex e6 = new Ex(30);
        Ex e7 = new Ex(30);
        Ex.showCount();
    }
}

class Ex {
    private int i;
    private static int count = 0;

    public Ex(int val) {
        i = val;
        count += 1;
    }


    public static void showCount() {
        System.out.println(count);
    }
}
