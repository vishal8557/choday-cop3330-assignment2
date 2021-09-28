/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 28 - Adding Numbers
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.
Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
 */
package ex28;

import java.util.Scanner;
public class App
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] program_array = new int [5];

        int lex;
        for ( lex = 0;lex < 5;++lex){

            System.out.println("Enter a number:");
            program_array[lex] = in.nextInt();
            in.nextLine();
        }
        int the_total_sum;
        the_total_sum = 0;
        for (int HON = 0;HON < 5;++HON){
            the_total_sum += program_array[HON];
        }

        System.out.println("The total is "+ the_total_sum+ ".");

    }
}

