    
package com.CH_12;
public class StringBuilderExample
// Java code to illustrate
// methods of StringBuilder


        {
    public static void main(String[] argv)
            throws Exception
    {

        // create com.CH_15.a StringBuilder object
        // with com.CH_15.a String pass as parameter
        StringBuilder str
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String = "
                + str.toString());

        // reverse the string
        StringBuilder reverseStr = str.reverse();

        // print string
        System.out.println("Reverse String = "
                + reverseStr.toString());

        // Append ', '(44) to the String
        str.appendCodePoint(66);
        System.out.println("append = "
                + str);
        // Print the modified String
        System.out.println("Modified StringBuilder = "
                + str);

        // get capacity
        int capacity = str.capacity();

        // print the result
        System.out.println("StringBuilder = " + str);
        System.out.println("Capacity of StringBuilder = "
                + capacity);
    }
}

