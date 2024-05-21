package com.gunjana.basics;

import java.util.Scanner;
//Type conversion : One type of data is assigned to another type of variable
//Condition 1 : Type should be compatible
//Condition 1 :  Should not be like Left > Right Eg: int x = float
//Type casting (narrowing conversion): int num = int (4.5f): here it casts float to int
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();
        int numbers = input.nextInt();
        System.out.println(number);

        //type casting
        int num = (int)(54.78f);
        System.out.println(num);

        //automatic type promotions in expressions
        int p = 257;   //byte storage size = 256
        byte q = (byte)(p);
        System.out.println(q); //257 % 256 = 1

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int m = x * y / z; // Everything gets pramoted to int
        System.out.println(m);

        int no = 'A';
        System.out.println(no); // ASCII Values

        System.out.println("ನಮಸ್ಕಾರ"); // Unicode values

        // Rules for Promotion:
        /* Rule 1 : All the byte short and char values are promoted to int
                    if long float or double then the whole expression is promoted to the respective datatype */
        System.out.println(3 * 45.54f); // int * float = float

        // Everything in 1 Example
        byte b = 23;
        char c = 'g';
        short s = 454;
        int i = 70000;
        float f = 45.546f;
        double d = 54.54123143;
        // float + int - double = double (max of all 3)
        double result = (f * i) + (s / c) - (d - b);
        System.out.println((f * i) + " " + (s / c) + " " + (d - b));
        System.out.println(result);
    }
}
