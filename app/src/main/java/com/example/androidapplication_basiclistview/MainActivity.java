package com.example.androidapplication_basiclistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import javax.sql.DataSource;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //B1: Datasource
        final String[] datas = {"nokia","samsung","oppo","HTC","LG","XIAOMI"};

        //B2: Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, datas);
        lvContact = findViewById(R.id.lvContact);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = datas[position];
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
            }
        });

    }
}
