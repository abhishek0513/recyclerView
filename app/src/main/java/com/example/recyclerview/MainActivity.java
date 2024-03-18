package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel>arrContacts = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerContact);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrContacts.add(new ContactModel(R.drawable.image_scene, "abc", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_mahadev, "abc", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_scene, "abc", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_mahadev, "Sample", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_scene, "abc", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_mahadev, "Sample", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_scene, "abc", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_mahadev, "Sample", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_scene, "abc", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_mahadev, "Sample", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_scene, "abc", "9876543210") );
        arrContacts.add(new ContactModel(R.drawable.image_mahadev, "Sample", "9876543210") );

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);

    }
}