package com.example.hanshu.database.persondb;

import android.os.BaseBundle;
import android.provider.BaseColumns;

/**
 * Created by HanShu on 2016/7/14.
 */
public class PersonTableData {

    public static class Person implements BaseColumns {
        public   static final  String TABLE_NAME="person";
        public static final String COLUMN_NAME_1="name";
        public static final String COLUMN_NAME_2="number";
    }
}
