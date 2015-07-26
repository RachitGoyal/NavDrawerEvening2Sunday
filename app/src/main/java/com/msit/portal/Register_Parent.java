package com.msit.portal;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class Register_Parent extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__parent);
        final SharedPreferences prefs = getSharedPreferences("register", MODE_PRIVATE);
        final SharedPreferences.Editor edit = prefs.edit();

        final EditText name, user, email, enroll, pass, re_pass;
        final TextView department;
        Button register;
        Spinner dept;

        name = (EditText) findViewById(R.id.name);
        user = (EditText) findViewById(R.id.user);
        email = (EditText) findViewById(R.id.mail);
        pass = (EditText) findViewById(R.id.pass);
        re_pass = (EditText) findViewById(R.id.re_pass);
        enroll = (EditText) findViewById(R.id.enroll);
        dept = (Spinner) findViewById(R.id.dept);




    }

}
