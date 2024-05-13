//package com.company;
//
//import java.util.Scanner;
//
//public class If_else {
//    public static void main(String[] args) {
//        float bs, gs, da, hra;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your basic salary in Rs.");
//        bs= sc.nextFloat();
//        if (bs<1500){
//            hra =bs*10/100;
//            da= bs*90/100;
//        }
//        else {
//            hra=1200;
//            da=bs*98/100;
//        }
//        gs=bs+da+hra;
//        System.out.println("Gross Salary = Rs."+gs);
//    }
//}

//package com.company;
//
//import java.util.Scanner;
//
//public class If_else{
//    public static void main(String[] args) {
//        int m1, m2, m3, percent;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter Your Mark");
//        m1= sc.nextInt();
//        m2= sc.nextInt();
//        m3= sc.nextInt();
//        percent=(m1+m2+m3)*100/300;
//        if (percent>=60){
//            System.out.println("First Division");
//        }
//        else if (percent>=50){
//            System.out.println("Second Division");
//        }
//        else if (percent>=40){
//            System.out.println("Third Division");
//        }
//        else {
//            System.out.println("Fail");
//        }
//    }
//}

package com.company;

import java.util.Scanner;

public class If_else{
    public static void main(Ex_23[] args) {
        char ms, gender;
        int age;
        System.out.println("Enter Age, Gender and Marital Status respectively :"+"\n"+"For Male - M"+"\n"+"For Female - F"+"\n"+"For Married - M"+"\n"+"For Unmarried - U");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        gender=sc.next().charAt(0);
        ms=sc.next().charAt(0);
        if ((ms=='M')||(ms=='U')&&(age>30)&&(gender=='M')||(ms=='U')&&(gender=='F')&&(age>25)){
            System.out.println("Driver is Insured");
        }
        else {
            System.out.println("Driver is not Insured");
        }
    }
}