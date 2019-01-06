package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA=0,scoreB=0,outA=0,outB=0;

    public void Add1A(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }

    public void displayForTeamA(int score) {
        TextView ABC=(TextView)findViewById(R.id.scoreTeamA);
        ABC.setText(String.valueOf(score));
    }
    public void Add1B(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    public void displayForTeamB(int score) {
        TextView ABC=(TextView)findViewById(R.id.scoreTeamB);
        ABC.setText(String.valueOf(score));
    }
    public void Out1A(View view){
        outA=outA+1;
        outForTeamA(outA);
    }

    public void outForTeamA(int score) {
        TextView ABC=(TextView)findViewById(R.id.outTeamA);
        ABC.setText(String.valueOf(score));
    }

    public void Out1B(View view){
        outB=outB+1;
        outForTeamB(outB);
    }

    public void outForTeamB(int score) {
        TextView ABC=(TextView)findViewById(R.id.outTeamB);
        ABC.setText(String.valueOf(score));
    }
    public void Reset(View view){
        scoreB=0;
        scoreA=0;
        outA=0;
        outB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        outForTeamA(outA);
        outForTeamB(outB);
    }
}
