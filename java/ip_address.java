package com.example.getip;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview = (TextView) findViewById(R.id.textView);
                WifiManager wifiManager =
                    (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
                String ipAddress =
                    Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
                textview.setText("Your Device IP Address: " + ipAddress);
            }
        });
    }
}
