package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String answer = input.nextLine();
        if (answer.equals("yes")) {
            System.out.println("you are cool");
        }
        else {
            System.out.println(":(");
        }
    }
}
