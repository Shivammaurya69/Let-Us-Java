package com.CH_16;

import java.io.*;

public class Ex_06 {
    public static void main(String[] args) throws IOException {
//        prepare for window records
        FileOutputStream fos;
        fos = new FileOutputStream("emp.data");
        OutputStreamWriter osw;
        osw = new OutputStreamWriter(fos);

//        prepare for console output
        InputStreamReader isr1;
        isr1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr1);

//        receive employee data, write it to file
        String choice = "y", temp1, temp2, temp3;
        while ((choice.equals("y"))||(choice.equals("Y"))) {
            System.out.println("Enter employee id :");
            temp1 = br1.readLine();
            System.out.println("Enter employee salary :");
            temp2 = br1.readLine();
            System.out.println("Enter employee name :");
            temp3 = br1.readLine();

            osw.write(temp1 + "@" + temp2 + "@" + temp3 + "\n");
            System.out.println("Want Another(y/n) :");
            choice = br1.readLine();
        }
        osw.close();

//        prepare for reading records
        FileInputStream fis;
        fis = new FileInputStream("emp.data");
        InputStreamReader isr2;
        isr2 = new InputStreamReader(fis);
        BufferedReader br2;
        br2 = new BufferedReader(isr2);

        String rec, str[];

//        read employee data, display it on screen
        System.out.println("\nEmployees Info :");
        while (true) {
            try {
                rec = br2.readLine();
                str = rec.split("@", 3);
                System.out.println("Id :"+str[0]);
                System.out.println("Salary :"+str[1]);
                System.out.println("Name :"+str[2]);
            }
            catch (Exception e){
                if (fis != null)
                    fis.close();
            }
        }
    }
}