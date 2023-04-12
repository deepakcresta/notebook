package com.deepak.notebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
FloatingActionButton addButton;
 ArrayList<Note> notes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.btnAddNote);
         notes  = new ArrayList<>();
         notes.add(new Note("Note1","Descq 1","catageroy1"));
         notes.add(new Note("Note2","Descq 2","catageroy2"));
         notes.add(new Note("Note3","Descq 3","catageroy3"));
         notes.add(new Note("Note4","Descq 4","catageroy4"));
         notes.add(new Note("Note5","Descq 5","catageroy5"));

        RecyclerView rv = findViewById(R.id.rv);
        rv.setAdapter(new NoteAdaptor(notes));

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,NoteActivity.class);
                startActivity(intent);
            }
        });
    }
}