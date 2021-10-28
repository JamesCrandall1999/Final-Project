package com.company.controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LoadMovieList {
    private BufferedReader in;
    private String[] lines;

    public LoadMovieList() {
        try {
            Path thePath = Paths.get("src/Public Movie List Save");
            in = new BufferedReader(new FileReader(String.valueOf(thePath)));
            List<String> lines = new ArrayList<>();
            String line = null;
            try {


                line = in.readLine();
                while (line != null) {
                    lines.add(line);
                    line = in.readLine();
                }


            }catch(IOException e) {
            e.printStackTrace();
        }



        }catch (IOException e) {
            e.printStackTrace();


        }
    }
}
