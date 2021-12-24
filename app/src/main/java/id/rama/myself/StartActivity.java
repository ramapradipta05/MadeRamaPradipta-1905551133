package id.rama.myself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    ImageView imageplus, imagelist, imageprofile, imageabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        imageplus = findViewById(R.id.btn_plus);
        imagelist = findViewById(R.id.btn_list);
        imageprofile = findViewById(R.id.btn_profile);
        imageabout = findViewById(R.id.btn_about);

        imageplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, AddJurnalActivity.class);
                startActivity(intent);
            }
        });
        imagelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, Home.class);
                startActivity(intent);
            }
        });
        imageprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        imageabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}