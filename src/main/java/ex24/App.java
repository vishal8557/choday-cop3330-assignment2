/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */

package ex24;


import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.println("Enter the first string: ");
        String the_first_string = in.next();

        System.out.println("Enter the second string: ");
        String the_second_string = in.next();

        if(isAnagram(the_first_string, the_second_string)){
            System.out.println("\"" +the_first_string+ "\"" + " and " + "\"" +the_second_string+ "\"" + " are anagrams");

        }
        else System.out.println("\"" +the_first_string+ "\"" + " and " + "\"" +the_second_string+ "\"" + " are not anagrams");

    }
    public static boolean isAnagram (String the_first_string, String the_second_string) {

        if (the_first_string.length()!= the_second_string.length())
            return false;

        char[] the_first_stringChar = the_first_string.toCharArray();
        Arrays.sort(the_first_stringChar);
        the_first_string= new String (the_first_stringChar);

        char[] the_second_stringChar = the_second_string.toCharArray();
        Arrays.sort(the_second_stringChar);
        the_second_string = new String (the_second_stringChar);

        if (the_first_string.equals(the_second_string))
            return true;
        else
            return false;
    }
}

