package com.example.backimage;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;
    View screenview;
    int[] images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        screenview = findViewById(R.id.v1);
        images = new int[] {
            R.drawable.image1, R.drawable.image2);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int arrlength = images.length;
                Random rand = new Random();
                int num = rand.nextInt(arrlength);
                screenview.setBackgroundResource(images[num]);
            }
        });
    }
}
