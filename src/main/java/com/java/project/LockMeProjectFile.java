package com.java.project;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LockMeProjectFile {

    static String choice=null;


    // Method which will displace all list of files
    public static void listAllFiles(){

        File folder = new File("FileDirectory");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> list = new ArrayList<String>();

        for(File file : listOfFiles){

            list.add(file.getName());

        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));

        }


    }

    public static void askAction(){

        System.out.println("Please enter what action you want to perform from below options : "+"\n");

        System.out.println("Add  new File : Enter 'Add' "+"\n");
        System.out.println("Delete a File : Enter 'Delete' "+"\n");
        System.out.println("Search a File : Enter 'Search' "+"\n");
        System.out.println("List All Files: Enter 'List' "+"\n");

        Scanner sc = new Scanner(System.in);

        choice = sc.next();

        System.out.println("\n");
    }






    public static void main(String [] args){

        System.out.println("********   Welcome to LockedMe.com   ********"+"\n");


        System.out.println("Developer Details ");

        System.out.println("Name : Pankaj Singh Karki"+"\n"+"Email: pankaj.karki31@gmail.com"+"\n");

        System.out.println("Below are current list of Files in Directory"+"\n");

        listAllFiles();

        System.out.println("\n");

        askAction();

        if(choice.equalsIgnoreCase("List")){

            System.out.println(" Below are current list of File :"+"\n");
            listAllFiles();
            askAction();

        }

        else if(choice.equalsIgnoreCase("Add")){


        }


        else if(choice.equalsIgnoreCase("Delete")){


        }

        else if(choice.equalsIgnoreCase("Search")){


        }

        else {
            System.out.println("Invalid choice entered . Please try again");
        }

    }
}
