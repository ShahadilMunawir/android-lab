package com.example.checkbox;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox english = (CheckBox) findViewById(R.id.c1);
        CheckBox malayalam = (CheckBox) findViewById(R.id.c2);
        CheckBox hindi = (CheckBox) findViewById(R.id.c3);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer s = new StringBuffer();
                if (english.isChecked()) {
                    s.append("English ");
                }
                if (malayalam.isChecked()) {
                    s.append("\nMalayalam ");
                }
                if (hindi.isChecked()) {
                    s.append("\nHindi ");
                }
                Toast.makeText(MainActivity.this,
                    s.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
