package com.example.asingh.loginscreen;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by 2016asingh on 10/19/2015.
 */
public class StartPageActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        Bundle extras = getIntent().getExtras();
        String username = extras.getString("USER_NAME");

        TextView usernameTextView = (TextView) findViewById(R.id.textViewUserName);
        usernameTextView.setText("Logged in as: " + username);
    }
}
