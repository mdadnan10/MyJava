package com.codyadnan;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting Code With Harry Tutorial :)");
    }
}
class DataTypesAndVariales{
    public static void main(String[] args) {
        byte num1 = 20;
        byte num2 = 30;
        byte num3 = 40;
        int sum = num1 + num2+ num3;
        System.out.println("The Sum of These Numbers is " + sum);
    }
}
class TakingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        System.out.println("Your Entered Number is " + num);
    }
}
class PercentageCalculator {
    public static void main(String[] args) {

        final short fullMarks = 500;
        final byte percentage = 100;

        byte subject1 = 0;
        byte subject2 = 0;
        byte subject3 = 0;
        byte subject4 = 0;
        byte subject5 = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Your 1st Subject Mark: ");
            subject1 = input.nextByte();
            if (subject1 >= 0 && subject1 <= 100) {
                break;
            }
            System.out.println("Enter your mark in between 0 to 100.");
        }

        while (true) {
            System.out.print("Enter Your 2nd Subject Mark: ");
            subject2 = input.nextByte();
            if (subject2 >= 0 && subject2 <= 100) {
                break;
            }
            System.out.println("Enter your mark in between 0 to 100.");
        }

        while (true){
        System.out.print("Enter Your 3rd Subject Mark: ");
        subject3 = input.nextByte();
        if (subject3 >= 0 && subject3 <= 100) {
            break;
        }
        System.out.println("Enter your mark in between 0 to 100.");
      }

        while (true) {
            System.out.print("Enter Your 4th Subject Mark: ");
            subject4 = input.nextByte();
            if (subject4 >= 0 && subject4 <=100) {
                break;
            }
            System.out.println("Enter your mark in between 0 to 100.");
        }

        while (true) {
            System.out.print("Enter Your 5th Subject Mark: ");
            subject5 = input.nextByte();
            if (subject5 >= 0 && subject5 <=100) {
                break;
            }
            System.out.println("Enter your mark in between 0 to 100.");
        }

        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        double securedPercentage = (double)totalMarks * (double)percentage / (double)fullMarks;

        if (totalMarks <= 165){
            System.out.println("Your Secured Marks is: " + totalMarks + " Out of 500");
            System.out.println("You are Fail.");
        }
        else if (totalMarks > 165){
            System.out.println("Your Secured Marks is: " + totalMarks + " Out of 500");
            System.out.println("You have got 3rd Division.");
        }
        else if (totalMarks > 249 && totalMarks <= 299){
            System.out.println("Your Secured Marks is: " + totalMarks + " Out of 500");
            System.out.println("You have got 2nd Division.");
        }
        else {
            System.out.println("Your Secured Marks is: " + totalMarks + " Out of 500");
            System.out.println("You have got 1st Division.");
        }
        char symbol = '%';
        System.out.println("Your Secured Percentage is: " + securedPercentage + symbol);

    }
}

class PracticeSetCH1 {
    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 23;
//        int num3 = 11;
//        int sum = num1 + num2 + num3;
//        System.out.println("Sum Of These Numbers Are: " + sum);

//        Question2
//        byte sub1mark = 45;
//        byte sub2mark = 95;
//        byte sub3mark = 48;
//        int totalMark = sub1mark + sub2mark + sub3mark;
//
//        int percentage = totalMark * 100 / 300;
//
//        float cgpa = (float)percentage / (float)10;
//        System.out.print("Your CGPA is: " + cgpa);

//        question3
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Please Enter Your Name: ");
//        String name = input.nextLine();
//
//        System.out.println("Hello " + name + ", Have a good Day.");

//        Question4
//        final double mile = 1.609344;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter KM: ");
//        int kilometer = sc.nextInt();
//
//        float covert = (float) kilometer / (float)mile;
//        System.out.println(kilometer + " Kilo meter is " + covert + " mile");

//        Question5
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter anything: ");

        boolean stringOrNot = userInput.hasNext();
        System.out.println(stringOrNot);
    }
}

class PrecedenceOperators {
    public static void main(String[] args) {
        int x = 10, y = 4, z = 2;
        int b = 10, a = 2, c = 5, d = 2;
        int v = 4, u = 4;

        int sum = (x - y)/z;
        int sum1 = (b*b) - (4*a*c) / (2*a);
        int sum2 = (v*v) - (u*u);
        int sum3 = a * b - d;
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}

class Operators {
    public static void main(String[] args) {
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
        char ch = 'b';
        System.out.println(ch++);
        System.out.println(ch);
    }
}

class Statements {
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch+" ");
        }
    }
}

class  practiceTest_02 {
    public static void main(String[] args) {
        // Question1
//        float a = 7/4f * 9/2f;
//        System.out.println(a);

        // Question2
//        char grade = 'B';
//        grade = (char)(grade + 8);
//
//        System.out.println(grade);
//
//        // Decrypt
//        grade = (char)(grade - 8);
//        System.out.println(grade);

        // Qustion3
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter a Number: ");
//        int number = input.nextInt();
//
//        System.out.println(number > 10);

        // Question4
//        int v = 10;
//        int u = 5;
//        int a = 2;
//        int s = 4;
//
//        float result = (10 * 10F - 5 * 5F) / (2 * 2 * 4F);
//        System.out.println("Result of Given Expression is: " + result);

        // Question5
        int a = 7*49/7 + 35/7;
        System.out.println(a);
    }
}

class Strings {
    public static void main(String[] args) {
        int a = 6;
        float b = 6.354F;
        System.out.printf("The Value of a is %d and The Value Of b is %.2f", a, b);

        String s = "adnan";
        System.out.printf("\nMy Name is %s", s);

        char ch = '$';
        System.out.format("\n%c is the Currency Symbol of US", ch);

    }
}

class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

//        int length = name.length();
//        System.out.printf("Your Name is %s and It is Consist of %s Letters\n", name.toUpperCase() ,length);
//        System.out.println(name.trim());
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(2,5));
//        System.out.println(name.replace('r', 'p'));
//        System.out.println(name.replace("hello", "i am good"));
//        System.out.println(name.startsWith("ad"));
//        System.out.println(name.endsWith("an"));
//        System.out.println(name.charAt(4));
//        System.out.println(name.indexOf("n"));
//        System.out.println(name.indexOf("n", 3));
//        System.out.println(name.lastIndexOf("n", 4));
        System.out.println(name.equals("adnan"));
        System.out.println(name.equalsIgnoreCase("adnan"));
    }
}

class StringPracticeSet {
    public static void main(String[] args) {
        // Question1
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Name In UpperCAse: " );
//        String value = sc.nextLine();
//        String name = value.toLowerCase();
//        System.out.println(name);

        // Question2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Something Using Space: " );
//        String name = sc.nextLine();
//        name = name.replace(" ", "_");
//        System.out.print("Modified String: " + name);

        // Question3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Name: " );
//        String name = sc.nextLine();
//        name = name.replace("adnan", "Mohammad");
//        System.out.print("Modified Name: " + name);

        // Question4
//        String name = "Dear <|name|> Thanks a lot.";
//        name = name.replace("<|name|>", "Mohammad");
//        System.out.print("Modified Name: " + name);

        // Question4
//       String myString = "This String Contains double  and triple space.";
//        System.out.println(myString.indexOf("  "));
//        System.out.println(myString.indexOf("   "));

        // Question5
        String letter = "Dear Adnan.\n\t This Java Course is nice.\nThanks!";
        System.out.println(letter);

    }
}

class IfElseStatements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String input = scan.nextLine();

        if (input.length() <= 5) {
            System.out.printf("Your password(%s) is too short", input);
        }
        else if (input.length() > 5){
            System.out.format("Your password(%s) is average", input);
        }
        else if (input.length() > 8 && input.length() <= 13){
            System.out.printf("your password(%s) is good");
        }
        else {
            System.out.printf("Your password(%s) is Too Strong", input);
        }
    }
}

class Conditionals {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        switch (age){
            case 18 -> System.out.println("You Are Eligible for Voting!");
            case 21 -> System.out.println("You Are Eligible For Marriage!");
            case 60 -> System.out.println("Yor are now a retired person!");
            default -> System.out.println("Looks Like Your Enter Age is not Matched.");
        }

    }
}

class Chapter4 {
    public static void main(String[] args) {
        // Question1
        /*
        int a = 10;
        if (a = 11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
         */

       // Question2
        /*
        float sub1 = 0;
        float sub2 = 0;
        float sub3 = 0;
        final float percentage = 100;
        final float fullMarks = 300;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Subject 1 Mark: ");
            sub1 = sc.nextFloat();
            if (sub1 > 0 && sub1 <= 100){
                break;
            }
            System.out.println("Enter Between 0 to 100");
        }

        while (true) {
            System.out.print("Enter Subject 2 Mark: ");
            sub2 = sc.nextFloat();
            if (sub2 > 0 && sub2 <= 100){
                break;
            }
            System.out.println("Enter Between 0 to 100");
        }

        while (true) {
            System.out.print("Enter Subject 3 Mark: ");
            sub3 = sc.nextFloat();
            if (sub3 > 0 && sub3 <= 100){
                break;
            }
            System.out.println("Enter Between 0 to 100");
        }

        float securedMarks = sub1 + sub2 + sub3;

        float securedPercentage = securedMarks * percentage / fullMarks;

        char symbol = '%';

        System.out.println(" ");

        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && securedPercentage >= 33){
            System.out.printf("You are Secured %.2f%c\nYou are Secured %.0f Marks out of %.0f", securedPercentage,symbol,securedMarks,fullMarks);
        }
        else {
                 if (sub1 < 33)
                     System.out.printf("sub1 %.2f (below 33) Fail\n", sub1);
                 if (sub2 < 33)
                     System.out.printf("sub2 %.2f (below 33) Fail\n", sub2);
                 if (sub3 < 33)
                     System.out.printf("sub3 %.2f (below 33) Fail\n", sub3);

            System.out.printf("You Are Fail.\nSecured Mark: %.0f out of %.0f\nSecured Percentage: %.2f%c",securedMarks,fullMarks,securedPercentage,symbol);
        }
         */

        // Question 4
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter from 1 to 7: ");
        byte day = sc.nextByte();

        switch (day){
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
            default -> System.out.println("Please Enter from 1 to 7 only");
        }
         */

        // Question 5
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Year :: ");
        year = input.nextInt();

        if (((year %4 == 0) && (year %100 != 0)) || (year %400 == 0)){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }


        // Question 6
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your domain name: ");
        String domainName = input.nextLine();

        if (domainName.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }
        else if (domainName.endsWith(".org")){
            System.out.println("This is a Organization Website");
        }
        else if (domainName.endsWith(".in")){
            System.out.println("This is a Indian Website");
        }
        else {
            System.out.println("This is a Website");
        }
         */

    }
}

class WhileLoop {
    public static void main(String[] args) {
        int a = 100;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number ");
            a = sc.nextInt();
            if (a <= 200){
                break;
            }
        }
        System.out.println(a);
    }
}

class DoWhileLoop {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println(n);
            n++;
        }while (n < 5);
    }
}