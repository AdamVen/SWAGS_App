package com.example.a00816766.swags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class GraphActivity extends AppCompatActivity {

    private static final int SELECT_SESSION = 0;
    GraphView graph;
    LineGraphSeries<DataPoint> series;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        // GraphView graph = (GraphView) findViewById(R.id.graph);
        graph = (GraphView) findViewById(R.id.graph);
        series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        //graph.addSeries(series);


    }

    // Open Properties Intent
    public void openMain(View view) {
        finish();
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        int i;

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBoxAngle:
                if (checked)
                    graph.addSeries(series);
                else
                    graph.removeSeries(series);
                break;
            case R.id.checkBoxCurrent:
                if (checked)
                    i = 1;
                else
                    i = 2;
                break;

        }
    }

    // Open Properties Intent
    public void openSession(View view) {
        Intent propertiesIntent = new Intent(this, GraphActivity.class);
        //propertiesIntent.putExtra("passedID", Integer.toString(imageID));
        startActivityForResult(propertiesIntent, SELECT_SESSION);
    }
}
