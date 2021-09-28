/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once they’ve been used. Storing the values in an array makes this process easier. Depending on your language, you may find it safer and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
Constraint
Use an array or list to store the names.
 */
package ex34;

import java.util.Scanner;

public class App
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {

        String[] The_Workers_there = {"John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"};

        String the_list_thats_finished_now[] = new String[The_Workers_there.length -1];
        // Print out the list of names when the program runs the first time.
        System.out.printf("There are %d employees:%n", The_Workers_there.length);
        for (int qqq = 0; qqq < The_Workers_there.length; qqq++){

            System.out.printf("%s%n", The_Workers_there[qqq]);

        }



        System.out.println("\nEnter an employee name to remove: ");
        Scanner input = new Scanner(System.in);
        String their_namez = input.nextLine();
        int qqq;
        int nvd;
        for (  qqq = 0; qqq < The_Workers_there.length; ++qqq )


            for (   nvd = 0; qqq < The_Workers_there.length;++qqq )
            {
                if (!their_namez.equals(The_Workers_there[qqq])){

                    the_list_thats_finished_now[nvd] = The_Workers_there[qqq];
                    ++nvd;

                }


            }
        // Display the remaining employees, each on its own line.
        System.out.printf("%nThere are %d employees:%n", the_list_thats_finished_now.length);

        for ( qqq = 0; qqq < the_list_thats_finished_now.length; ++qqq) {
            System.out.printf("%s%n", the_list_thats_finished_now[qqq]);
        }
    }

}

