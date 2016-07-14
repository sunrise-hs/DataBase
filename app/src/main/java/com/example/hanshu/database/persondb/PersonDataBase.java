package com.example.hanshu.database.persondb;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.nfc.Tag;
import android.util.Log;

/**
 * Created by HanShu on 2016/7/14.
 */
public class PersonDataBase extends SQLiteOpenHelper {
    private static final String TAG = "PersonDataBase";
    public PersonDataBase(Context context){
        super(context,"Person.db",null,2);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

     db.execSQL("create table "+PersonTableData.Person.TABLE_NAME+"("
             +PersonTableData.Person._ID+" integer primary key autoincrement,"+
            PersonTableData.Person.COLUMN_NAME_1+" varchar(20),"+
             PersonTableData.Person.COLUMN_NAME_2+" varchar(20))"
     );
        Log.d(TAG, "onCreate: 数据库被创建。。。。。。。。。。。。");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
