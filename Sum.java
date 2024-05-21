package com.gunjana.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
