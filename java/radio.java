package com.example.radio;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.radio);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(selectedId);
                Toast.makeText(MainActivity.this, rb.getText(),
                    Toast.LENGTH_SHORT).show();
            }
        });
    }
}
