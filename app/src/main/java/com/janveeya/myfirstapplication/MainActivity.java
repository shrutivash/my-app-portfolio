package com.janveeya.myfirstapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /** Called when the user touches the button */
    public void SpotifyMsg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spotify Streamer App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void ScoreMsg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Scores App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void LibraryMsg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Library App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void BiggerMsg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void ReaderMsg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my XYZ Reader App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void CapstoneMsg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
