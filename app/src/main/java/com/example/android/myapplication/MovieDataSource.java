package com.example.android.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/**
 * Created by Android on 20/03/2018.
 */

public class MovieDataSource {
    private final static Long ERROR_INSERT = -1l;
    private SQLiteDatabase _database;
    private MySQLiteHelper _dbHelper;
    private String[] _allColumns =
            {MySQLiteHelper.COLUMN_ID, MySQLiteHelper.COLUMN_DESC, MySQLiteHelper.COLUMN_PUBLISH,
                    MySQLiteHelper.COLUMN_NAME, MySQLiteHelper.COLUMN_AGE};

    //Constructor
    public MovieDataSource(Context context) {

        _dbHelper = new MySQLiteHelper(context);
    }

    public void open() throws SQLException {

        _database = _dbHelper.getWritableDatabase();
    }

    public void close() {

        _dbHelper.close();

    }


    public void insertMovie(Movie movieToSave) {

        if (movieToSave != null) {

            String id = movieToSave.getId();
            String Name = movieToSave.getName();
            int publish = movieToSave.getPubish();
            int age = movieToSave.getAge();
            String desc = movieToSave.getDesc();

            ContentValues values = new ContentValues();

            if (id != null) {
                values.put(MySQLiteHelper.COLUMN_ID, id);
                values.put(MySQLiteHelper.COLUMN_NAME, Name);
                values.put(MySQLiteHelper.COLUMN_DESC, desc);
                values.put(MySQLiteHelper.COLUMN_PUBLISH, publish);
                values.put(MySQLiteHelper.COLUMN_AGE, age);

            }


            long returnedResponse = 0;
            try {
                returnedResponse = _database.insert(MySQLiteHelper.MOVIES_TABLE_NAME, null, values);
            } catch (Exception e) {
                e.getMessage();
            }
            if (ERROR_INSERT == returnedResponse) {

                Log.d("Text", "Lior: DB: ERROR in inserting Person: id: " + id + " NAME: " + Name + " DESC: " + desc + " age: " + age + " publish: " + publish);

            } else {

                Log.d("Text", "Lior: DB: inserted new Person: id: " + id + " NAME: " + Name + " DESC: " + desc + " age: " + age + " publish: " + publish);

            }

        }
    }

    public Movie getPerson(String id) {

        Cursor cursor = null;
        Movie movie = null;
        return movie;

    }
}


