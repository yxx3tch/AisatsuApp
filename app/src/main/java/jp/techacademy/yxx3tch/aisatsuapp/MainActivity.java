package jp.techacademy.yxx3tch.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        mTextView = (TextView)findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        showTimePickerDialog();
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        if (hourOfDay > 1 && hourOfDay < 10) {
                            mTextView.setText("おはよう");
                        } else if (hourOfDay > 9 && hourOfDay < 18) {
                            mTextView.setText("こんにちは");
                        } else {
                            mTextView.setText("こんばんは");
                        }
                    }
                },
        13, 0, true);
        timePickerDialog.show();
    }
}
