package com.CH_10;

import java.util.Calendar;

public class Ex_07 {
    public static void main(String[] args) {
        Sample.showDate();
    }
}
class Sample{
    private static int y;
    private static int m;
    private static int d;
    static{
        Calendar cal = Calendar.getInstance();
        y = cal.get(Calendar.YEAR);
        m = cal.get(Calendar.MONTH)+1;
        d = cal.get(Calendar.DAY_OF_MONTH);
    }
    public static void showDate(){
        System.out.println("Year : "+y);
        System.out.println("Month: " +m);
        System.out.println("Day : "+d);
    }
}