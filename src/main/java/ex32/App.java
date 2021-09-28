package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 32 - Guess the Number Game
Write a Guess the Number game that has three levels of difficulty. The first level of difficulty would be a number between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be between 1 and 1000.

Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and prompts the player to guess that number. Each time the player guesses, the computer should give the player a hint as to whether the number is too high or too low. The computer should also keep track of the number of guesses. Once the player guesses the correct number, the computer should present the number of guesses and ask if the player would like to play again.

Example Output
Let's play Guess the Number!

Enter the difficulty level (1, 2, or 3): 1
I have my number. What's your guess? 5
Too low. Guess again: 7
Too low. Guess again: 9
You got it in 3 guesses!

Do you wish to play again (Y/N)? y

Enter the difficulty level (1, 2, or 3): 3
I have my number. What's your guess? 500
Too low. Guess again: 750
Too high. Guess again: 600
Too low. Guess again: 700
Too low. Guess again: 725
Too high. Guess again: 715
Too high. Guess again: 710
Too high. Guess again: 705
Too high. Guess again: 701
Too low. Guess again: 702
You got it in 10 guesses!

Do you wish to play again (Y/N)? n
Constraints
Don’t allow any non-numeric data entry.
During the game, count non-numeric entries as wrong guesses.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean MBUSA = true;
        System.out.println("Lets play Guess the Number!\n");
        System.out.println();

        while(MBUSA)
        {
            Guessing_GAME();
            MBUSA = continueOrStop();
        }
    }

    private static void Guessing_GAME() {

        Random this_is_randomizations = new Random();
        int Lets_count_this_now;
        Lets_count_this_now = 0;
        int WHT_DIFF_LEVEL_U_WNT;
        WHT_DIFF_LEVEL_U_WNT = getValidInputs("Enter the difficulty level (1, 2, or 3): ");

        int FOR_THE_MAXIMUM = (int) Math.pow(10, WHT_DIFF_LEVEL_U_WNT);
        int appl = this_is_randomizations.nextInt(FOR_THE_MAXIMUM) + 1;
        int THE_INTEGER_THATS_THERE_NOW;

        THE_INTEGER_THATS_THERE_NOW = getValidInputs("I have my number. What's your guess?");

        while(true){
            Lets_count_this_now += 1;
            if (THE_INTEGER_THATS_THERE_NOW > appl){
                THE_INTEGER_THATS_THERE_NOW = getValidInputs("Too high. Guess again:");
            }
            else if (THE_INTEGER_THATS_THERE_NOW  < appl) {
                THE_INTEGER_THATS_THERE_NOW = getValidInputs("Too low. Guess again:");
            }
            else{
                System.out.printf("You got it in %d guesses!\n", Lets_count_this_now);
                System.out.println();
                break;
            }
        }
    }
    private static boolean continueOrStop(){
        System.out.println("Do you wish to play again (Y/N)? ");
        String THE_Y_OR_N = in.next();
        return THE_Y_OR_N.equals("y") && THE_Y_OR_N.equals("Y");
    }
    private static boolean checkIfDoubleNonZeroValueNonEmpty(String integer) {

        if (integer.isEmpty()) {
            return false;
        }
        try {
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static int getValidInputs(String BRINGABOUT) {
        int THE_NUMBER_THATS_USED;

        System.out.println(BRINGABOUT);
        String what_we_r_putting_in_NOW = in.nextLine();

        if (!checkIfDoubleNonZeroValueNonEmpty(what_we_r_putting_in_NOW)) {
            return 0;
        } else {

            THE_NUMBER_THATS_USED = Integer.parseInt(what_we_r_putting_in_NOW);
        }

        return  THE_NUMBER_THATS_USED;
    }
}




