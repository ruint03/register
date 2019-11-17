package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner_y, spinner_m, spinner_d;
    ArrayList<String> arrayList,arrayList_m,arrayList_d;
    ArrayAdapter<String> arrayAdapter,arrayAdapter_m,arrayAdapter_d;
    private Button btn_register, btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_register = (Button)findViewById(R.id.btnRegist);
        btn_login = (Button)findViewById(R.id.btnLogin);
        arrayList = new ArrayList<>();
        for (int y = 1990; y < 2020; y++) {
            arrayList.add(y + "년");
        }
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arrayList);
        spinner_y = (Spinner) findViewById(R.id.spinner_year);
        spinner_y.setAdapter(arrayAdapter);
        spinner_y.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), arrayList.get(i) + "가 선택되었습니다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        arrayList_m = new ArrayList<>();
        for(int m=1;m<=12;m++){
            arrayList_m.add(m+"월");
        }
        arrayAdapter_m = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arrayList_m);
        spinner_m=(Spinner)findViewById(R.id.spinner_month);
        spinner_m.setAdapter(arrayAdapter_m);
        spinner_m.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), arrayList_m.get(i) + "가 선택되었습니다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        arrayList_d = new ArrayList<>();
        for(int d=1;d<=31;d++){
            arrayList_d.add(d+"일");
        }
        arrayAdapter_d = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arrayList_d);
        spinner_d=(Spinner)findViewById(R.id.spinner_day);
        spinner_d.setAdapter(arrayAdapter_d);
        spinner_d.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), arrayList_d.get(i) + "가 선택되었습니다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }
}
