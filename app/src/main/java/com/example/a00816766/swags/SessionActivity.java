package com.example.a00816766.swags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class SessionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        int i;

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBoxAngle:
                if (checked)
                    i = 1;
                else
                    i = 2;
                break;
            case R.id.checkBoxCurrent:
                if (checked)
                    i = 1;
                else
                    i = 2;
                break;

        }
    }


    public void openMain(View view) {
        // Pass data to MainActivity
        Intent intent = getIntent();

        //EditText keywordEditText = (EditText) findViewById(R.id.editTextKeyword);
        //String keyword = keywordEditText.getText().toString();
        //intent.putExtra("keyword", keyword);

        setResult(RESULT_OK, intent);

        finish();
    }
}
