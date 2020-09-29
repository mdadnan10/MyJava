package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Main
{
//
//    static int sum(int a , int b){
//        return a+b;
//}

    public static void main(String[] args) {
      // write your code here
        System.out.println("Hello CodyAdnan !!!");

       /* variables
               jupt like:
                    water - bucket
                    masla - box
                    lunch - lunchbox
               in java:
                variables are containers which stores data values
                 String- text like hello, int- number-1,2,3, float- 3.2, 1.5, char- '1char', boolean- tru-e or false
                 syntax <data-type> <variable name> = value;
        */
//
//        String myname = "Cody Adnan";
//        System.out.println("Hello " + myname);
//        int age = 20, date = 10, year= 2000;
//        System.out.println( date);
//        float height = 1.8f;
//        System.out.println(height + "m");
//        boolean isAdult= true;
//        System.out.println(isAdult);
//
//        String fistname= "Md ";
//        String middlename= "Adnan ";
//        String lastname= "Khan";
//        String fullname= fistname + middlename + lastname;
//        System.out.println(fullname);
//
//        String name = "India";
//        int population= 1350000000;
//        float populationDensity = 393.0f;
//        double Gdp = 2.454;
//        char currency = '\u20B9';
//        boolean isSecular = true;
//        System.out.println(name);
//        System.out.println(population + " cr");
//        System.out.println(populationDensity);
//        System.out.println(Gdp + " Trillion dollar");
//        System.out.println(currency);
//        System.out.println(isSecular);



     /*  rules for constructing name of variables in java
        Can contain digits, underscores, dollar signs, letters
        Should begin with a letter, $ or _
        java is a case sensitive language means that harry and Harry are two different variables altogether
        should not contain whitespaces
        you cannot use reserved keywords.
      */

        /* two types od data types
                1. primitive data types - byte (1 byte), short (2 bytes), int (4 bytes), long (8 bytes), float (4 bytes),
                    double (8 bytes), boolean(1 bit), char (2 bytes).
                2. non primtive or reference data types -

        byte u = 127 | -127;
        System.out.println(u);
         */
//        double d = 54.767763;
//        System.out.println(d);

        /* oprators in java
        Arithmatic oprators
        Assignment oprators
        Logical Oprators
        Comparison Oprators

         */

//        int num1 = 45;
//        num1 += 4;
//        num1 -= 4;
//        int num2 = 78;
//        num2 *= 4;
//        num2 /= 4;
//        num2 %= 4;
//        System.out.print("The value of num1 + num2 is ");
//        System.out.println(num1 + num2);
//
//        System.out.print("The value of num1 - num2 is ");
//        System.out.println(num1 - num2);
//
//        System.out.print("The value of num1 * num2 is ");
//        System.out.println(num1 * num2);
//
//        System.out.print("The value of num1 / num2 is ");
//        System.out.println(num1 / num2);
//
//        System.out.print("The value of num1 % num2 is ");
//        System.out.println(num1 % num2);
//
//        System.out.println(num1++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);

        /*
        comparison oprators
        1. = checks for equality
        2. != not equal to
        3. < less than
        4. > greater than
        5. <= less than equalto
        6. >= greater than equalto
         */

        /*
        logical oprators
        1. && logical and - returns true only if both conditios are true
        2. || logical or oprators - return any one condition is true
        3. ! - if true return false , if false return true
         */

//        taking user input
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your age");
//        String input = scan.next(); take only one input its wait for white space
//        String input = scan.nextLine();
//        int input = scan.nextInt();
//        System.out.println(input);


//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your name ");
//        String input = scan.nextLine();
//        System.out.println(input);

//        Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter Your name, Age, Salary");
//        String name = myobj.nextLine();
//        int age = myobj.nextInt();
//        long salary = myobj.nextLong();
//        System.out.println("Your Name is : " + name);
//        System.out.println("You Age is : " + age);
//        System.out.println("Your Monthly Salary is : " + salary);


//        LocalDate date = LocalDate.now();
//        System.out.println("Today Date: " + date);
//        LocalTime time = LocalTime.now();
//        System.out.println("Current Time: " + time);
//        LocalDateTime td = LocalDateTime.now();
//        System.out.println("Today Time & Date: " +

//        Scanner addition = new Scanner(System.in);
//        System.out.println("Enter First Number: ");
//        double num1 = addition.nextDouble();
//        System.out.println("Enter Second Number: ");
//        double num2 = addition.nextDouble();
//        double sum = num1 + num2;
//        System.out.println("The Sum of two Number is: " + sum);

//
//        int num1, num2, substract;
//          Scanner subs = new Scanner(System.in);
//          System.out.println("Enter 1st number: ");
//          num1 = subs.nextInt();
//        System.out.println("Enter 2nd number: ");
//          num2 = subs.nextInt();
//
//        substract = num1 - num2;
//        System.out.println("Substraction of two numbers is: " + substract);


//        string methods
//        String name = "Adnan";
//        String profession = "a programmer";
//        System.out.println(name);
//        System.out.println(name.length());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        concardination oprator
//        \", \\, \r, \n, \t - escape sequence
//        System.out.println(name + " is\\ " + profession);
//        System.out.println(name + " is\" " + profession);
//        System.out.println(name + " is\r " + profession);
//        System.out.println(name + " is\n " + profession);
//        System.out.println(name + " is\t " + profession);

//        System.out.println(name.contains("Adn"));
//        System.out.println(name.charAt(3));
//        System.out.println(name.endsWith("an"));
//        System.out.println(name.indexOf("nan"));

//        math methods in java
//      double x= 2, y = 36;
//        System.out.println("Maximum among These: " + Math.max(x,y));
//        System.out.println("Minimum Among These: " + Math.min(x,y));
//        System.out.println("This makes negative to positive: " + Math.abs(-5));
//        System.out.println("Random number between 0 - 1: " + Math.random());
//        System.out.println("Random number between These: " +  4+(8-4)*Math.random());
//        System.out.println("Square root of this number: " + Math.sqrt(y));
//        System.out.println("Power of y corresponding to x: " + Math.pow(y,x));
//        System.out.println("log of x: " + Math.log(x));
//        System.out.println("log of y: " + Math.log(y));


//        taking user input

//         Scanner myobj = new Scanner(System.in);
//        System.out.println("Enter your Age: ");
//        int age = myobj.nextInt();
//        System.out.println("Your Age is: " + age);

            //  if else conditionals
//        if(age >= 20 && age <= 59){
//            System.out.println("You are an Adult.");
//        }
//        else if (age >= 5 && age <= 19){
//            System.out.println("You are not a kid.");
//        }
//        else if (age >= 60){
//            System.out.println("You are a senior Citizen.");
//        }
//        else {
//            System.out.println("You are a kid");
//        }

        // Switch case
//        switch (age) {
//            case 12:
//                System.out.println("Your Age is 12");
//                break;
//
//            case 16:
//                System.out.println("Your Age is 16");
//                break;
//
//            case 20:
//                System.out.println("Your Age is 20");
//                break;
//
//            case 50:
//                System.out.println("Your Age is 50");
//                break;
//
//            default:
//                System.out.println("your age is default");
//        }

        //   Quik Quiz : to print sunday to saturday from userinput
//        Scanner weekdays = new Scanner(System.in);
//        System.out.print("Enter from 1 - 7 where 1 start from sunday:");
//        int days = weekdays.nextInt();
//
//        switch (days){
//            case 1:
//                System.out.println("Today is: Sunday");
//                break;
//            case 2:
//                System.out.println("Today is: Monday");
//                break;
//            case 3:
//                System.out.println("Today is: Tuesday");
//                break;
//            case 4:
//                System.out.println("Today is: Wednesday");
//                break;
//            case 5:
//                System.out.println("Today is: Thursday");
//                break;
//            case 6:
//                System.out.println("Today is: Friday");
//                break;
//            case 7:
//                System.out.println("Today is: Saturday");
//                break;
//            default:
//                System.out.println("please enter from 1 - 7 to see week days");
//        }

//       whole loop first it take condition then execute
//        int i = 10;
//        while (i >= 10 && i<= 100){
//            System.out.println(i);
//            i += 5;
//        }

//        do loop first it run then take condition
//        double a = 10;
//        do {
//            System.out.println(a);
//            a += 10;
//        }
//        while (a >= 20 && a <= 120);

//        for loop
//        for (double i = 100 ;i <= 100 && i >= 15; i -= 10){
//            System.out.println(i);
//        }

//        for (int i = 0; i<= 10; i++){
//            if (i <= 5){
//                System.out.println("Hello i am five.");
//            }
//            else if (i == 6) {
//                System.out.println("Hello may i Help you");
//            }
//            else {
//                System.out.println("I am Here to count");
//            }
//        }

//        for (int a = 20; a >= 20 && a <= 30; a++ ){
//            if (a == 25){
////                System.out.println("Hello skip me please");
//                continue;
//            }
////            else {
////                System.out.println("I will print you all");
////            }
//            System.out.println(a);
//        }

//        java Arrays

//        int[] a = {20, 25, 30};
//        a[2] = 54;
//        System.out.println(a[2]);
//
//        double[] rateOfInterest = {20.22, 1.435, 34.55};
//        System.out.println(rateOfInterest[0]);
//
//        String[] cars = {"maruti", "suzuki", "Toyota", "BMW"};
//        System.out.println(cars[3]);

//        classical way to itterate an array
//        int[] marks = {70, 60, 90, 80};
//        for (int i =0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }

//        System.out.println("For each loop in java");
        //For each loop
//        for (int value: marks){
//            System.out.println(value);
//        }
//
//        System.out.println("All Cars value");
//        for(String carsValue: cars){
//            System.out.println(carsValue);
//        }

//        multi dimensional array
//        int [][] matrix = {{1, 2, 3}, {4, 5, 6}};
////        System.out.println(matrix[0][2]);
//
//        for (int i = 0; i< matrix.length; i++){
//            for (int j = 0; j< matrix[i].length; j++){
//                System.out.println(matrix[i][j]);
//            }
//        }

//        Exception try & catch
//        int [] a = {1, 5, 7, 9};
//        try {
//            System.out.println(a[10]);
//        }
//        catch (Exception e){
////            System.out.println(e);
//            System.out.println("The Array Index You are looking for is not Found!");
//        }
//        System.out.println("Masoom");

//        java methods

//        System.out.println(sum(5, 7));



//        mini project calculator

        double num1, num2;

        System.out.print("Enter first Number: ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextDouble();

        System.out.print("Enter Second Number: ");
        num2 = scan.nextDouble();

        System.out.print("You have Entered: ");
        System.out.print(num1);
        System.out.print(" & ");
        System.out.println(num2);

        String prompt = "Enter any of these(+, -, *, /, %) to perform opration: ";
        System.out.println(prompt);
        char opration = scan.next().charAt(0);

        switch (opration){
            case '+':
                System.out.println("Adding these numbers");
                System.out.print("The Result is: ");
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println("Subtracting These Numbers");
                System.out.print("The Result is: ");
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println("Multiplying these numbers");
                System.out.print("The Result is: ");
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println("Dividing these numbers");
                System.out.print("The Result is: ");
                System.out.println(num1 / num2);
                break;
                case '%':
                System.out.println("Modulus of these numbers");
                System.out.print("The Result is: ");
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Invalid Input!");
        }





    }
}
