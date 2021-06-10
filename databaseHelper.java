package com.hemant.bankingapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import static com.hemant.bankingapp.transferData.tableName;
import static java.sql.Types.VARCHAR;

public class databaseHelper extends SQLiteOpenHelper {

    public static final String DatabaseN="Bank.db";
    public static final String tableName="CustomerDetails";
    /*public static final String _ID="customerID";
    public static final String col_1="Name";
    public static final String col_2="Email";
    public static final String col_3="CurrentBalance";
    public static final String col_4="Contactnumber";
    public static final String col_5="Address";*/

    public databaseHelper( @Nullable  Context context) {
        super(context,DatabaseN,null,5);
    }



    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + tableName + " ( CustID INTEGER PRIMARY KEY AUTOINCREMENT,Name VARCHAR(19) ,Email VARCHAR(45) , CurrentBalance VARCHAR(15) , ContactNumber VARCHAR(10) , Address VARCHAR(20))");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS  "+tableName);
        onCreate(db);
    }
    /*public String getData(String Nme)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        String qry="select CurrentBalance from "+tableName+" where Name = "+Nme;
         Cursor crs=db.rawQuery(qry,null);
        String  c;
        if (crs.moveToFirst()) {
            return crs.getString(crs.getColumnIndex("CurrentBalance"));
        }
    }*/
}



