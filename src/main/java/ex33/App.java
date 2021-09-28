/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program. If you combine that with a random number generator, you can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and select one at random.
 */
package ex33;

import java.util.Scanner;
import java.util.List;
public class App {
    public static void main(String[] args) {

        int inputtingnow;
        inputtingnow = 0;
        String[] ANSWER_CHOICES_AVAILABLE = {"Yes", "No", "Maybe", "Ask again later"};
        Scanner input = new Scanner(System.in);

        System.out.print("What's your question? ");

        String question = input.nextLine();

        inputtingnow = (int) (Math.random() * 4);

        System.out.println("\n" +ANSWER_CHOICES_AVAILABLE[inputtingnow]);


    }
}


