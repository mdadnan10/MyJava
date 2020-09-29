package mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final int percent = 100;
        final int monthsInYear = 12;
        int principal = 0;
        float rate = 0;
        byte year = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Principal: ");
            principal = input.nextInt();
            if (principal > 0){
                break;
            }
            System.out.printf("Please Enter a Positive Number Given Number(%d) is Negative\n", principal);
        }

        while (true) {
            System.out.print("Enter Rate: ");
            rate = input.nextFloat();
            if (rate > 0 ){
                break;
            }
            System.out.printf("Rate is always positive Given Number(%.2f) is Negative\n", rate);
        }
        float monthlyRate = rate / percent / monthsInYear;

        while (true) {
            System.out.print("Enter Duration(in Year): ");
            year = input.nextByte();
            if (year > 0){
                break;
            }
            System.out.printf("Please Provide positive number in year Given Number(%d) is Negative\n", year);
        }
        int numberOfMonths = year * monthsInYear;

        double mortgage = principal * (monthlyRate * (Math.pow(1 + monthlyRate, numberOfMonths))) /
                (Math.pow(1+monthlyRate, numberOfMonths) - 1);

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("Mortgage(Monthly EMI) : " + mortgageFormat);
    }
}
