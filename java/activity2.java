package com.example.intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button2);
        b.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(i);
    }
}
