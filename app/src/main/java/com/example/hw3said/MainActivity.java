package com.example.hw3said;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> contactNameList = new ArrayList<>();
    private RecyclerView rvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();
        findAdaptor();
        loadData();
    }

    private void findId() {
        rvContact = findViewById(R.id.rv_contacts);
    }

    private void findAdaptor(){
        Adapter adapter = new Adapter(contactNameList);
        rvContact.setAdapter(adapter);
    }

    private void loadData(){
        contactNameList.add("Джо");
        contactNameList.add("Джо");
        contactNameList.add("Джо");
        contactNameList.add("Джо");
        contactNameList.add("Джо");
        contactNameList.add("Джо");
        contactNameList.add("Джо");
        contactNameList.add("Джо");
        contactNameList.add("Джо");
        contactNameList.add("Джо");
    }
}