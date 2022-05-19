package sg.edu.rp.c346.id21024750.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAnswer2 = findViewById(R.id.textViewQ1);
        tvAnswer2.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        tvAnswer2.setText(questionsSelected + " answer is: Gone");

    }
}