package com.example.filmkita;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nowplaying(View view)  {
        Intent intent = new Intent(MainActivity.this, NowPlaying.class);
        startActivity(intent);
    }

}
