package com.java.project;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LockMeProjectFile {

    static String choice=null;

    static Scanner sc = new Scanner(System.in);

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

            System.out.println(list.get(i)+"\n");


        }


    }

    // Method which will add a File to FileDirectory
    public static void addFile(String fileName){

        try {
            File myObj = new File("FileDirectory/"+fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName()+"\n");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    // Method which will delete a File from FileDirectory
    public static void deleteFile(String fileName){
        File file = new File("FileDirectory/"+fileName);

        if(file.delete())
        {
            System.out.println("\n"+fileName+" file deleted successfully");
        }
        else
        {
            System.out.println("\n"+fileName+" not found in directory since Failed to delete the file");
        }
    }

    // Method which will search a File from FileDirectory
    public static void searchFile(String fileName){

        File folder = new File("FileDirectory");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> list = new ArrayList<String>();

        for(File file : listOfFiles){

            list.add(file.getName());
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){

            if(fileName.equalsIgnoreCase(list.get(i))){

                System.out.println(list.get(i)+" < < < < here is your file "+"\n");
            }

            else {
                System.out.println(list.get(i) + "\n");

            }


        }



//            if(list.contains(fileName)) {
//
//                System.out.println("\n" + "Yes " + fileName + " is currently present in directory."+"\n");
//
//            }
//
//            else{
//                System.out.println("\n"+" Sorry "+fileName+" not present in directory."+"\n");
//            }






    }

    public static void askAction(){

        System.out.println("Please enter what action you want to perform from below options : "+"\n");

        System.out.println("Add  new File : Enter 'Add' "+"\n");
        System.out.println("Delete a File : Enter 'Delete' "+"\n");
        System.out.println("Search a File : Enter 'Search' "+"\n");
        System.out.println("List All Files: Enter 'List' "+"\n");
        System.out.println("Exit from program : Enter 'Exit' "+"\n");

         sc = new Scanner(System.in);

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

            while (choice.equalsIgnoreCase("List") || choice.equalsIgnoreCase("Add") ||

                    choice.equalsIgnoreCase("Delete") || choice.equalsIgnoreCase("Search")  ||
                    choice.equalsIgnoreCase("Exit")) {

                if (choice.equalsIgnoreCase("List")) {

                    System.out.println(" Below are current list of File :" + "\n");
                    listAllFiles();
                    askAction();

                } else if (choice.equalsIgnoreCase("Add")) {

                    System.out.println("Enter File name you want to create with extension e.g : .txt , .xls or .csv ");
                    Scanner scAdd = new Scanner(System.in);
                    String filename = scAdd.next();
                    addFile(filename);
                    System.out.println("Below is current list of files in Directory :"+"\n");
                    listAllFiles();
                    askAction();


                } else if (choice.equalsIgnoreCase("Delete")) {

                    System.out.println("Enter File name you want to delete with correct extension :");
                    Scanner scDelete = new Scanner(System.in);
                    String filename = scDelete.next();
                    deleteFile(filename);
                    System.out.println("Below is current list of files in Directory :"+"\n");
                    listAllFiles();
                    askAction();


                } else if (choice.equalsIgnoreCase("Search")) {


                    System.out.println("Enter File name you want to search with correct extension :");
                    Scanner scDelete = new Scanner(System.in);
                    String filename = scDelete.next();
                    searchFile(filename);
                    askAction();

                } else if (choice.equalsIgnoreCase("Exit")) {

                    System.exit(0);

                } else {
                    System.out.println("Invalid choice entered . Please try again");
                }
            }




            System.out.println("Invalid choice entered . Please try again");




    }
}
