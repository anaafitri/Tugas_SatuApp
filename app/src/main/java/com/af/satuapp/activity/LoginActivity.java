package com.af.satuapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.af.satuapp.R;

public class LoginActivity extends AppCompatActivity {

    Button Login;
    EditText username,password;



    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_relative);

         Login =(Button)findViewById(R.id.btnlogin);
         username = (EditText)findViewById(R.id.etusername);
         password =(EditText)findViewById(R.id.etpassword);

         Login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 if (password.getText().toString().toUpperCase().equals("KHAIRANI"))
                 {
                    login_sukses();
                 } else
                 {

                     Toast.makeText(getApplicationContext(),"Salah Password",Toast.LENGTH_SHORT).show();
                 }
                     


             }
         });
    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        //kirimkan username ke tampilan utama
        i.putExtra("USERNAME",user_login);
        startActivity(i);
    }
}
