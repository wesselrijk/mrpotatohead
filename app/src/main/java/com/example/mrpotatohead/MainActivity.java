package com.example.mrpotatohead;
/*
The main activity for this app takes place in this file. This is the only java file for this app,
which means that the whole program takes place in this java file.
The app is built fully in the MainActivity class, where firstly in the onCreate the layout is set
and it is checked whether there is a savedInstance. Next the MainActivity will check if/when
checkboxes are being checked and will change the visibility of drawables, creating the MrPotato
character. At last the current instance is saved.
*/

// list of imports
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


// call the main activity
public class MainActivity extends AppCompatActivity {

    // instantiate the app with the onCreate, set the layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ImageViews of Mr Potato's parts
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

        // check if there is a savedInstanceState, if this is the case, set visibility of ImageViews
        // according to the saved visibility.
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

    // method specifying what happens when a checkbox is clicked
    public void checkClicked(View v) {

        // instantiate an id of the View that was clicked, also instantiate a new int variable,
        // meant for the id of the ImageView corresponding to its checkbox, which is checked with a
        // switch
        int id = v.getId();
        int idImage;
        switch(id){
            case R.id.eyesCb:
                idImage = R.id.eyes;
                break;
            case R.id.armsCb:
                idImage = R.id.arms;
                break;
            case R.id.earsCb:
                idImage = R.id.ears;
                break;
            case R.id.eyebrowsCb:
                idImage = R.id.eyebrows;
                break;
            case R.id.glassesCb :
                idImage = R.id.glasses;
                break;
            case R.id.hatCb:
                idImage = R.id.hat;
                break;
            case R.id.mustacheCb:
                idImage = R.id.mustache;
                break;
            case R.id.mouthCb:
                idImage = R.id.mouth;
                break;
            case R.id.noseCb:
                idImage = R.id.nose;
                break;
            case R.id.shoesCb:
                idImage = R.id.shoes;
                break;
            default:
                idImage = R.id.arms;
        }

        // set visibility opposite of its current state for the ImageView corresponding to the View
        // of the checkbox
        ImageView image = findViewById(idImage);
        if (image.getVisibility() == View.INVISIBLE) {
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }

    // save current settings in an onSaveInstanceState
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
