package percentageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class percentageCalculator {
    public static void main(String[] args) {

        final float fullMark = 600;
        final float totalPercentage = 100;
        int hindiMark = 0;
        int englishMark = 0;
        int mathMark = 0;
        int physicsMark = 0;
        int chemistryMark = 0;
        int bioMark = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Hindi Mark : ");
            hindiMark = input.nextInt();
            if (hindiMark >= 0 && hindiMark <= 100){
                break;
            }
            System.out.println("Mark must be in between 0 to 100 Enter Mark is " + hindiMark);
        }
        while (true) {
            System.out.print("Enter English Mark : ");
            englishMark = input.nextInt();
            if (englishMark >= 0 && englishMark <= 100) {
                break;
            }
            System.out.println("Mark must be in between 0 to 100 Enter Mark is " + englishMark);
        }

        while (true) {
            System.out.print("Enter Mathematics Mark : ");
            mathMark = input.nextInt();
            if (mathMark >= 0 && mathMark <= 100) {
                break;
            }
            System.out.println("Mark must be in between 0 to 100 Enter Mark is " + mathMark);
        }

        while (true) {
            System.out.print("Enter Physics Mark : ");
            physicsMark = input.nextInt();
            if (physicsMark >= 0 && physicsMark <= 100) {
                break;
            }
            System.out.println("Mark must be in between 0 to 100 Enter Mark is " + physicsMark);
        }

        while (true) {
            System.out.print("Enter Chemistry Mark : ");
            chemistryMark = input.nextInt();
            if (chemistryMark >= 0 && chemistryMark <= 100) {
                break;
            }
            System.out.println("Mark must be in between 0 to 100 Enter Mark is " + chemistryMark);
        }

        while (true) {
            System.out.print("Enter Biology Mark : ");
            bioMark = input.nextInt();
            if (bioMark >= 0 && bioMark <= 100) {
                break;
            }
            System.out.println("Mark must be in between 0 to 100 Enter Mark is " + bioMark);
        }

        int securedMarks = hindiMark + englishMark + mathMark + physicsMark + chemistryMark + bioMark;
        float securedPercentage = ((float)securedMarks / fullMark) * totalPercentage;

        char symbol = '%';

        if (securedPercentage < 33){
            System.out.printf("\nSecured Mark : %d \nSecured Percentage : %.2f%c\nYour Grade : 'F'\n",securedMarks,securedPercentage,symbol);
        }
        else if (securedPercentage > 33 && securedPercentage <= 40){
            System.out.printf("\nSecured Mark : %d \nSecured Percentage : %.2f%c\nYour Grade : 'E'\n",securedMarks,securedPercentage,symbol);
        }
        else if (securedPercentage > 40 && securedPercentage <= 50){
            System.out.printf("\nSecured Mark : %d \nSecured Percentage : %.2f%c\nYour Grade : 'D'\n",securedMarks,securedPercentage,symbol);
        }
        else if (securedPercentage > 50 && securedPercentage <= 60){
            System.out.printf("\nSecured Mark : %d \nSecured Percentage : %.2f%c\nYour Grade : 'C'\n",securedMarks,securedPercentage,symbol);
        }
        else if (securedPercentage > 60 && securedPercentage <= 70){
            System.out.printf("\nSecured Mark : %d \nSecured Percentage : %.2f%c\nYour Grade : 'B'\n",securedMarks,securedPercentage,symbol);
        }
        else if (securedPercentage > 70 && securedPercentage <= 80){
            System.out.printf("\nSecured Mark : %d \nSecured Percentage : %.2f%c\nYour Grade : 'B+'\n",securedMarks,securedPercentage,symbol);
        }
        else if (securedPercentage > 80 && securedPercentage <= 90){
            System.out.printf("\nSecured Mark : %d \nSecured Percentage : %.2f%c\nYour Grade : 'A'\n",securedMarks,securedPercentage,symbol);
        }
        else if (securedPercentage > 90 && securedPercentage <= 100){
            System.out.printf("\nSecured Mark : %d \nSecured Percentage : %.2f%c\nYour Grade : 'A+'\n",securedMarks,securedPercentage,symbol);
        }

            if (hindiMark < 30) {
                System.out.println("Hindi Mark : " + hindiMark + "(Fail)");
            }
            if (englishMark < 30) {
                System.out.println("English Mark : " + englishMark + "(Fail)");
            }
            if (mathMark < 30) {
                System.out.println("Math Mark : " + mathMark + "(Fail)");
            }
            if (physicsMark < 30) {
                System.out.println("Physics Mark : " + physicsMark + "(Fail)");
            }
            if (chemistryMark < 30) {
                System.out.println("Chemistry Mark : " + chemistryMark + "(Fail)");
            }
            if (bioMark < 30) {
                System.out.println("Biology Mark : " + bioMark + "(Fail)");
            }

    }
}

/*
>90 A+
>80 A
>70 B+
>60 B
>50 C
>40 D
>30 E
 */
