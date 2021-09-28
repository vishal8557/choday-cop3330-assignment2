/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 29 - Handling Bad Input
The rule of 72 is a quick method for estimating how long it will take to double your investment, by taking the number 72 and dividing it by the expected rate of return. It’s a good tool that helps you figure out if the stock, bond, or savings account is right for you. It’s also a good program to write to test for and prevent bad input because computers can’t divide by zero. And instead of exiting the program when the user enters invalid input, you can just keep prompting for inputs until you get one that’s valid.

Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.

The formula is

years = 72 / r
where r is the stated rate of return.

Example Output
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.
Constraints
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.
 */
package ex29;

import java.util.Scanner;
public class App {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String This_is_the_rte_of_this_investment = "0";




        while (This_is_the_rte_of_this_investment.equals("0"))
        {
            System.out.print("What is the rate of return? ");
            This_is_the_rte_of_this_investment = in.nextLine();

            char[] this_is_the_array =This_is_the_rte_of_this_investment.toCharArray();




            int jag;
            for ( jag = 0; jag < this_is_the_array.length; ++jag)

            {

                if (!Character.isDigit(this_is_the_array[jag]) || This_is_the_rte_of_this_investment.equals("0")) {
                    This_is_the_rte_of_this_investment = "0";
                    System.out.println("Sorry. That's not a valid input.");
                    break;
                }
            }
        }


        int Your_ROI_Of_The_Investment = Integer.parseInt(This_is_the_rte_of_this_investment);


        int yrs_u_have = 72 / Your_ROI_Of_The_Investment;
        double what_you_have_left_now = yrs_u_have % 1;
        if (what_you_have_left_now!= 0.0)
        {
            yrs_u_have += 1.0;
        }
        yrs_u_have -= what_you_have_left_now;

        System.out.println("It will take " + yrs_u_have + " years to double your initial investment.");

    }
}

