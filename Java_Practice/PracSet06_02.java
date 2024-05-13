package Java_Practice;

import java.util.Scanner;

public class PracSet06_02 {
    public static void main(String[] args) {
        int [] array= {12,13,14,15,16,17,18};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter com.CH_15.a integer to search in the array.");
        int search = sc.nextInt();
        for (int i=0; i< array.length; i++){
            if(search==array[i]){
                System.out.println("The integer "+search+" is present in the array on index "+i);
            }
            else {
                System.out.println("Integer not found in the array.");
                break;
            }
        }
    }
}
