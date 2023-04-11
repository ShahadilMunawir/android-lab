package com.example.imageview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements
View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
  
    public void addListenerOnButton() {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }
  
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.button1:
            image.setBackgroundResource(R.drawable.image1);
            break;
        case R.id.button2:
            image.setBackgroundResource(R.drawable.image2);
            break;
        case R.id.button3:
            image.setBackgroundResource(R.drawable.image3);
            break;
        default:
            break;
        }
    }
}
