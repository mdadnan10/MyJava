package idCardGenerator;

import java.util.Scanner;

public class IdCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Class: ");
        String std = sc.nextLine();

        System.out.println("Enter Blood Group: ");
        String bloodGroup = sc.nextLine();

        System.out.println("Enter Batch like(2020-22): ");
        String batch = sc.nextLine();

        System.out.println("Address: ");
        String address = sc.nextLine();

        System.out.println("Enter age: ");
        byte age = sc.nextByte();

        System.out.println("Mobile Number: ");
        long phoneNumber = sc.nextLong();



        System.out.println(" ");
        System.out.println("College of It AND Management Education");
        System.out.println("          (AICTE AFFILIATED)        ");
        System.out.println("   Mancheswar, Bhubaneswar, 755101  ");
        System.out.println("ph: 8984516332 * E-mail : aba@gmail.com");
        System.out.println("----------------------------------------");
        System.out.println("               " + batch);
        System.out.print("Name  : " + name.toUpperCase()); System.out.println("\t \t \t" + bloodGroup.toUpperCase());
        System.out.println("class : " + std.toUpperCase());
        System.out.println("Age   : " + age);
        System.out.println("Phone : " + phoneNumber);
        System.out.println("ADD   : " + address);


    }
}
