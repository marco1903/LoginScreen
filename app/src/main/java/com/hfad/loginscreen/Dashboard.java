package com.hfad.loginscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button logout = (Button) findViewById(R.id.logout);
    }

    public void logOut(View view) {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }
}
