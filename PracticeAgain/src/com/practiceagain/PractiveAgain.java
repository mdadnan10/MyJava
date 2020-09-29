package com.practiceagain;

import java.util.ArrayList;
import java.util.Scanner;

class PractiveAgain {
    public static void main(String[] args) {
        System.out.println("Hello Mr Cody Adnan !");
    }
}
class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your age to display your Category: ");
        int age = input.nextInt();
        if (age >= 0 && age <= 18){
            System.out.println("Your age is " + age);
            System.out.println("You are a kid.");
        }
        else if (age >= 19 && age <= 50){
            System.out.println("Your age is " + age);
            System.out.println("You are now an Adult.");
        }
        else if (age >= 51 && age <=60){
            System.out.println("Your age is " + age);
            System.out.println("You are going to be a senior citizen.");
        }
        else {
            System.out.println("Your age is " + age);
            System.out.println("You are a senior citizen.");
        }
    }
}

class Fibonacci {
    public static void main(String[] args){
        int n1=0, n2 = 1, n3, i , count = 10;
        System.out.print(n1+ "  " +n2);
        for (i=2;i<count;++i){
            n3 = n1+n2;
            System.out.print("  " +n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
class DishRequired {
    public static void main(String [] args){
        int bigcup = 500;
        int smallcup = 300;
        int requiredWater = bigcup - smallcup;
        System.out.println("Exact water required by cook is " + requiredWater + "ml");
    }
}
class HotDogs {
    public static void main(String[] args) {
        int totalHotDog = 400;
        int hotDogPerContainer = 8;
        int totalContainer = 0;
        int temp = totalHotDog + hotDogPerContainer;
        while (temp>hotDogPerContainer){
            temp = temp - hotDogPerContainer;
            totalContainer++;
        }
        System.out.println("Jack Buy " + totalContainer + " containers");

    }
}

class FloppyDrive {
    public static void main(String[] args) {
        double f,u,d,n,total,totalFree,used;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Free Bytes: ");
        f = input.nextDouble();
        System.out.print("Enter Used Bytes: ");
        u = input.nextDouble();
        total = f + u;
        System.out.println("You Disk have total " + total + "Bytes");
        System.out.print("Enter Delete File size: ");
        d = input.nextDouble();
        System.out.print("Enter New File size: ");
        n = input.nextDouble();
        used = u - d + n;
        totalFree = total - used;
        System.out.println("You Disk have total " + total + "Bytes");
        System.out.print("Free Bytes in Floppy disk is : " + totalFree + "Bytes");

    }
}

class Add {
    public static void main(String[] args) {
//        int a= 0, b=0; c=0, d=0, e=0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Item 1: ");
        int a = userInput.nextInt();
        System.out.print("Enter Item 2: ");
        int b = userInput.nextInt();
        System.out.print("Enter Item 3: ");
        int c = userInput.nextInt();
        System.out.print("Enter Item 4: ");
        int d = userInput.nextInt();
        System.out.print("Enter Item 5: ");
        int e = userInput.nextInt();
        int sum = a + b + c + d + e;
        System.out.print("Sum of all Items are: " + sum);

    }
}

class mathInArray {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        System.out.println(a[2]);
        for (int newa: a){
            System.out.print(newa+" ");
        }
    }
}