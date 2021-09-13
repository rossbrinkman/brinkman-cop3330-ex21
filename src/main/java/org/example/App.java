package org.example;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;
        String month;

        System.out.println( "Please enter the number of the month: " );
        while (true) {
            try {
                monthNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input. Must be a number: ");
                scanner.next();
            }
        }

        switch (monthNumber)
        {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("Invalid Number. Months are numbers 1-12");
                month = "";
                System.exit(0);
        }
        System.out.println("The name of the month is " + month + ".");

        scanner.close();
    }
}
