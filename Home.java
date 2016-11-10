package com.example.nick.signup;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity  {
    Button bImage;
    Button bLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
      bImage=(Button) findViewById(R.id.bImage);
        bLocation=(Button) findViewById(R.id.bLocation);

        bImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent CamIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(CamIntent);

            }

            @Override
            public void onClick(View v) {
                Intent map=new Intent(Home.this,maps.class);
                startActivity(map);

            }

}

}
