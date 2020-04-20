package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String have_cough;
        String have_chest_pain;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello I am your Virtual Doctor.");
        //temperature
        System.out.println("What is your temperature?");
        int temperature = input.nextInt();
        if(temperature<36 || temperature>42) {
            System.out.println("Are you sure? Please enter value from 36 to 42 deg");
            System.out.println("Please enter your temperature again");
            temperature = input.nextInt();
        }

        //cough
        System.out.println("Do you have a cough?");
        have_cough = input.next();
        if (!(have_cough.equals("Yes") || have_cough.equals("No"))) {
            System.out.println("Please give answer Yes or No:");
            have_cough = input.next();
        }

        //chest pain
        System.out.println("Do you have a chest pain?");
        have_chest_pain = input.next();
        if (!(have_chest_pain.equals("Yes") || have_chest_pain.equals("No"))) {
            System.out.println("Please give answer Yes or No:");
            have_chest_pain = input.next();
        }

        //diagnosis

        System.out.println("Diagnosis:");

        if ((temperature>=38) && (have_cough.equals("Yes") || have_chest_pain.equals("Yes"))) {
            System.out.println("You have a flu/fever symptons.");
            System.out.println("Take pain killers and cough syrup. Monitor temperature once an hour");
            System.out.println("If temperature stays high contact your doctor ");
        }
        else if ((temperature<38) && (have_cough.equals("Yes") || have_chest_pain.equals("Yes"))) {

            System.out.println("You have flu symptoms. Take a ginger shot and stay calm");
            System.out.println("Stay home and rest. If temperature is not rising everything will be fine");
            System.out.println("In case you will feel worst, contact us immediately");
        }
        else if ((temperature>=38) && (have_cough.equals("No"))  && (have_chest_pain.equals("No")) ) {

            System.out.println("Your temperature is too high please take drugs.");
            System.out.println("If after hour your temparture stay high, contact us immediately");
        }
        else {
            System.out.println("You are fine. Do not panic :)");
            System.out.println("Stay home and rest");
        }
    }
}
