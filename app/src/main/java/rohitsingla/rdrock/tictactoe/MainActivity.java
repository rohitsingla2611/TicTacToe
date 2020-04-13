package rohitsingla.rdrock.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    long backKeyPressedTime;
    TextView textViewPlayer1, textViewPlayer2, textViewDraw;
    ImageView imageViewReset;
    Button button_00, button_01, button_02;
    Button button_10, button_11, button_12;
    Button button_20, button_21, button_22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews() {
        textViewPlayer1 = findViewById(R.id.textViewPlayer1);
        textViewPlayer2 = findViewById(R.id.textViewPlayer2);
        textViewDraw = findViewById(R.id.textViewDraw);

        imageViewReset = findViewById(R.id.imageViewReset);

        button_00 = findViewById(R.id.button_00);
        button_01 = findViewById(R.id.button_01);
        button_02 = findViewById(R.id.button_02);

        button_10 = findViewById(R.id.button_10);
        button_11 = findViewById(R.id.button_11);
        button_12 = findViewById(R.id.button_12);

        button_20 = findViewById(R.id.button_20);
        button_21 = findViewById(R.id.button_21);
        button_22 = findViewById(R.id.button_22);

        imageViewReset.setOnClickListener(this);

        button_00.setOnClickListener(this);
        button_01.setOnClickListener(this);
        button_02.setOnClickListener(this);

        button_10.setOnClickListener(this);
        button_11.setOnClickListener(this);
        button_12.setOnClickListener(this);

        button_20.setOnClickListener(this);
        button_21.setOnClickListener(this);
        button_22.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        if (backKeyPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(this, "Press again to Exit", Toast.LENGTH_SHORT).show();
        }
        backKeyPressedTime = System.currentTimeMillis();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageViewReset:

                return;
            case R.id.button_00:
                return;
            case R.id.button_01:
                return;
            case R.id.button_02:
                return;
            case R.id.button_10:
                return;
            case R.id.button_11:
                return;
            case R.id.button_12:
                return;
            case R.id.button_20:
                return;
            case R.id.button_21:
                return;
            case R.id.button_22:
                return;


        }

    }
}
