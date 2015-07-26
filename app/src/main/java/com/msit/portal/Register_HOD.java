package com.msit.portal;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class Register_HOD extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__hod);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register__hod, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
