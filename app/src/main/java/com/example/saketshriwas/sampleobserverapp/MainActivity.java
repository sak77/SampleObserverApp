package com.example.saketshriwas.sampleobserverapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.saketshriwas.sampleobserverapp.databinding.ActivityMainBinding;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer, DialogInterface.OnClickListener{

    Button btnSubject;
    TextView txtOutput;
    EditText edtUserName;
    int count = 1;

    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        activityMainBinding.setUser(user);
        btnSubject = activityMainBinding.btnSubject;
        txtOutput = (TextView)findViewById(R.id.txtOutput);
        edtUserName  = (EditText)findViewById(R.id.edtName);
        //btnSubject = (Button)findViewById(R.id.btnSubject);
        btnSubject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txtOutput.setText(user.userName);
                user.setUserAge("22");
                user.setUserName("Saket"+ count);
                count++;
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
