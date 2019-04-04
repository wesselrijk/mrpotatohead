package com.example.mrpotatohead;
// hoi
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.arms);
        ImageView image2 = findViewById(R.id.eyes);
        ImageView image3 = findViewById(R.id.eyebrows);
        ImageView image4 = findViewById(R.id.ears);
        ImageView image5 = findViewById(R.id.glasses);
        ImageView image6 = findViewById(R.id.hat);
        ImageView image7 = findViewById(R.id.mustache);
        ImageView image8 = findViewById(R.id.mouth);
        ImageView image9 = findViewById(R.id.nose);
        ImageView image10 = findViewById(R.id.shoes);

        if (savedInstanceState != null) {
            image.setVisibility(savedInstanceState.getInt("arms"));
            image2.setVisibility(savedInstanceState.getInt("eyes"));
            image3.setVisibility(savedInstanceState.getInt("eyebrows"));
            image4.setVisibility(savedInstanceState.getInt("ears"));
            image5.setVisibility(savedInstanceState.getInt("glasses"));
            image6.setVisibility(savedInstanceState.getInt("hat"));
            image7.setVisibility(savedInstanceState.getInt("mustache"));
            image8.setVisibility(savedInstanceState.getInt("mouth"));
            image9.setVisibility(savedInstanceState.getInt("nose"));
            image10.setVisibility(savedInstanceState.getInt("shoes"));
        }
    }

    public void checkClicked(View v) {
        Log.d("halloooo", "clicked box");
        int id = v.getId();
        int id_im;
        switch(id){
            case R.id.eyes_cb:
                id_im = R.id.eyes;
                break;
            case R.id.arms_cb:
                id_im = R.id.arms;
                break;
            case R.id.ears_cb:
                id_im = R.id.ears;
                break;
            case R.id.eyebrows_cb:
                id_im = R.id.eyebrows;
                break;
            case R.id.glasses_cb :
                id_im = R.id.glasses;
                break;
            case R.id.hat_cb:
                id_im = R.id.hat;
                break;
            case R.id.mustache_cb:
                id_im = R.id.mustache;
                break;
            case R.id.mouth_cb:
                id_im = R.id.mouth;
                break;
            case R.id.nose_cb:
                id_im = R.id.nose;
                break;
            case R.id.shoes_cb:
                id_im = R.id.shoes;
                break;
            default:
                id_im = R.id.arms;
        }
        ImageView image = findViewById(id_im);
        if (image.getVisibility() == View.INVISIBLE) {
            Log.d("halloooo",  "invisible");
            image.setVisibility(View.VISIBLE);
        }
        else {
            Log.d("halloooo",  "visible");
            image.setVisibility(View.INVISIBLE);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        ImageView image = findViewById(R.id.arms);
        ImageView image2 = findViewById(R.id.eyes);
        ImageView image3 = findViewById(R.id.eyebrows);
        ImageView image4 = findViewById(R.id.ears);
        ImageView image5 = findViewById(R.id.glasses);
        ImageView image6 = findViewById(R.id.hat);
        ImageView image7 = findViewById(R.id.mustache);
        ImageView image8 = findViewById(R.id.mouth);
        ImageView image9 = findViewById(R.id.nose);
        ImageView image10 = findViewById(R.id.shoes);
        outState.putInt("arms", image.getVisibility());
        outState.putInt("eyes", image2.getVisibility());
        outState.putInt("eyebrows", image3.getVisibility());
        outState.putInt("ears", image4.getVisibility());
        outState.putInt("glasses", image5.getVisibility());
        outState.putInt("hat", image6.getVisibility());
        outState.putInt("mustache", image7.getVisibility());
        outState.putInt("mouth", image8.getVisibility());
        outState.putInt("nose", image9.getVisibility());
        outState.putInt("shoes", image10.getVisibility());
    }
}
