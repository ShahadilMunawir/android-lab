package com.example.fetch;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText text1;
    TextView t1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.t1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1 = (EditText) findViewById(R.id.editText);
                t1.setText(text1.getText().toString());
            }
        });
    }
}
