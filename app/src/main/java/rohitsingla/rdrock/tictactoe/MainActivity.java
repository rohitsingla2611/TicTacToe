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
    Button[][] button_ = new Button[3][3];



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

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String buttonID = "button_" + i + j;
                int resultID = getResources().getIdentifier(buttonID, "id", getPackageName());
                button_[i][j] = findViewById(resultID);
                button_[i][j].setOnClickListener(this);
            }
        }


        imageViewReset.setOnClickListener(this);

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
                Toast.makeText(this, " hello image buddy", Toast.LENGTH_SHORT).show();

                return;
            case R.id.button_00:
                Toast.makeText(this, " 00 ", Toast.LENGTH_SHORT).show();
                return;
            case R.id.button_01:
                //     Toast.makeText(this, " 01", Toast.LENGTH_SHORT).show();

                return;
            case R.id.button_02:
                Toast.makeText(this, " 02", Toast.LENGTH_SHORT).show();

                return;
            case R.id.button_10:
                Toast.makeText(this, "10", Toast.LENGTH_SHORT).show();

                return;
            case R.id.button_11:
                //     Toast.makeText(this, "11", Toast.LENGTH_SHORT).show();

                return;
            case R.id.button_12:

                //      Toast.makeText(this, "12", Toast.LENGTH_SHORT).show();

                return;
            case R.id.button_20:
                //    Toast.makeText(this, "20", Toast.LENGTH_SHORT).show();

                return;
            case R.id.button_21:
                //     Toast.makeText(this, " 21", Toast.LENGTH_SHORT).show();

                return;
            case R.id.button_22:
                Toast.makeText(this, " 22", Toast.LENGTH_SHORT).show();


        }

    }
}
