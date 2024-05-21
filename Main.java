package com.gunjana.basics;

import java.util.Scanner; // Package : Contains Scanner class and other keywords specified

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");  // out: output stream
        Scanner input = new Scanner(System.in); //in: input stream
        int number = input.nextInt(); //int i/p
        System.out.println(number); // prints the variable value
    }
}

/**
 public   : Access Specifier
 class    : Named group of properties and functions
 Main     : Class name (First letter of the class name is capital)
 static   : Do not have to create an object to run the main function
            As, main is the starting point of the program.
 void     : return type (no value is returned)
 Strings[]: Collection of chars
 args     : Arguments
 System   : it is a class which has variables such as out , in
 System.out : Output stream
 System.in  : Input Stream
 out(variable with value null) and println are PrintStreams
 new creates an object
 **/
