package com.example.daniel.scripture_reference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Scripture extends AppCompatActivity {
    public final static String Extra_book = "com.example.daniel.scriptures";
    public final static String Extra_chapter = "com.example.daniel.chapters";
    public final static String Extra_verse = "com.example.daniel.verses";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture);

        Button goButton = (Button) findViewById(R.id.button);

        final EditText book = (EditText) findViewById(R.id.book);
        final EditText chapter = (EditText) findViewById(R.id.chapter);
        final EditText verse = (EditText) findViewById(R.id.Verse);

        goButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), reference.class);
                intent.putExtra(Extra_book, book.getText().toString());
                intent.putExtra(Extra_chapter, chapter.getText().toString());
                intent.putExtra(Extra_verse, verse.getText().toString());

                startActivity(intent);
            }

        }
    );}
}
