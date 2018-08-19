package com.login_signup_screendesign_demo;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class sodourNewCheck extends AppCompatActivity implements
        View.OnClickListener {
    EditText vosoulDate;
    EditText sodourDate;
    EditText signCodeEditText;
    EditText checkAmountEditText;
    EditText RID;
    Button sendRequestButton;
    Button exit;




    private int mYear, mMonth, mDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sodour_new_check);
        vosoulDate =(EditText)findViewById(R.id.vosoul_date);
        sodourDate =(EditText)findViewById(R.id.sodour_date);
        signCodeEditText=(EditText)findViewById(R.id.sign_code);
        signCodeEditText=(EditText)findViewById(R.id.check_amount);
        RID=(EditText)findViewById(R.id.RID);
        sendRequestButton=(Button) findViewById(R.id.send_requestbtn);
        vosoulDate.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateGeneration(vosoulDate);
            }
        }));
        sodourDate.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateGeneration(sodourDate);
            }
        }));
        sendRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


    public void dateGeneration(final EditText date){
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {

                        date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

    @Override
    public void onClick(View view) {

    }
}
