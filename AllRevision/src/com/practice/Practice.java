package com.practice;

import java.util.*;

class Practice {
    public static void main(String[] args){
       String[] name = {"ADNAN"};
        System.out.println(name[0]);

    }
}
class OddEven {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            if (i % 50 == 0) {
                System.out.println(i);
            }
        }

    }
}
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to get Multiplication Table:");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " +number*i);
        }
    }
}

class Semicolon {
    public static void main(String[] args) {
        if (System.out.printf("Hello World! ")==null){}
    }
}

class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check Prime or not:");
        int num = input.nextInt();

        boolean flag = false;
        for (int i = 2; i <= num/2; i++){
            if (num % i == 0){
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

class UserInputOddEven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to check It is odd or Even: ");
//        double num = input.nextDouble();
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is an even number.");
        }
        else if (num % 2 != 0){
            System.out.println(num + " is an odd number.");
        }
        else {
            System.out.println("Please Enter an integer number.");
        }
    }
}