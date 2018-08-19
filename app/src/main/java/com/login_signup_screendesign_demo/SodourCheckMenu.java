package com.login_signup_screendesign_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

public class SodourCheckMenu extends AppCompatActivity implements View.OnClickListener {

    private static Button sodourButton;
    private ExpandableListView elvChapters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sodour_check_menu);
        sodourButton=(Button)findViewById(R.id.sodour_check_jadid);
        sodourButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), sodourNewCheck.class);
                startActivity(intent);
            }
        }));

    }
    @Override
    public void onClick(View view) {
        if( view==sodourButton){
            Intent intent=new Intent(this,sodourNewCheck.class);
            startActivity(intent);
        }
    }
}
