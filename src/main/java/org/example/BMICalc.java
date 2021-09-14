package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class BMICalc
{
    public static void main( String[] args )
    {
        //declare variables
        Scanner input = new Scanner(System.in);

        float weight, height, bmi;

        // Get input from user
        System.out.print("Enter your weight in lbs: ");
        weight = input.nextFloat();

        System.out.print("Enter your height in inches: ");
        height = input.nextFloat();

        bmi = (weight / (height * height)) * 703;
        //Display BMI
        System.out.println("Your BMI is "+bmi+ ".");

        //Display Result
        if (bmi <= 18.5)
            System.out.println("You are underweight. You should see your doctor.");
        else if (bmi >= 25)
            System.out.println("You are overweight. You should see your doctor.");
        else
            System.out.println("You are within the ideal weight range.");
    }
}
