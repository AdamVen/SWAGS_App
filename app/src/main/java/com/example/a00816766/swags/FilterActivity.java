package com.example.a00816766.swags;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class FilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
    }

    public void openSession(View view) {
        Intent intent = getIntent();
        EditText minCurrentEditText = (EditText) findViewById(R.id.editTextMinCurrent);
        String minCurrent = minCurrentEditText.getText().toString();
        intent.putExtra("minCurrent", minCurrent);

        setResult(RESULT_OK, intent);

        finish();
    }

}
