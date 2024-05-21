package com.gunjana.basics;

// Premitive data type: It cannot be broken further

public class Primitives {
    public static void main(String[] args) {
        int rollno = 64;    // Size (of int) : 4 bytes
        char letter = 'g';
        float marks = 98.45f;   /* Size: 4 bytes  :: By default all decimal values are in
                                                     double so to specify its float we use 'f' */

        double largeDecimalNos = 165785.25456786;   // Size: 8 bytes
        long longInt = 3598325892368986L;   /* Size: 8 bytes :: Similar to float 'f' we use 'L'
                                                                By default all are in int */
        boolean check = true;
    }
}
