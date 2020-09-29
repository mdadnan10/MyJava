import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class revision {
    public static void main(String[] args){
//        System.out.println("Hello CodyAdnan!!");
//
//        String name = "Hello using String variable";
//        System.out.println(name);
//
//        int today = 23;
//        System.out.println("Today Date = " + today);
//
//        float num = 32.56f;
//        System.out.println(num);
//
//        double num1 = 234.745673;
//        System.out.println(num1);
//
//        char rupee = '\u20B9';
//        System.out.println(rupee);
//
//        boolean india = true;
//        System.out.println(india);


//        concardination
//        String fname = "Md", mname = " Adnan ", lname = "Khan";
//        String fullname = fname + mname + lname;
//        System.out.println(fullname);
//        System.out.println(fname + mname + lname);
//
//        int age = 20, date = 10, year = 2000;
//        String month = "July ";
//        String th = "th ";
//        System.out.println("My Age " + age);
//        System.out.print("My DOB " + date+th + month + year);

//        oprators
//        int a = 10, b = 20;
//        a += 20;
//        b -= 10;
//        b *= 10;
//        a /= 5;
//        a %= 5;
//        b &= 5;
//        a |= 5;
//        b ^= 2;
//        a >>= 3;
//        b <<= 2;
//        System.out.println(a);
//        System.out.println(b);
//        float f = 24.55f, f1 = 10.45f;
//        double d = 99.999, d1 = 0.01;
//        System.out.println(a + b);
//        System.out.println(b - a);
//        System.out.println(a * b);
//        System.out.println(b / a);
//        System.out.println(b % a);
//        System.out.println(f + f1);
//        System.out.println(f - f1);
//        System.out.println(f * f1);
//        System.out.println(f / f1);
//        System.out.println(f % f1);
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(--a);
//        System.out.println(a--);
//        System.out.println(a);

//        Scanner myobj = new Scanner(System.in);
//        System.out.print("Please enter betwwen 1 - 5: ");
//        int num2 = myobj.nextInt();
//        switch (num2){
//            case 1:
//                System.out.println("Sum of Two number is: " );
//                break;
//            case 2:
//                System.out.println("Substraction of Two number is: " );
//                break;
//            case 3:
//                System.out.println("Multiplication of Two Number is: " );
//                break;
//            case 4:
//                System.out.println("Division of Twonumber is: " );
//                break;
//            case 5:
//                System.out.println("Modulus of Two Number is: ");
//                break;
//            default:
//                System.out.println("please Enter correctly.");
//        }

//        LocalDate date = LocalDate.now();
//        System.out.println("Today date is: " + date);
//        LocalTime time = LocalTime.now();
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your Age to see who you are: ");
//        int age = scan.nextInt();
//
//        if (age >= 18 && age <= 50){
//            System.out.println("You are an Adult Now.");
//        }
//        else if (age >= 51 && age <= 60) {
//            System.out.println("You are going to be a Senior Citizen.");
//        }
//        else if (age == 65){
//            System.out.println("You are Senior Citizen with pension");
//        }
//        else {
//            System.out.println("you Are a Kid.");
//        }
//
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Enter two Number: ");
//        double first = reader.nextDouble();
//        double second = reader.nextDouble();
//        System.out.println("Enter an Oprator (+, -, *, /): ");
//        char oprator = reader.next().charAt(0);
//        double result;
//        switch (oprator){
//            case '+':
//                result = first + second;
//                break;
//            case '-':
//                result = first - second;
//                break;
//            case '*':
//                result = first * second;
//                break;
//            case '/':
//                result = first / second;
//                break;
//            default:
//                System.out.println("error please enter Correct oprator");
//                return;
//        }
//
//        System.out.printf("%.1f %c %.1f = %.1f", first, oprator, second, result);
//        System.out.println(first + oprator + second ": " + result);

//        int age = 25;
//        System.out.printf("i am %d years old.", age);


//        Scanner data = new Scanner(System.in);
//        System.out.print("Enter Two number: ");
//        double first = data.nextDouble();
//        double second = data.nextDouble();
//
//        System.out.println("Select oprators (+, -, *, /): ");
//        char oprator = data.next().charAt(0);
//
//        double result;
//        switch (oprator){
//            case '+':
//                result = first + second;
//                break;
//            case '-':
//                result = first - second;
//                break;
//            case '*':
//                result = first * second;
//                break;
//            case '/':
//                result = first / second;
//                break;
//            default:
//                System.out.println("Error! please enter correct oprator.");
//                return;
//        }
//        System.out.printf("%.1f %c %.1f = %.1f", first, oprator, second, result);


        for (int i = 10; i >= 10 && i <= 20; i++){
            System.out.println(i);
        }

    }
}