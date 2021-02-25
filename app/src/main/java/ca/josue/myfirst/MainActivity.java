package ca.josue.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// Layout 1 & 2 : Layout par default et layout 2
    private ImageView play;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//        // Importation de l'image
//        this.play = findViewById(R.id.play);
//
//        play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // On instance l'élement Intent
//                Intent otherActivity = new Intent(getApplicationContext(),CookieActivity.class);
//                startActivity(otherActivity);
//                finish();
//            }
//        });
//    }

//    Layout 3 : Dynamic Layout
    private LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // on instance notre Layout
        this.myLayout = (LinearLayout) findViewById(R.id.myDynamicLayout);

        /****   Ajouts des élements dans notre Layout   ****/
        /** Ajout d'une Image */
        ImageView image = new ImageView(this);

        // On crée la variable qui comprendra tous les info d'en-tête de notre image
        ViewGroup.LayoutParams parametreImage = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,200);
        image.setBackgroundResource(R.drawable.img0);
        image.setContentDescription(getResources().getString(R.string.imgDescription));
        image.setLayoutParams(parametreImage);
        // Ajout de l'élement Image dans le layout
        myLayout.addView(image);

        /** Ajout d'un text */
        TextView myText = new TextView(this);
        myText.setText(getResources().getString(R.string.welcome_msg));
        myText.setGravity(0);
        myText.setTextColor(getResources().getColor(R.color.black));
        myText.setTextSize(22);
        // Ajout de l'élement Text dans le layout
        myLayout.addView(myText);
    }
}