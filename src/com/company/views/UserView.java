package com.company.views;

import com.company.models.User;

import java.util.Scanner;

public class UserView {
    private String input;


    public String startMenu() {
        System.out.println("1. Login As User");
        System.out.println("2. Create New User");
        System.out.println("3. Exit\n");
        System.out.println("Select An Option: ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        return choice;
    }

    public String createUser() {
        System.out.println("Select A Name: ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        return choice;
    }

    //public int login() {



    //}

    public String exit(){
        System.out.println("Exiting, Save Changes To File?(Y or N): ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        return choice;
    }
    public void invalidchoice1(){
        System.out.println("Invalid, Please Select One Of The Given Choices\n");

    }
}