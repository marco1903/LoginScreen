package com.hfad.loginscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends Activity {

   private static EditText username;
   private static EditText password;
   private static Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.Password);
        login = (Button) findViewById(R.id.Login);
    }

    public void Login(View view) {
        if (username.getText().toString().equals("") &&
                password.getText().toString().equals("")) {
            Toast.makeText(LoginScreen.this, "Username and Password correct",
                    Toast.LENGTH_SHORT).show();
            loadDashboard();
        } else {
            Toast.makeText(LoginScreen.this, "Username and/or Password incorrect",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void loadDashboard() {
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }


}
