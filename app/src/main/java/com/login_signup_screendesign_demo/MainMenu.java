package com.login_signup_screendesign_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity implements
        View.OnClickListener  {

    private View view;
    private Button sodourCheckbtn;
    private Button checkStatebtn;
    private Button showReceivedCheckbtn;
    private Button showReceirequestsbtn;
    private Button reminderbtn;
    private Button settingbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        sodourCheckbtn = (Button) findViewById(R.id.sodour_check);
        checkStatebtn =(Button) findViewById(R.id.view_checkbook_state);
        showReceivedCheckbtn =(Button) findViewById(R.id.view_received_checks);
        reminderbtn =(Button) findViewById(R.id.reminder);
        showReceirequestsbtn =(Button) findViewById(R.id.view_requests);
        settingbtn =(Button) findViewById(R.id.setting);

        sodourCheckbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SodourCheckMenu.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sodour_check:
                Intent intent = new Intent(this, SodourCheckMenu.class);
                startActivity(intent);
                break;

        }

    }
}
