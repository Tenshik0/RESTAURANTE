package com.teamihc.inventas.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.teamihc.inventas.R;
import com.teamihc.inventas.login.LoginActivity;

public class MainActivity2 extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected  void  onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    protected  void  onStart (){
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if (user == null){
            startActivity(new Intent(MainActivity2.this, LoginActivity.class ));

        }else {
            startActivity(new Intent(MainActivity2.this, MainActivity.class));
        }
    }
}
