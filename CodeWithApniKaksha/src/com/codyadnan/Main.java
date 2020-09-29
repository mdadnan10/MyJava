package com.codyadnan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java Programmer:)");
        for (char a = 'a'; a <= 'z'; a++){
            System.out.print(a+" ");
        }

    }
}

class BitwiseOperators {
    public static void main(String[] args) {
        int a = 13;
        int b = 11;
        int c = a << 1;
        System.out.println(c);
    }
}

class IfElseStatements {
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

class NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = scan.nextInt();

        int result = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;

        System.out.println("Greatest Among These: " + result);

//        if (num1 > num2){
//            if (num1 > num3){
//                System.out.println("Greatest Among These: " + num1);
//            }
//            else {
//                System.out.println("Greatest Among These: " + num3);
//            }
//        }
//        else {
//            if (num2 > num3){
//                System.out.println("Greatest Among These: " + num2);
//            }
//            else {
//                System.out.println("Greatest Among These: " + num3);
//            }
//        }
    }
}

class SwitchStatements {
    public static void main(String[] args) {
        char operator = '+';

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        float num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        float num2 = input.nextInt();

        while (true) {
            System.out.print("Enter a Operator(+,-,*,/,%): ");
            operator = input.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                break;
            }
            System.out.printf("'%c' is a invalid operator!!\n", operator);
        }

        float result = 0;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
        }
        System.out.printf("%.2f %c %.2f = %.2f",num1, operator, num2, result);

    }
}

class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

//        System.out.print("Enter power for this number: ");
//        int num2 = sc.nextInt();

        // Multiplication Table
//        for (int i = 1; i <=10; i++){
//            int result = num * i;
//            System.out.println(num + " * " + i + " = " + result);
//        }

//        int result = 0;
//        for (int i = num; i <= num + 10; i++){
//            result = result + i;
//        }
//        System.out.println("Result = "+result);



        // factorial numbers
//        int factorial = 1;
//         for (int i = num; i > 0 ; i--){
//             factorial = factorial * i;
//         }
//        System.out.printf("Factorial of %d is %d",num,factorial);

        // Fibonacci Series
//        int a = 0;
//        int b = 1;
//        int c;
//
//        System.out.print(a+ " ");
//        System.out.print(b+ " ");
//        for (int i =0; i<num-2; i++){
//             c = a + b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//        }

        // power of number using for loop

//        int result = 1;
//        for (int i = 0; i < num2; i++){
//            result *= num;
//        }
//        System.out.print("Result is: " + result);

        // Prime or not

//        boolean isPrime = true;
//
//        for (int i = 2; i * i <= num; i++){
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        if (num < 2) isPrime = false;
//        System.out.format("is a prime number." + isPrime);

        // Series sum
        /*
        float result = 0;
        for (float i = 1; i <= num; i++){
            result += 1/i;
        }
        System.out.println("Result: " + result);


        float result = 0;

        for (float i = 1; i<= num; i++){
            if (result %2 == 0)
                result -= 1/i;
            else
                result += 1/i;

            System.out.print(result);
        }

        System.out.println(result);
         */

        for (int i = 0; i <= num; i++){
            if (i >= 40 && i <= 50){
                continue;
            }
            System.out.println(i);
        }

    }
}

class  NestedLoops {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++){
                System.out.print(j + " ");
            }
        }
         */

       // Multiplication Table from 1 to 20
        /*
        for (int i = 1; i <= 20; i++){
            for (int  j = 1; j <= 10; j++){
                int result = i * j;
                System.out.printf("%d * %d = %d\t", i ,j , result);
            }
            System.out.println();
        }
         */


        // Star Pattern (n x n)
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         */

        // Star pattern 1,2,3,4
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // star pattren , 5,4,3,2,1
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
         }
        */

        // Star pattern 5,space4,space3,space2,space1
        /*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= num-i+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //star Pattern space 1,space 2, space3, space4, space5
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num-i+1; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
         */

        // star Pattern *
        //            *   *
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*   ");
            }
            System.out.println();
        }
         */

        // number Pattern 1
        //            2   3 increasing
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        int number = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++){
                System.out.printf("%d   ",number++);
            }
            System.out.println();
        }
         */

        // Star Pattern *
        //              * *
        //              *

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = sc.nextInt();

        int rows = 2 * num - 1 ;

        /*
        for (int i =1; i <= rows; i++){
                if (i <= num) {
                    for (int j =1; j <= i; j++) {
                        System.out.print("* ");
                    }
                 }
                else {
                    for (int k =1; k <= rows-i+1; k++){
                        System.out.print("* ");
                    }
                }
            System.out.println();
        }



        // 2nd way
        for (int i =1; i <= rows; i++){
                for (int j =1; j <= i; j++) {
                    System.out.print("* ");
                    for (int k = 1; k <= rows-i+1; k++){
                        System.out.print("* ");
                    }
                }

            System.out.println();
        }
         */

        // star Pattern *
        //              * *
        //              *   *
        //              *     *
        //              * * * * *

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();

        System.out.println("*");

        if (n > 1) {
            for (int i = 2; i <= n - 1; i++) {
                System.out.print("* ");

                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();
            }

            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
        }

    }
}

class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       /*
        int temp = num;
        int sum = 0;

        while (temp > 0){

            int lastDigit = temp % 10;
            temp /= 10;
            sum += lastDigit;
            System.out.println(temp +" " + lastDigit + " " + sum);
        }
        System.out.printf("The sum of the digit %d is %d",num,sum);
        */

        // length of a number
       // int numberOfDigits = (int)Math.log10(num) + 1;

       // System.out.println(numberOfDigits);

        // Given Number is Palindrome or not

        int temp = num;
        int reverseNumber = 0;

        while (temp > 0){
            int lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            temp /= 10;
        }

        if (reverseNumber == num){
            System.out.println(num + " is a palindrome number.");
        }
        else {
            System.out.println(num + " is not a palindrome number.");
        }


    }
}

class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 1;

        do {
            System.out.print("Enter a Number: ");
            number = sc.nextInt();
            if (number == 0){
                break;
            }
            System.out.println("number is " + number);
        }
        while (number != 0);

    }
}

class Arrays {
    public static void main(String[] args) {

       /* String[] cars = {"suzuki", "Ferrari", "Audi", "BMW", "Ford", "Volvo"};
        int[] rollNumbers = {34, 12, 22, 15, 9, 2, 13};
        char[] ch = {'A', 'C', '%', '$', 'K', 'A'};

        int age[] = new int[5];

        double marks [] = {1.4, 4.5, 3.3};
        marks [0] = 12.5; // update a value in array
        */

        // int rollNos[], classes; // here rollNos is array (classes is a normal int)
        // int[] rollNos, classes; // here Both rollNos and classes Are arrays


//        System.out.println(cars[4]);
//        System.out.println(rollNumbers[2]);
//        System.out.println(ch[3]);
//        System.out.println(age[3]);
//        System.out.println(marks[0]);

        /*
        for (int i = 0; i< age.length; i++){
            System.out.println(i);
        }

        //for each loop
        for (String value : cars){
            System.out.println(value);
        }
         */

        // taking input from user and calculating their average marks
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of Students: ");
        int students = sc.nextInt();

        int marks[] = new int[students];

        for (int i = 0; i < students; i++){
            System.out.print("Enter Student " + (i+1) + " marks: ");
            marks [i] = sc.nextInt();
        }
         int avgMArks = 0;

        for (int i = 0; i < students; i++){
            avgMArks += marks[i];
        }

        avgMArks /= students;

        System.out.format("The Average marks of %d Students is %d",students,avgMArks );

    }
}

class MultiDimensionalArray {
    public static void main(String[] args){
        int a [][] = new int[5][3];

        int b[][] = {
                {10, 12, 16},
                {18, 19, 25},
                {13, 45, 67}};
        int c[][] = {
                {56, 78, 89},
                {53, 79, 90},
                {65, 70, 15}};

        int sum[][] = {
                {b[0][0] + c[0][0], b[0][1] + c[0][1], b[0][2] + c[0][2]},
                {b[1][0] + c[1][0], b[1][1] + c[1][1], b[1][2] + c[1][2]},
                {b[2][0] + c[2][0], b[2][1] + c[2][1], b[2][2] + c[2][2]}};

        System.out.println(sum);

           // System.out.println(b[3][3]);
    }
}

class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a matrix dimension: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];

        System.out.println("Enter value of matrix a: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter value of matrix b: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[rows][cols];
        System.out.println("result is: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of Student: ");
        int students = input.nextInt();


        int mark[] = new int[students];
        int avgMarks = 0;

        for (int i = 1; i <= students-1; i++){
            if ( i == 1) {
                System.out.print("Enter " + i + "st Student Mark: ");
            }
            if ( i == 2 ) {
                System.out.print("Enter " + i + "nd Student Marks: ");
            }
            if ( i == 3 ) {
                System.out.print("Enter " + i + "rd Student Marks: ");
            }
            if (i > 3 && i <= 20){
                System.out.print("Enter " + i + "th Student Marks: ");
            }
            mark[i] = input.nextInt();
        }

        for (int i = 1; i <= students-1; i++){
                avgMarks += mark[i];
        }

        avgMarks /= students;

        System.out.format("The Average marks of %d Students is %d",students,avgMarks );

    }
}

class StringsIntro {
    public static void main(String[] args) {
        String name = "             Mohammad Adnan          ";
        String cars = " Hyundai,Suzuki,Swift,Tata,Mahindra";
        String allCars[] = cars.split("i");
        String name2 = "Adnan"; // By Literals
        String myName = new String("mohammad adnan khan"); // By Object
        System.out.println(name == myName); // Heap memory (space)
        System.out.println(name == name2); // String Pool Area

        System.out.println(name.charAt(4));
        System.out.println(name.length());
        System.out.println(name.substring(0, 3));
        System.out.println(name.contains("Mohammad"));
        System.out.println(name.equalsIgnoreCase(myName));
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());
        System.out.println(name.concat("khan"));
        System.out.println(name.replace("Adnan", "khan"));
        for (String value: allCars){
            System.out.println(value);
        }
        System.out.println(name.indexOf("n"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
    }
}

class AnagramOfString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str = input.nextLine();

        System.out.print("Enter Second String: ");
        String str1 = input.nextLine();

        boolean isAnagram = false;
        boolean visited[] = new boolean[str1.length()];

        if (str.length() == str1.length()){
            for (int i =0; i< str.length(); i++){
                char c = str.charAt(i);
                isAnagram = false;
                for (int j =0; j< str1.length(); j++) {
                    if (str1.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram){
                    break;
                }
            }
        }

        if (isAnagram){
            System.out.println(str1 + " is anagram of " + str);
        }
        else {
            System.out.println("Not Anagram");
        }

    }
}

class AnagramAnotherMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String st = scan.nextLine();

        System.out.print("Enter Second String: ");
        String st1 = scan.nextLine();

        int star[] = new int[256];

        boolean isAnagram = true;

        for (char c: st.toCharArray()){
            int index = (int) c;
            star[index]++;
        }
        for (char c: st1.toCharArray()){
            int index = (int) c;
            star[index]--;
        }
        for (int i = 0; i < 256; i++){
            if (star[i] != 0){
                isAnagram = false;
                break;
            }
        }
        if (isAnagram){
            System.out.println(st1 + " is anagram of " + st);
        }
        else {
            System.out.println(st + "is not an anagram of " + st1);
        }
    }
}

class OopsClassCat {
    boolean hasFur;
    String color, breed;
    int legs, eyes;

    public void walk() {
        System.out.println("Cat is Walking.");
    }
    public void eat() {
        System.out.println("Cat is Eating.");
    }
    public void sleep() {
        System.out.println("Cat is Sleeping");
    }
    public void description() {
        System.out.printf("My cat has %d legs and %d eyes\n", legs, eyes);
    }
}

class  OopsObject {
    public static void main(String cat[]) {
        OopsClassCat cat1 = new OopsClassCat();
        OopsClassCat cat2 = new OopsClassCat();

        cat1.legs = 4;
        cat1.eyes = 2;

        cat2.legs = 3;
        cat2.eyes = 1;

        cat1.walk();
        cat2.eat();
        cat1.description();
        cat2.description();
    }
}

class PhoneClass {
    boolean hasScreen;
    float dimension;
    int weight, storage, battery;

    public void charge() {
            System.out.print("Enter Battery Percentage: ");
            Scanner input = new Scanner(System.in);
            int battery = input.nextInt();

        if (battery > 0 && battery <= 99) {
            System.out.println("Mobile is on and Charging now");
        }
        else if (battery < 1) {
            System.out.println("Mobile is turned off Please connect a Charger");
        }
        else if (battery == 100){
            System.out.println("Charging Full Please remove from Wall Socket.");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
    public void call() {
        System.out.println("On a call");
    }
    public void play() {
        System.out.println("Playing a game");
    }
}

class PhoneObject {
    public static void main(String phone[]){
        PhoneClass samsung = new PhoneClass();
        PhoneClass honorPlay = new PhoneClass();

        samsung.hasScreen = true;
        honorPlay.hasScreen = true;

        samsung.dimension = 13.6f;
        honorPlay.dimension = 11.5f;

        samsung.charge();

        honorPlay.charge();



    }
}

class DogClass {
    String breed, name;
    int legs, eyes;
    boolean isMale;

    public void jump() {
        System.out.printf("my dog %s is jumping.\n", name);
    }
    public void description() {
        System.out.printf("my dog name is %s and it's breed is %s.\n",name,breed);
    }
}

class DogObject {
    public static void main(String dog[]) {
        DogClass dog1 = new DogClass();
        DogClass dog2 = new DogClass();

        dog1.name = "Snaku";
        dog1.breed = "Labrador";
        System.out.print("is Male: ");dog1.isMale = true;
        dog1.jump();
        dog1.description();

        dog2.name = "Orgy";
        dog2.breed = "Pug";
        System.out.print("is Male: ");dog2.isMale = false;
        dog2.jump();
        dog2.description();
    }
}

class OopsOperations {
//    int x,y,z;
//    double a,b,c;
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }
    public double multiplication(double a, double b, double c) {
        return (a * b * c);
    }
    public static void main(String args[]){
        OopsOperations result1 = new OopsOperations();
        OopsOperations result2 = new OopsOperations();

        System.out.println(result1.sum(10,20,30));

        System.out.println(result2.multiplication(10.76,29.524,12.003));
    }
}

class Methods {
   static int maxOf(int x, int y){
        if (x > y){
            return x;
        }
        else {
            return y;
        }
    }

    public static void main(String args[]){
        int firstNumber = 345;
        int secondNumber = 243;

        int result = maxOf(firstNumber, secondNumber);
        System.out.println(result);
    }
}

class UserInputMethods {
    static int userInput(int a, int b,int c){
        return ((a*b)-(a+b)+(c-a));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = userInput(num1, num2,num3);
        System.out.println(result);
    }
}

class BuildingClass {
        int dimension;
        float area;
        byte floor;


    public void type() {
        System.out.println("This Building is a Cement Type");
    }
    public void stairs() {
        System.out.println("In our Building we have Stairs and Lift");
    }
    public void desc() {
        System.out.printf("We have %d dimension, %.2f sq.ft Area and %d floors.", dimension, area, floor);
    }
}

class BuildingObject {
    public static void main(String[] args) {
        BuildingClass building = new BuildingClass();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Floors");
        building.floor = sc.nextByte();

        System.out.println("Enter dimension");
        building.dimension = sc.nextInt();

        System.out.println("Enter area");
        building.area = sc.nextFloat();


        building.type();
        building.stairs();
        building.desc();
    }
}

class MathMethods {
    static int add(int a, int b, int c){
        return ((a+b+c)+(a+b+c));
    }
    static float remind(float x, float y){
        return (x%y);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 40;

        int sum = add(num1, num2, num3);
        float reminder = (float)remind(num1, num2);

        System.out.println(sum);
        System.out.println(reminder);
    }
}

class MethodCall{
    public static void main(String[] args) {
        MathMethods yes = new MathMethods();

            int num1 = 10;
            int num2 = 20;
            int num3 = 40;

            int sum = yes.add(num1, num2, num3);
            float reminder = (float)(yes.remind(num1, num2));

            System.out.println(sum);
            System.out.println(reminder);

    }
}

class MethodsDiff {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 10){
            hi();
            a++;
        }
    }
    static void hi(){
        System.out.println("Hello \nGood Morning");
    }
}

class PassByValue {
    public static void main(String[] args) {
        int c = 34;
        int d = 12;

        swap(c, d);

        System.out.println(c + " " + d);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class PassByValueNonPrimitive {
    public static void main(String[] args) {
        Dog c = new Dog();
        c.legs = 3;
        Dog d = new Dog();
        d.legs = 4;

        swap(c, d);

        Dog a = new Dog();
        a.legs = 4;
        changeDog(a);

        System.out.println(a.legs);

        System.out.println(c.legs + " " + d.legs);
    }
    static void swap(Dog a, Dog b){
        Dog temp = a;
        a = b;
        b = temp;
    }

    static void changeDog(Dog dog){
        dog.legs = 6;
    }
}

class Dog {
    int legs;
}