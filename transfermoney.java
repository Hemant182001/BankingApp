package com.hemant.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import static com.hemant.bankingapp.transferData.tableName;

public class transfermoney extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Button b;
EditText payment;
String pym,id,str,text,id1,nn;
SQLiteOpenHelper opener,op1;
    SQLiteDatabase db,db1;
    databaseHelper dh;

Cursor cursor;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfermoney);
        Spinner spinner = findViewById(R.id.sp1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.customers, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
b=findViewById(R.id.transfer);
payment=findViewById(R.id.e1);
    opener = new transferData(transfermoney.this);
    op1=new databaseHelper(this);
    dh=new databaseHelper(this);
    Intent intent = getIntent();
    str = intent.getStringExtra("arg");
b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      /* db1=op1.getWritableDatabase();
       nn=dh.getData(str);
                updateDB(str,nn,pym);*/
            Toast.makeText(transfermoney.this, "Payment done", Toast.LENGTH_SHORT).show();
    }
});


    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        pym=payment.getText().toString();
         text = parent.getItemAtPosition(position).toString();
        if (text.equals("Varda Jain")) {
            Toast.makeText(this, "Varda Jain is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);
        } else if (text.equals("Dinesh Jain")) {
            Toast.makeText(this, "Dinesh Jain is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);

        } else if (text.equals("Raghav Roy")) {
            Toast.makeText(this, "Raghav Roy is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);

        } else if (text.equals("Aryan Rautela")) {
            Toast.makeText(this, "Aryan Rautela is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);

        } else if (text.equals("Anuj Sharma")) {
            Toast.makeText(this, "Anuj Sharma is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);
        }
        else if (text.equals("Sahil Sharma")) {
            Toast.makeText(this, "Sahil Sharma is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);
        }
        else if (text.equals("Hari Priya")) {
            Toast.makeText(this, "Hari  Priya is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);
        }
        else if (text.equals("Rishika Chopra")) {
            Toast.makeText(this, "Rishika Chopra is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);
        }
        else if (text.equals("Hemant Giri Goswami")) {
            Toast.makeText(this, "Hemant Giri Goswami is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);
        }
        else if (text.equals("Rahul Tawani")) {
            Toast.makeText(this, "Rahul Tawani is selected", Toast.LENGTH_SHORT).show();
            db =opener.getWritableDatabase();
            insertData(str,text,pym);
        }

    }
    public void insertData (String from,  String to, String amountTransferred )
    {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Sender", from);
        contentValues.put("Receiver", to);
        contentValues.put("Amount", amountTransferred);

        long ID = db.insert(tableName, null, contentValues);
    }
   public boolean updateDB (String name,String currentb,String paymt)
    {

        ContentValues contentValues = new ContentValues();
        contentValues.put("Name", name);
        contentValues.put("CurrentBalance", currentb);
        String nme = currentb;
        int o=Integer.parseInt(paymt);
        int s=Integer.parseInt(currentb);
        int q=s-o;
        String q1=String.valueOf(q);
        return db.update("CustomerDetails", contentValues, "CurrentBalance"+ "=?", new String[]{q1}) > 0;

    }
    public void onNothingSelected(AdapterView < ? > parent)
    {

    }
}