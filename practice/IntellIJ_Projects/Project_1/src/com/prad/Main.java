package com.prad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        //primitive data types
        int num = 10; //4 bytes
        char a = 'b'; //2 bytes
        float marks = 98.33f; //4 bytes
        double largeDecimalNumber = 24847328.3432234; //8 bytes
        long largeNumber = 4325325332L; //8 bytes
        boolean check = true; //1 bit

        Integer rollNo = 10; //Wrapper class, gives access to more functions withing Integer class
        rollNo = input.nextInt();
        System.out.println("Your roll number is " + rollNo);
    }
}