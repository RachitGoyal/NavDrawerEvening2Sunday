package com.msit.portal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;


public class PortalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);
        ImageView hod= (ImageView) findViewById(R.id.hod);
        ImageView staff= (ImageView) findViewById(R.id.staff);
        ImageView student= (ImageView) findViewById(R.id.student);
        ImageView parent= (ImageView) findViewById(R.id.parent);

        hod.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                AlertDialog.Builder alertDialog= new AlertDialog.Builder(PortalActivity.this);
                alertDialog.setTitle("HOD");
                alertDialog.setMessage("Do You Want to Login Or Register?");
                alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(login);
                    }

                });

                alertDialog.setNegativeButton("Register", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent register_hod = new Intent(getApplicationContext(), Register_HOD.class);
                        startActivity(register_hod);
                    }
                });
                alertDialog.show();
                return false;


            }
        });
        staff.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                AlertDialog.Builder alertDialog= new AlertDialog.Builder(PortalActivity.this);
                alertDialog.setTitle("Staff");
                alertDialog.setMessage("Do You Want to Login Or Register?");
                alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(login);
                    }

                });

                alertDialog.setNegativeButton("Register", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent register_staff = new Intent(getApplicationContext(), Register_Staff.class);
                        startActivity(register_staff);
                    }
                });
                alertDialog.show();

                return false;


            }
        });

        student.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                AlertDialog.Builder alertDialog= new AlertDialog.Builder(PortalActivity.this);
                alertDialog.setTitle("Student");
                alertDialog.setMessage("Do You Want to Login Or Register?");
                alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(login);
                    }

                });

                alertDialog.setNegativeButton("Register", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent register_student = new Intent(getApplicationContext(), Register_Student.class);
                        startActivity(register_student);
                    }
                });
                alertDialog.show();
                return false;


            }
        });

        parent.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                AlertDialog.Builder alertDialog= new AlertDialog.Builder(PortalActivity.this);
                alertDialog.setTitle("Parent");
                alertDialog.setMessage("Do You Want to Login Or Register?");
                alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(login);
                    }

                });

                alertDialog.setNegativeButton("Register", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent register_parent = new Intent(getApplicationContext(), Register_Parent.class);
                        startActivity(register_parent);

                    }
                });
                alertDialog.show();
                return false;


            }
        });





    }


}
