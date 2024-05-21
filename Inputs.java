package com.gunjana.basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int rollno = input.nextInt();
        System.out.println("Your roll no is: " + rollno);

        // System.in : takes input from the keyboard

        int a = 10; // literals : Syntactical representation of datatype
                    /* identifier : User given names to the variables classes method packages
                       reference variables in this case is a is an identifier */

        String name = input.next(); // Single char i/p
        String names = input.nextLine(); //One complete line is taken and stored in the variable

        float num = input.nextFloat();  // i/p: 456.5484546876 o/p: 456.54846
        System.out.println(num);        // floatingPoint error , the no is rounded off
    }
}
