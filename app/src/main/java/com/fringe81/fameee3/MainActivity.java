package com.fringe81.fameee3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MYNAME = "com.fringe81.fameee3.MYNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getName(View view){
        EditText edit_text = (EditText) findViewById(R.id.edit_text);
        String myName = edit_text.getText().toString().trim();
        if (myName.equals("")) {
            Toast.makeText(
                    this,
                    "名前が未入力です",
                    Toast.LENGTH_LONG
            ).show();
        } else {
            Intent intent = new Intent(this, Main2Result.class);
            intent.putExtra(EXTRA_MYNAME, myName);
            startActivity(intent);

        }
    }

}
