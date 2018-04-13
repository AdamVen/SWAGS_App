package com.example.a00816766.swags;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.sheets.v4.model.ValueRange;

public class SessionActivity extends AppCompatActivity {

    int id = 0;
    int minCurrent = 0;
    static final int SELECT_FILTERS = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();


        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBoxSessionOne:
                if (checked)
                    id = 1;
                break;
            case R.id.checkBoxSessionTwo:
                if (checked)
                    id = 2;
                break;

        }
    }

    @Override
    protected void onActivityResult(
            int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case SELECT_FILTERS:
                if (resultCode == RESULT_OK) {
                    minCurrent = Integer.parseInt(data.getStringExtra("minCurrent"));
                    Toast.makeText(this,Integer.toString(minCurrent),
                            Toast.LENGTH_SHORT).show();
                    CheckBox sessionThree = (CheckBox) findViewById(R.id.checkBoxSessionThree);
                    sessionThree.setEnabled(false);
                }
        }
    }

    public void openFilter(View view) {
        Intent propertiesIntent = new Intent(this, FilterActivity.class);
        startActivityForResult(propertiesIntent, SELECT_FILTERS);
    }

    public void openMain(View view) {
        // Pass data to MainActivity
        Intent intent = getIntent();

        //EditText keywordEditText = (EditText) findViewById(R.id.editTextKeyword);

        intent.putExtra("sessionID", Integer.toString(id));

        setResult(RESULT_OK, intent);

        finish();
    }
}
