package com.CH_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_03 {
    public static void main(String[] args) {
        int i,j;
        try{
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter i:");
            i= Integer.parseInt(br.readLine());
            System.out.println("Enter j:");
            j= Integer.parseInt(br.readLine());
            System.out.println("You entered :"+i+" "+j);
            System.out.println("Result :"+i/j);
        }
        catch (IOException e){
            System.out.println("Error in input");
        }
        catch (NumberFormatException ne){
            System.out.println(" Incorrect Input");
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception, div by 0");
        }
        catch(Exception e){
            System.out.println("Unknown Error : "+e);
        }
    }
}