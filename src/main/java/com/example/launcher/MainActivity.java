package com.example.launcher;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView Trivia;
    Button button;

    String[] kowts = {
            "Ang hindi marunong lumingon sa pinanggalingan ay hindi makararating sa paroroonan.",
            "Ang hindi magmahal sa sariling wika ay higit pa sa hayop at malansang isda.",
            "Kung ano ang itinanim, siyang aanihin.",
            "Ang kapalaran ay nasa tao, wala sa nakatadhana.",
            "Ang karukhaan ay hindi hadlang sa pagtatagumpay.",
            "Darating ang oras sa buhay natin na tayo ay mapapagod, kung dumating man 'yun, matuto kang magpahinga at hindi ang sumuko!",
            "Walang himala! Ang himala ay nasa puso ng tao!",
            "Ang kita sa bula, sa bula rin mawawala.",
            "Kung gusto mo siya, ipaglaban mo. Pero kung ayaw na sa'yo, hayaan mo na at irespeto mga desisyon niya.",
            "Pag pinaltok ka nang tinapay, paltukin mo nang bato."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Trivia = findViewById(R.id.textView3);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            Random random = new Random();
            int index = random.nextInt(kowts.length);
            Trivia.setText(kowts[index]);
        });
    }
}
