package com.example.hanshu.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hanshu.database.persondb.PersonDataBase;
import com.example.hanshu.database.persondb.PersonTableData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonDataBase helper=new PersonDataBase(this);
        SQLiteDatabase db=helper.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(PersonTableData.Person.COLUMN_NAME_1,"haha");
        values.put(PersonTableData.Person.COLUMN_NAME_2,"123456789");
        db.insert(PersonTableData.Person.TABLE_NAME,null,values);

    }
}
