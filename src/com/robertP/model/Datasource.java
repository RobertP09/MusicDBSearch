package com.robertP.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datasource {
    //Setting up public constants for the database name and connection
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Robert\\Downloads\\music" + DB_NAME;

    //Constants for name of tables and rows
    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";

    public static final String TABLE_ARTIST = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    //Creating a connection Variable
    private Connection conn;

    //Function(method): opening the connection to the database
    public boolean open() {
        //Use a try catch statement in order to verify connection, if no connection then tell us error
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    //Function(method): that closes the connection
    public void close() {
        try {
            //If the connection is not null (not closed), close it
            if (conn != null) {
                conn.close();
            }
        }
        //Tell us why it wasn't closed
        catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }


}
