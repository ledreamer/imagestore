package satyaki.com.imagestore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pantButton = (Button) findViewById(R.id.pantbutton);
        pantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, imagecapture.class);
                startActivity(myIntent);

            }
        });


        Button shirtButton = (Button) findViewById(R.id.shirtbutton);
        shirtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, imagecapture.class);
                startActivity(myIntent);

            }
        });

    }

}
