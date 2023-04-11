package com.example.multiplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView result;
    int ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.textView);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer buffer = new StringBuffer();
                String fs = editText.getText().toString();
                int n = Integer.parseInt(fs);
                for (int i = 1; i <= 10; i++) {
                    ans = (i * n);
                    buffer.append(i + " * " + n + " = " + ans + "\n");
                    result.setText(buffer);
                }
            }
        });
    }
}
