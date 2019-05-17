package com.robertP;

import com.robertP.model.Artist;
import com.robertP.model.Datasource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Create an instance of our Datasource class
        Datasource datasource = new Datasource();
        //Open the database if its not open
        if (!datasource.open()){
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists();
        //If we get no artists, we print null;
        if (artists == null){
            System.out.println("No Artists!");
            return;
        }
        //Cycling through all the entries we received
        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }
        //closes the database when were done
        datasource.close();
    }
}
