package com.example.daniel.scripture_reference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
//the second activity
public class reference extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);

        //get all the sent data
        String recievedBook = getIntent().getStringExtra(Scripture.Extra_book);
        String recievedchapter = getIntent().getStringExtra(Scripture.Extra_chapter);
        String recievedverse = getIntent().getStringExtra(Scripture.Extra_verse);

        TextView text = (TextView) findViewById(R.id.Reference);
        //make the string read what you want
        String sentance = "Your favorite scripture is: " + recievedBook + " " + recievedchapter
                + ":" + recievedverse;
        text.setText(sentance);
    }
}
