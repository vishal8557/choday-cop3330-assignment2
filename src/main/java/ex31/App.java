/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself. The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm
Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
 */
package ex31;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Give me your age now. ");
        int age_that_was_inputted;


        age_that_was_inputted = input.nextInt();


        System.out.print("Give me your resting heart rate now. ");
        int ur_rest_hrt_rte;
        ur_rest_hrt_rte = input.nextInt();


        System.out.println("Resting Pulse: " + ur_rest_hrt_rte + "     Age: " + age_that_was_inputted);


        System.out.println("\nIntensity    | Rate");
        System.out.println("-------------|--------");

        double audq;
        for ( audq = 0.55; audq < 1; audq = audq +.05) {
            double beats_per_Minute;
            beats_per_Minute = (((220 - age_that_was_inputted) - ur_rest_hrt_rte) * audq) + ur_rest_hrt_rte;


            System.out.printf("%.0f%%\t\t\t | %.0f bpm\n", audq * 100, beats_per_Minute );



        }
    }
}

