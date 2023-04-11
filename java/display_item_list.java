package com.example.list;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    String[] months = {
        "January",
        "Feb",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst = (ListView) findViewById(R.id.l1);
        ArrayAdapter < String > arrayadapter = new ArrayAdapter < String > (this,
            android.R.layout.simple_list_item_1, months);
        lst.setAdapter(arrayadapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView < ? > parent, View view, int position,
                long id) {
                TextView tv = (TextView) view;
                Toast.makeText(MainActivity.this, tv.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
