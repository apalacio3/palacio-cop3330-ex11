/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConversion
{
    public static void main( String[] args )
    {
        System.out.print( "How many euros are you exchanging? " );
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        double c_from = Double.parseDouble(a);

        System.out.print( "What is the exchange rate? " );
        String b = input.nextLine();
        double rate  = Double.parseDouble(b);
        double c_to = rate * c_from;

        DecimalFormat d = new DecimalFormat("#.##");

        String output = d.format(c_from) + " euros at an exchange rate of "
                + rate + " is " + d.format(c_to) + " U.S. dollars.";

        System.out.println(output);
    }

}
