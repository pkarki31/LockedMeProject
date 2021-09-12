package com.java.project;

public class HandleOption extends LockMeProjectFile{

    static LockMeProjectFile obj = new LockMeProjectFile();
    static MenuOptions mo= new MenuOptions();

    public static void menuChoice(int choice){

        switch (choice){

            case 1:
                listAllFiles();
                mo.method();


            case 2:

                obj.askAction();

            case 3:
                System.out.println("\n"+"Thanks for using LockedMe.com !!!  Program exiting ....");
                System.exit(0);




        }
    }
}
