/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Vishal Choday
 */
/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.
Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
 */
package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){




        System.out.println("Enter the first name: ");
        String The_First_Name_Inputted = in.next();
        System.out.println("Enter the last name: ");
        String UR_LAST_NAME_INPUTTED = in.next();
        System.out.println("Enter the ZIP code: ");
        String zipcode_inurarea = in.next();
        System.out.println("Enter the employee ID: ");
        String ID_OF_THE_WORKER = in.next();

        int thevalidFirst = letsvalidateifirstnow(The_First_Name_Inputted);
        int whatsvalidlast = validatingitlast(UR_LAST_NAME_INPUTTED);
        boolean thezipcodethatsvalid = itszipthatisnowvalidated(zipcode_inurarea);
        boolean identification_thats_valid = letsvalidateId(ID_OF_THE_WORKER);

        validateInput(The_First_Name_Inputted, thevalidFirst, UR_LAST_NAME_INPUTTED, whatsvalidlast, zipcode_inurarea, thezipcodethatsvalid, ID_OF_THE_WORKER, identification_thats_valid);

    }

    private static void validateInput(String The_First_Name_Inputted, int thethingthatisvalidFirst, String UR_LAST_NAME_INPUTTED, int whatsvalidlast, String zipcode_inurarea, boolean thezipcodethatsvalid, String ID_OF_THE_WORKER, boolean identification_thats_valid) {



        if (thethingthatisvalidFirst == 0){
            System.out.println("The first name must be filled in.");
        }
        else if (thethingthatisvalidFirst == 1) {
            System.out.println("Enter the first name: " + The_First_Name_Inputted);
        }
        else {
            System.out.println("The first name must be at least 2 characters long.");
        }

        if (whatsvalidlast == 0){
            System.out.println("The last name must be filled in.");
        }
        else if (whatsvalidlast == 1) {
            System.out.println("Enter the first name: " + UR_LAST_NAME_INPUTTED);
        }
        else {
            System.out.println("The last name must be at least 2 characters long.");
        }

        if (thezipcodethatsvalid){
            System.out.println("Enter the ZIP code: " + zipcode_inurarea);
        }
        else{
            System.out.println("The employee ID must be in the format of AA-1234.");
        }

        if (identification_thats_valid){
            System.out.println("Enter the ZIP code: " + ID_OF_THE_WORKER);
        }
        else {
            System.out.println("The zipcode must be a 5 digit number.");

        }


        if(thethingthatisvalidFirst == 1 && whatsvalidlast == 1 && identification_thats_valid == true && identification_thats_valid == true){
            System.out.println("There are no errors.");
        }
    }

    private static int letsvalidateifirstnow(String thetextofit) {
        if (thetextofit.length() < 3){
            if (thetextofit.length() == 0){
                return 0;
            }

            return 2;
        }
        return 1;
    }

    private static int validatingitlast(String thetextofit) {
        if (thetextofit.length() < 3){
            if (thetextofit.length() == 0){
                return 0;
            }
            return 2;
        }
        return 1;
    }

    public static boolean itszipthatisnowvalidated(String text)
    {
        String mbusa = "[0-9]+";
        Pattern p = Pattern.compile(mbusa);
        if (text == null) {
            return false;
        }

        Matcher m = p.matcher(text);
        return m.matches();
    }


    private static boolean letsvalidateId(String text) {
        char[] ch = new char[8];
        for (int i = 0; i < text.length(); i++){
            ch[i] = text.charAt(i);
        }
        return false;
    }

}

