package com.betterpixio.pixio.betterpixio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PixioSurfaceView surfaceView = new PixioSurfaceView(getApplicationContext());
        PixioRenderer renderer = new PixioRenderer(getApplicationContext());
        surfaceView.setRenderer(renderer);

        setContentView(surfaceView);


    }
}
