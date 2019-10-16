package com.example.clonequizqs.View;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.clonequizqs.Model.MusicQuestion;
import com.example.clonequizqs.R;
import com.example.clonequizqs.SQLite.MusicOpenHelper;
import java.util.Collections;
import java.util.List;


public class GameWonActivity extends AppCompatActivity {
    TextView txtScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_won);
        txtScore = findViewById(R.id.txtScore);
        Intent intent = getIntent();
        int score = intent.getIntExtra("Score", 0);
        score = score-1;
        txtScore.setText("Your score: " + score);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),CategoryActivity.class));
                finish();
            }
        },4000);
    }
    @Override
    public void onBackPressed() { }
}
