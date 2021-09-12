package com.java.project;

import java.util.Scanner;

public class MenuOptions {

    static int choiceMainMenu =0;
    static HandleOption h = new HandleOption();


    public static void method(){

        System.out.println("\n"+"*****   Select any option number from below and press Enter   *****");

        System.out.println("\n"+"1. Retrieve all files .");

        System.out.println("\n"+"2. Display menu for file operation .");

        System.out.println("\n"+"3. Exit program .");

        Scanner sc = new Scanner(System.in);

        try {
        choiceMainMenu = sc.nextInt();

        h.menuChoice(choiceMainMenu);
        }
        catch(Exception e){

            System.out.println("\n"+"Invalid choice entered");
            method();
        }


    }

}
