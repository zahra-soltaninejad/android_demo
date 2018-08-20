package com.login_signup_screendesign_demo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

public class SodourCheckMenu extends AppCompatActivity implements View.OnClickListener {

    private static Button sodourButton;
    private ExpandableListView elvChapters;
    Button exitbtn;
    Button backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sodour_check_menu);
        sodourButton=(Button)findViewById(R.id.sodour_check_jadid);
        exitbtn=(Button)findViewById(R.id.exit);
        backbtn=(Button)findViewById(R.id.back);

        sodourButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), sodourNewCheck.class);
                startActivity(intent);
            }
        }));
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

    }
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.app_name);
        builder.setMessage("می خواهید از برنامه خارج شوید؟")
                .setCancelable(false)
                .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("خیر", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
    @Override
    public void onClick(View view) {
        if( view==sodourButton){
            Intent intent=new Intent(this,sodourNewCheck.class);
            startActivity(intent);
        }
    }
}
