/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */

package ex25;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        String urpass = readText();
        int the_strength_of_the_pass_input;
        the_strength_of_the_pass_input = passwordValidator(urpass);

        The_PASS_of_the_string
                (the_strength_of_the_pass_input, urpass);
    }

    private static String readText() {
        System.out.print("Please enter your password now!: ");
        return in.nextLine();


    }
    public static boolean the_alphabet_of_string(String mbusa)

    {
        return ((mbusa != null)


                && (mbusa.matches("^[a-zA-Z]*$")));
    }

    public static boolean THE_NUMBERZ(String mbusa)
    {
        String doingit = "[0-9]+";

        Pattern patrnvar = Pattern.compile(doingit);
        if (mbusa == null) {

        }
        Matcher matchvar = patrnvar.matcher(mbusa);
        return matchvar.matches();
    }

    public static boolean thespeciallettr(String urpass){
        Pattern patrnvar = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher matchvar = patrnvar.matcher(urpass);

        return matchvar.find();

    }

    private static int passwordValidator(String urpass){
        if (urpass.length() < 8) {
            if (THE_NUMBERZ(urpass)) {
                return 1;
            }
            if (the_alphabet_of_string(urpass)) {
                return 2;
            }
        }

        else {
            if (!THE_NUMBERZ(urpass))
            {
                if (!thespeciallettr(urpass)){
                    return 3;


                }
                else if ( !THE_NUMBERZ(urpass))

                {
                    return 4;
                }
            }
        }
        return 5;
    }

    private static void The_PASS_of_the_string(int the_strength_of_the_pass_input, String urpass)


    {
        if (the_strength_of_the_pass_input == 1){

            System.out.printf("The password \'%s\' is a very weak password.", urpass);
        }
        if (the_strength_of_the_pass_input == 2){
            System.out.printf("The password \'%s\' is a weak password.", urpass);
        }
        if (the_strength_of_the_pass_input == 3){
            System.out.printf("The password \'%s\' is a strong password.", urpass);
        }
        if (the_strength_of_the_pass_input == 4){
            System.out.printf("The password \'%s\' is a very strong password.", urpass);

        }

    }
}

