package com.karandeep.pushnotifications;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ShareLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_location);
//        String uri = "geo:" + 28.7 + ","
//                +77.1 + "?q=" + 28.7
//                + "," + 77.1;
//        startActivity(new Intent(android.content.Intent.ACTION_VIEW,
//                Uri.parse(uri)));
//        Double latitude = user_loc.getLatitude();
//        Double longitude = user_loc.getLongitude();


        String uri = "http://maps.google.com/maps?saddr=" +28.7+","+77.1;

        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String ShareSub = "Here is my location";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, ShareSub);
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, uri);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
}
