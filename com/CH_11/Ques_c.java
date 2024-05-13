package com.CH_11;

public class Ques_c {
    public static void main(String[] args) {
        int [] a= {1,2,3,4,5,6,7,8,9,0};
        for(int i=0; i<a.length; i+=2){
            if (a[i]%2!=0){
                int temp;
                temp = a[i];
                a[i]= a[i+1];
                a[i+1] = temp;
            }
        }
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+", ");
        }
    }
}
