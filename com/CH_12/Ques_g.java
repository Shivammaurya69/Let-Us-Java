package com.CH_12;

enum windowColor {
    red, green, blue
}

enum cursorType {
    pointer, busy, disable
}

class Window {
    private int hieght;
    private int widht;
    private windowColor windcol;
    private cursorType cursty;

    public Window(int h, int w, windowColor wc, cursorType ct) {
        hieght = h;
        widht = w;
        windcol = wc;
        cursty = ct;
    }

    public void displayData() {
        System.out.println("Properties of Window" + "\n Height :" + hieght + "\n Width :" + widht + "\n Window Color :" + windcol + "\n Cursor Type :" + cursty);
        System.out.println(" ");
    }
}

public class Ques_g {
    public static void main(String[] args) {
        Window w1 = new Window(450, 150, windowColor.blue, cursorType.pointer);
        Window w2 = new Window(350, 450, windowColor.red, cursorType.disable);
        w1.displayData();
        w2.displayData();
    }
}