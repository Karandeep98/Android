package com.karandeep.pushnotifications;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class TextToSpeech extends AppCompatActivity {
    Button convert;
    EditText enter;
    String msg;
    String k;
    android.speech.tts.TextToSpeech mToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        k= getIntent().getStringExtra("message");
//        if(message=="What is the speed limit"){
             msg="The speed limit in this area is 50 kilometres per hour";
//        }
        enter= findViewById(R.id.editText);
        convert=findViewById(R.id.button);

        mToSpeech=new android.speech.tts.TextToSpeech(getApplicationContext(), new android.speech.tts.TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!= android.speech.tts.TextToSpeech.ERROR){
                    mToSpeech.setLanguage(Locale.ENGLISH);
                }
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        mToSpeech.speak(enter.getText().toString(), android.speech.tts.TextToSpeech.QUEUE_FLUSH,null);
            }
        });
    }
}
