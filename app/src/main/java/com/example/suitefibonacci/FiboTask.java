package com.example.suitefibonacci;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class FiboTask extends AsyncTask<Integer,Void, Integer> {

    private AppCompatActivity myActivity;
    public FiboTask(AppCompatActivity a) {
        myActivity = a;
    }

    @Override
    protected Integer doInBackground(Integer... integers) {
        int result = Fibonacci.fibo(integers[0]);
        return result;
    }

    @Override
    protected void onPostExecute(Integer res) {
        ProgressBar pb = (ProgressBar)myActivity.findViewById(R.id.progressBar);
        pb.setVisibility(View.GONE);

        TextView resultTV = (TextView)myActivity.findViewById(R.id.result);
        resultTV.setText("" + res);
    }

}
