package com.login_signup_screendesign_demo;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.login_signup_screendesign_demo.config.ServerConfig;
import com.login_signup_screendesign_demo.dto.CheckDTO;
import com.login_signup_screendesign_demo.dto.ReceiverDTO;
import com.login_signup_screendesign_demo.dto.ResponseDTO;
import com.login_signup_screendesign_demo.enums.ResponseStatus;
import com.login_signup_screendesign_demo.ws.JsonHelper;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

import cz.msebera.android.httpclient.entity.StringEntity;
import cz.msebera.android.httpclient.message.BasicHeader;
import cz.msebera.android.httpclient.protocol.HTTP;

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
            public void onClick(final View view) {
                CheckDTO checkDTO = new CheckDTO();
                /*checkDTO.setDate(new Date(sodourDate.getText().toString()));
                checkDTO.setVosolDate(new Date(sodourDate.getText().toString()));
                checkDTO.setrId(RID.getText().toString());
                checkDTO.setAmount(new BigDecimal(checkAmountEditText.getText().toString()));*/
                checkDTO.setPassedYet(false);
                checkDTO.setRAccepted(false);
                checkDTO.setSAccepted(true);
                final JsonHelper jsonHelper = new JsonHelper();
                AsyncHttpClient client = new AsyncHttpClient();

                StringEntity entity = null;
                try {
                    entity = new StringEntity(jsonHelper.generateRequest(checkDTO));
                    entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
                    client.post(view.getContext() , ServerConfig.SERVER_ADRESS +"/check/export", entity, "application/json", new AsyncHttpResponseHandler() {
                        @Override
                        public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody) {
                            String json = new String(responseBody);
                            ResponseDTO<ReceiverDTO> receiver = jsonHelper.getReceiverResponse(json);
                            if (receiver.getStatus().equals(ResponseStatus.OK)){
                                // receiver دریافت شده
                            }else{
                                new CustomToast().Show_Toast(view.getContext(), view,
                                        receiver.getMessage());
                            }
                        }

                        @Override
                        public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, Throwable error) {

                            new CustomToast().Show_Toast(view.getContext(), view, "خطا در دریافت اطلاعات");
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
