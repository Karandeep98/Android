package demoapp.codingblocks.com.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("My Application","OnCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My Application","OnRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My Application","OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My Application","OnResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My Application","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My Application","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My Application","OnDestroy");
    }

    @Override
    public void supportNavigateUpTo(@NonNull Intent upIntent) {
        super.supportNavigateUpTo(upIntent);
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
    }

    public void clickbutton(View view) {
        Toast.makeText(this,"Hello Karandeep Singh!!", Toast.LENGTH_LONG).show();
        view.setBackgroundResource(R.color.colorAccent);
    }
}
