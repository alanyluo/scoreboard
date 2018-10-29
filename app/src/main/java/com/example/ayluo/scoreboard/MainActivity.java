package com.example.ayluo.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int hscore=0,
                ascore=0,
                hshots=0,
                ashots=0,
                hcorners=0,
                acorners=0;

    public void hmarca(View view){
        hscore++;
        hshots++;
        display(view);
    }

    public void amarca(View view){
        ascore++;
        ashots++;
        display(view);
    }

    public void hcorner(View view){
        hcorners++;
        display(view);
    }

    public void acorner(View view){
        acorners++;
        display(view);
    }

    public void display(View view){
        //updating the scores
        TextView homescore=findViewById(R.id.homescore);
        homescore.setText(String.valueOf(hscore));
        TextView awayscore=findViewById(R.id.awayscore);
        awayscore.setText(String.valueOf(ascore));

        //updating shots on target
        TextView homeshots=findViewById(R.id.homeshots);
        homeshots.setText(String.valueOf(hshots));
        TextView awayshots=findViewById(R.id.awayshots);
        awayshots.setText(String.valueOf(ashots));

        //updating corners taken
        TextView homecorners=findViewById(R.id.homecorners);
        homecorners.setText(String.valueOf(hcorners));
        TextView awaycorners=findViewById(R.id.awaycorners);
        awaycorners.setText(String.valueOf(acorners));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
