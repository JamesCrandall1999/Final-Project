package com.company.controllers;

import com.company.models.Movie;
import com.company.views.UserView;

public class Main {
    public static UserView view;
    public static String choice;
    public static int currentIdentity;
    public static int movienumber;
    public static String currentName;
    public static void main(String[] args) {

        LoadMovieList LoadMovies = new LoadMovieList();
        SaveMovieList SaveMovies = new SaveMovieList();
        Movie[] movies = new Movie;

       view = new UserView();
       choice = view.startMenu();
       switch(choice){
           case "1":
               //currentIdentity = view.login();
                break;
           case "2":
               currentName = view.createUser();
               break;
           case "3":
               view.exit();
               break;
           default:
               view.invalidchoice1();
       }



    }

    private static Movie[] convertToMovie() {
        String movieinfo[];

        Movie temp;

        return temp;
    }
}




