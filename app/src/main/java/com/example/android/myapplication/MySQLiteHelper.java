package com.example.android.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Android on 20/03/2018.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {
    public static final String 	MOVIES_TABLE_NAME 	= "movies";
    public static final String 	COLUMN_ID 		= "id";
    public static final String 	COLUMN_NAME 	= "name";
    public static final String 	COLUMN_DESC	= "desc";
    public static final String 	COLUMN_AGE 		= "age";
    public static final String 	COLUMN_PUBLISH		= "publish";

    private static final String 	DATABASE_NAME 		= "movies.db";
    private static final int 	DATABASE_VERSION 	= 1;
    private static final String DATABASE_CREATE =
            "CREATE TABLE " + MOVIES_TABLE_NAME +
                    "(" + COLUMN_ID + " text primary key, " +
                    COLUMN_NAME + " text not null, " +
                    COLUMN_DESC + " text, " +
                    COLUMN_AGE + " integer not null," +
                    COLUMN_PUBLISH + " integer not null" +
                    ");";

    public MySQLiteHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);


    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        database.execSQL(DATABASE_CREATE);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.d("Text", "Lior: " +
                "Upgrading database from version " + oldVersion + " to "
                + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + MOVIES_TABLE_NAME);
        onCreate(db);

    }

    public void onOpen(SQLiteDatabase db) {

        super.onOpen(db);

    }

}

