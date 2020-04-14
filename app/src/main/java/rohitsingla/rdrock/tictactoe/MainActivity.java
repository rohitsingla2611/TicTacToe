package rohitsingla.rdrock.tictactoe;

import android.annotation.SuppressLint;
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
    int boxesCount = 0;
    int i, j;
    int player1WinPoints = 0, player2WinPoints = 0, drawPoints = 0;
    boolean playerNo1Turn;
    String[][] traverseBox = new String[3][3];


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

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                String buttonID = "button_" + i + j;
                int resultID = getResources().getIdentifier(buttonID, "id", getPackageName());
                button_[i][j] = findViewById(resultID);
                button_[i][j].setOnClickListener(this);
            }
        }

        imageViewReset.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageViewReset) {
            Toast.makeText(this, " hello image buddy", Toast.LENGTH_SHORT).show();
            newGame();
        } else {
            if (!((Button) view).getText().toString().equals("")) {
                return;
            }
            if (playerNo1Turn) {
                ((Button) view).setText("X");
            } else {
                ((Button) view).setText("O");
            }
            boxesCount++;

            if (whichPlayerWins()) {
                if (playerNo1Turn)
                    player1Wins();
                else
                    player2Wins();
            } else if (boxesCount == 9) {
                draw();
            } else {
                playerNo1Turn = !playerNo1Turn;
            }
        }


    }

    boolean whichPlayerWins() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                traverseBox[i][j] = button_[i][j].getText().toString();
            }
        }

        for (i = 0; i < 3; i++) { //
            if (traverseBox[0][i].equals(traverseBox[1][i]) &&
                    traverseBox[0][i].equals(traverseBox[2][i]) &&
                    !traverseBox[0][i].equals("")) {
                return true;
            }
        }
        for (i = 0; i < 3; i++) {
            if (traverseBox[i][0].equals(traverseBox[i][1]) &&
                    traverseBox[i][0].equals(traverseBox[i][2]) &&
                    !traverseBox[i][0].equals("")) {
                return true;
            }
        }

        if (traverseBox[0][0].equals(traverseBox[1][1]) &&
                traverseBox[0][0].equals(traverseBox[2][2])) {
            return true;
        }
        return traverseBox[0][2].equals(traverseBox[1][1]) &&
                traverseBox[0][2].equals(traverseBox[2][0]);
    }

    //
    void player1Wins() {
        player1WinPoints++;
        Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
        updatePoints();
        resetBoxes();
//
    }

    //
    void player2Wins() {
        player2WinPoints++;
        Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
        updatePoints();
        resetBoxes();
    }

    void draw() {
        drawPoints++;
        Toast.makeText(this, "Match Draw!", Toast.LENGTH_SHORT).show();
        updatePoints();
        //      resetBoxes();

        //   }

//    void newGame() {
        resetBoxes();
//
    }

    @SuppressLint("SetTextI18n")
    void updatePoints() {
        textViewPlayer1.setText("P  1: " + player1WinPoints);
        //   textViewPlayer2.setText("P  2: " + player2WinPoints);
        textViewDraw.setText("P  2: " + drawPoints);


    }

    void resetBoxes() {
        //   for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                button_[i][j].setText("");
            }
        }
    //     boxesCount = 0;
    playerNo1Turn =true

}

    // @Override
    public void onBackPressed() {
        //      if (backKeyPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            //Toast.makeText(this, "Press again to Exit", Toast.LENGTH_SHORT).show();
            //     }
            //     backKeyPressedTime = System.currentTimeMillis();
    }
}