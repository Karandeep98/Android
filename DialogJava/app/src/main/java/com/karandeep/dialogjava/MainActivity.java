package com.karandeep.dialogjava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt=findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

    }
    public void showDialog(){
        final Dialog dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_design);
        Button yesbt=dialog.findViewById(R.id.yesbt);
        Button nobt=dialog.findViewById(R.id.nobt);
        yesbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Yes!!",Toast.LENGTH_LONG).show();
            }
        });
        nobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });

        dialog.show();
    }
}
