package ca.josue.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.MessageFormat;

public class CookieActivity extends AppCompatActivity {

    /* Les Variables d'instances */
    private TextView nbreClic;
    private ImageView btnClic;
    private int cpt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);

        // instancier les objets
        this.nbreClic = findViewById(R.id.clic);
        this.btnClic = findViewById(R.id.btnClic);
        btnClic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cpt++;
                if (cpt < 2)
                    nbreClic.setText(MessageFormat.format("Nombre Clic : {0}", cpt));
                else
                    nbreClic.setText(MessageFormat.format("Nombre Clics : {0}", cpt));
            }
        });
    }
}