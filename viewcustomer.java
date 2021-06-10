package com.hemant.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


import static com.hemant.bankingapp.databaseHelper.tableName;

public class viewcustomer extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    SQLiteOpenHelper opener;
    SQLiteDatabase db;
    String a,b,c,d,e;
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_viewcustomer);
    Spinner spinner = findViewById(R.id.sp);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.customers, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener(this);
    opener=new databaseHelper(viewcustomer.this);
            /*insertData("Raghav Roy ","Raghav435@gmail.com","11092","98103423123","Ashok nagar,delhi");
            insertData("Aryan RAutela ","AryanRAu231gmail.com","1278900","9816459902","C-21,Sarita vihar,dehradun");
            insertData("Dinesh Jain ","Dinesh@gmail.com","1109332","78103423123","delhi");
            insertData("Anuj Sharma ","Anuj87Sharma@gmail.com","98102","7839076511","Noida");
            insertData("Sahil Sharma ","sahilss@gmail.com","9822","9810342332","Noida");
            insertData("Rahul Tawani","RahulT233@gmail.com","15000","98103423672","delhi");
            insertData("Haripriya","hari233@gmail.com","20000","98105633123","delhi");
            insertData("Rishika Chopra","rishika45@gmail.com","11992","98103498023","Pitampura,delhi");*/
}
@Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       String text = parent.getItemAtPosition(position).toString();
        if (text.equals("Varda Jain")) {
            Toast.makeText(this, "Varda Jain is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());startActivity(intent);
        } else if (text.equals("Dinesh Jain")) {
            Toast.makeText(this, "Dinesh Jain is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());
            startActivity(intent);
        } else if (text.equals("Raghav Roy")) {
            Toast.makeText(this, "Raghav Roy is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());
            startActivity(intent);
        } else if (text.equals("Aryan Rautela")) {
            Toast.makeText(this, "Aryan Rautela is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());
            startActivity(intent);
        } else if (text.equals("Anuj Sharma")) {
            Toast.makeText(this, "Anuj Sharma is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());
            startActivity(intent);}
        else if (text.equals("Sahil Sharma")) {
            Toast.makeText(this, "Sahil Sharma is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());
            startActivity(intent);}
        else if (text.equals("Hari Priya")) {
            Toast.makeText(this, "Hari  Priya is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());
            startActivity(intent);}
        else if (text.equals("Rishika Chopra")) {
            Toast.makeText(this, "Rishika Chopra is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());

            startActivity(intent);}
        else if (text.equals("Hemant Giri Goswami")) {
            Toast.makeText(this, "Hemant Giri Goswami is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());
            startActivity(intent);}
        else if (text.equals("Rahul Tawani")) {
            Toast.makeText(this, "Rahul Tawani is selected", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getBaseContext(),transfermoney.class);
            intent.putExtra("arg",text.toString());
            startActivity(intent);}

    }

    public void onNothingSelected(AdapterView < ? > parent)
    {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    public void insertData (String name,  String Email, String CurrBalance, String Contact,String Address)
    {

        ContentValues contentValues = new ContentValues();
        contentValues.put("Name", name);
        contentValues.put("Email", Email);
        contentValues.put("CurrentBalance", CurrBalance);
        contentValues.put("ContactNumber", Contact);
        contentValues.put("Address", Address);
        long ID = db.insert(tableName, null, contentValues);

    }

}

