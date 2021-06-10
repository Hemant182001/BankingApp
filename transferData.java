package com.hemant.bankingapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class transferData extends SQLiteOpenHelper {

    public static final String DatabaseN="transfer.db";
    public static final String tableName="CustomerTransfer";


    public transferData( @Nullable  Context context) {
        super(context,DatabaseN,null,4);
    }



    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ tableName + "(Sender  VARCHAR(19), Receiver VARCHAR(30) ,Amount INTEGER)");

    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS  "+tableName);
        onCreate(db);
    }
}



