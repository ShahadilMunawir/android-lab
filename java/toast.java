package com.example.hello;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      Button b = (Button) findViewById(R.id.button);
      b.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Hello World",
               Toast.LENGTH_SHORT).show();
         }
      });
   }
}
