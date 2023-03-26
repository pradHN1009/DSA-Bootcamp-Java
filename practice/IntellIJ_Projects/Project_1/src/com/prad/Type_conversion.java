package com.prad;

import java.util.Scanner;

public class Type_conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(67.65f); //type conversion - Float to int
        System.out.println(num);

        int a = 254;
        byte b = (byte)(a); //254 % 256
        System.out.println(b);

        //Automatic type conversion in expressions
        byte x = 20;
        byte y = 30;
        byte z = 100;
        int f  = (x * y) / z;
        System.out.println(f);
    }
}
