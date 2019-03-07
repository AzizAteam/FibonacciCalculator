package com.example.suitefibonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prepare (View v) {
        EditText input = (EditText) findViewById(R.id.input);
        TextView prepared = (TextView) findViewById(R.id.prepare);
        prepared.setText(input.getText());
        TextView resultTv = (TextView) findViewById(R.id.result);
        resultTv.setText("-");
        ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar);
        pb.setVisibility(View.VISIBLE);
    }

    public void computeFibo (View v) {
        EditText inputET = (EditText) findViewById(R.id.input);
        Integer input = Integer.parseInt(inputET.getText().toString());

        Log.i("CIO", "Start Fibo !");
        FiboTask asynctask = new FiboTask(this);
        asynctask.execute(input);
        Log.i("CIO", "End Fibo.");
    }
}
