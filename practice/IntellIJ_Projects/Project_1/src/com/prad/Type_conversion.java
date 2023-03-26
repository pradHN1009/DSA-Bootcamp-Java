package com.prad;

import java.util.Scanner;

public class Type_conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(67.65f); //type conversion - Float to int
        System.out.println(num);

        //Automatic type conversion in expressions
        int a = 254;
        byte b = a;
        System.out.println(b);
    }
}
