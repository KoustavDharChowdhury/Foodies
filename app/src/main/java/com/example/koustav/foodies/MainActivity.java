package com.example.koustav.foodies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2; Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.edt);
        edt2=findViewById(R.id.edt2);
        btn=findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt1.getText().toString().equals("DAKA") && edt2.getText().toString().equals("2204131")){
                    MainActivity.this.finish();
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Unsuccessful",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
