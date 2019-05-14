package com.robertP;

import com.robertP.model.Datasource;

public class Main {

    public static void main(String[] args) {
        //Create an instance of our Datasource class
        Datasource datasource = new Datasource();
        //Open the database if its not open
        if (!datasource.open()){
            System.out.println("Can't open datasource");
        }

        //closes the database when were done
        datasource.close();
    }
}
