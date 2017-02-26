package com.example.robus.firstbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button robusButton = (Button) findViewById(R.id.rubusFindBtn);
        robusButton.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView robusResult = (TextView) findViewById(R.id.robusResulTxtVie);
                        robusResult.setText("Good job boss");
                    }
                }
        );

        robusButton.setOnLongClickListener(new Button.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TextView robusResult = (TextView) findViewById(R.id.robusResulTxtVie);
                robusResult.setText("Long clik");
                return true;
            }
        });
    }
}
