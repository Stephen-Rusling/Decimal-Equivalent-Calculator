//******************************************************************************************************************
// DecimalEquivalentCalculator.java
//
// This application prompts the user for the numerator and operator of a fraction as integers, then calculates
// and displays the decimal equivalent of the fraction.
//******************************************************************************************************************
import java.util.Scanner;

public class DecimalEquivalentCalculator
{
    public static void main(String[] args)
    {
        // Prompts user to input numerator and operator
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a numerator: ");
        int numerator = scan.nextInt();
        System.out.print("Please enter a denominator: ");
        int denominator = scan.nextInt();

        // Casts the integers to doubles, and then calculates and displays the decimal equivalent of the fraction.
        double decimal = (double) numerator / (double) denominator;
        System.out.println("Result: " + decimal);
    }
}