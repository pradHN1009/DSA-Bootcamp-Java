package com.prad;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers for sum");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
