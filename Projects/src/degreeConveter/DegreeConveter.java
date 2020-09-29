package degreeConveter;

import java.util.Scanner;

public class DegreeConveter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

        float celsius = (fahrenheit-32)/1.8f;

        char degree = '\u00B0';

        System.out.printf("Fahrenheit : %.0f%cF\n", fahrenheit,degree);
        System.out.printf("Celsius : %f%cC", celsius,degree);
    }
}
