package ru.mirea.pashkina.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityDialog extends AppCompatActivity implements View.OnClickListener{

    TextView time, date;
    MyTimeAndDateDialogFragment mtdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        time = (TextView) findViewById(R.id.textView);
        date = (TextView) findViewById(R.id.textView2);

        time.setOnClickListener(this);
        date.setOnClickListener(this);

        mtdf = new MyTimeAndDateDialogFragment(time, date, this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        mtdf.onClick(v);
    }

    public void onClickShowDialog(View view) {
        MyDialogFragment dialog = new MyDialogFragment();
        dialog.show(getSupportFragmentManager(), "mirea");
    }
    public void onOkClicked(){
        Toast.makeText(getApplicationContext(), "You choose the button" +
                "---Moving on---", Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked(){
        Toast.makeText(getApplicationContext(), "You choose the button" +
                "---No---", Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked(){
        Toast.makeText(getApplicationContext(), "You choose the button" +
                "---On pause---", Toast.LENGTH_LONG).show();
    }



}