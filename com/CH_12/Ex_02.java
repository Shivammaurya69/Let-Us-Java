package com.CH_12;

public class Ex_02 {
    public static void main(String[] args) {
        String[] names=new String[]{
                "Akshay","Parag","Raman","Srinivas","Gopal","Rajesh"
        };
        int i,j,result;
        String temp;
        for (i=0; i<names.length; i++){
            for (j=i+1; j< names.length; j++){
                result = names[i].compareTo(names[j]);
                if (result>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        for (String n:names){
            System.out.println(n);
        }
    }
}
