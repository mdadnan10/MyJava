package com.adnan;

import java.awt.*;
import java.sql.Time;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //
        // Primitive Data Types
        byte age = 20; // 1Byte -128 - 127
        short number = 500; // 2Bytes -32K - 32K
        int viewers = 200304; // 4Bytes -2B - 2B
        long subscribers = 194_789_482_428L; // 8Bytes
        float temp = 98.2F; // 4Bytes
        double d = 12.3484; // 8Bytes
        char dollar = '$'; // 2Bytes
        boolean isThisReal = true; // 1Bytes
        System.out.println(subscribers);
    }
}
class Reference {
    public static void main(String[] args) {
        byte age = 20;
        Date now = new Date();
        System.out.println(now);

        // primitive reference type
//        byte x = 2;
//        byte y = x;
//        x = 20;
//        System.out.println(y);

        // refrence type its store memory address thats why changes show
        Point point1 = new Point(10,20);
        Point point2 = point1;
        point1.x = 20;
        point1.y = 10;
        System.out.println(point2);
    }
}
class NonPrimitive {
    public static void main(String[] user){
        String name = "Md Adnan Khan";
        String desc = " is a good boy";
        System.out.println(name + desc);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.endsWith("an"));
        System.out.println(desc.startsWith("is"));
        System.out.println(desc.indexOf("o"));
        System.out.println(name.replace("m", "r"));
        System.out.println(name.trim());
    }
}
class EscapeSequence {
    public static void main(String[] args) {
        String message = "Hello\n i am\t an \"indian\" ";
        String path = "c:\\Windows\\...";
        System.out.println(message);
        System.out.println(path);
    }
}
class PracticeArrays {
    public static void main(String[] args) {
//        int[] numbers = {3, 6, 2, 4, 1, 5};
//        System.out.println(numbers.length);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        // multi demensional array
        int [][] numbers = { {1,2,3}, {4,5,6} };
        System.out.println(Arrays.deepToString(numbers));
    }
}
class PracticeConstants {
    public static void main(String[] args) {
        final float pi = 3.14F;
        System.out.println(pi);
    }
}
class Operators {
    public static void main(String[] args) {
        double divide = (double)10/(double)3;
        System.out.println(divide);

        int x =1;
        int y = ++x;
        x += 2;
        System.out.println(x);
        System.out.println(y);

        int a = 10 - (2 + 5);
        int b = 10 * 3 / 2;
   /*      Oprators priority
        () -> Highest
        *,/ -> Second Highest
        +- -> Third Highest
        */

        System.out.println(b);

    }
}

class CastingTypeConversion {
    public static void main(String[] args) {
        // Implicit casting byte > short > int > long > float > double
        short num1 = 20;
        int num2 = num1 + 10;

        // Explicit Casting
        double b = 10.22;
        int a = (int)b + 10;

        System.out.println(a);

        String x = "1";
        int y = Integer.parseInt(x) + 2;
        String x1= "1.33";
        double y1 = Double.parseDouble(x1) + 2;
        System.out.println(y);
        System.out.println(y1);
//        Integer.parseInt();

    }
}

class MathOperations {
    public static void main(String[] args) {
//        int result = Math.round(1.33F);
//        int result = (int)Math.ceil(1.33F);
//        int result = (int)Math.floor(1.33F);
//        int result = Math.max(1, 39);
//        int result = Math.min(1, 39);
          int result = (int)Math.round(Math.random() * 100);
//        int result = Math.log(9);
//        int result = Math.sqrt(9);
        System.out.println(result);
    }
}

class FormattingNumber {
    public static void main(String[] args) {
       NumberFormat currency = NumberFormat.getCurrencyInstance();
       String result = currency.format(1234567.891);
        System.out.println(result);

        String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percent);
    }
}

class ReadingInputUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your Name Please: ");
        String name = input.nextLine().trim();
        System.out.print("Enter Your Age: ");
        byte age = input.nextByte();
        System.out.print("You are " + name + " and ");
        System.out.print(age + " Years old");
    }
}

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = input.nextInt();
        System.out.print("Enter Annual Rate: ");
        double rate = input.nextDouble();
        System.out.print("Period (Years): ");
        byte period = input.nextByte();

        char currency = '\u20B9';
        double result = principal * rate * period / 100;

        System.out.print("Simple Interest : " + currency +result);


    }
}

class MortgageCalc {
    public static void main(String[] args) {
        final byte Months_In_Years = 12;
        final byte Percent = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        int principal = input.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = input.nextFloat();
        float monthlyInterest = annualInterest / Percent / Months_In_Years;

        System.out.print("Period (Years): ");
        byte years = input.nextByte();
        int numberOfPayments = years * Months_In_Years;

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);

    }
}

class Oprators {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(x < y);

        // logical Oprators
        int temp = 22;
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}

class Statements {
    public static void main(String[] args) {
        byte temp = 12;
        if (temp > 30) {
            System.out.println("It's a hot day.");
            System.out.println("Drink Plenty of Water.");
        }
        else if (temp >= 20)
            System.out.println("Beautiful day.");
        else
            System.out.println("It's a cold day.");

//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);

        // Ternary Oprator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);
    }
}

class SwitchStatements {
    public static void main(String[] args) {
        String role = "Mod";
        switch (role) {
            case "Admin":
                System.out.println("You are an Admin");
                break;
            case "Moderator":
                System.out.println("You are a Moderator");
                break;
            default:
                System.out.println("You are a Guest");
        }
    }
}

class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        if (number % 5 == 0){
            if (number % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println("Fizz");
            }
        }
        else if (number % 3 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
    }
}

class loops {
    public static void main(String[] args) {
//        String hello = "Hello World ";
//        for (int i = 5; i > 0; i--){
//            System.out.println(hello + i);
//        }

//        int a = 0;
//        while (a < 5){
//            System.out.println(hello + a);
//            a++;
//        }


        Scanner scan = new Scanner(System.in);

        String input = "";
        do{
            System.out.print("Input: ");
            input = scan.next().toLowerCase();

            if (input.equals("pass")){
                continue;
            }

            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }
        while (!input.equals("quit"));
    }
}

class FullMortgageCalc {
    public static void main(String[] args) {
        final byte Months_In_Years = 12;
        final byte Percent = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Enter Principal (1K - 1M): ");
            principal = input.nextInt();
            if (principal >= 1000 && principal <= 1_000_000){
                break;
            }
            System.out.println("PLease Enter In Between 1000 to 10,000,00");
        }

        while (true) {
            System.out.print("Annual Interest Rate (1% - 16.5%): ");
            float annualInterest = input.nextFloat();
            if (annualInterest > 0 && annualInterest <= 16.5){
                monthlyInterest = annualInterest / Percent / Months_In_Years;
                break;
            }
            System.out.println("Enter a value in Between 1 to 16.5");
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte years = input.nextByte();
            if (years > 0 && years <= 30) {
                numberOfPayments = years * Months_In_Years;
                break;
            }
            System.out.println("The Value Must be In Between 1 to 30");
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);

    }
}