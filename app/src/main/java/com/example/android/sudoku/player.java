package com.example.android.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class player extends AppCompatActivity {

    int[][] board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = 0;
            }
        }
        display();
    }

    Boolean is_Valid(int no, int row, int column) {
        for (int i = 0; i < 9; i++) {
            if (board[i][column] == no) return false;
            if (board[row][i] == no) return false;

        }
        int i_start = (row / 3) * 3;
        int j_start = (column / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + i_start][j + j_start] == no) return false;
            }
        }
        return true;
    }

    Boolean solver() {
        int i = 0, j = 0;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (board[i][j] == 0) break;
            }
            if (j < 9) break;
        }
        if (i >= 9) return true;
        int row = i, column = j;
        for (int no = 1; no <= 9; no++) {
            if (is_Valid(no, row, column)) {
                board[row][column] = no;
                if (solver() == true)
                    return true;
                else
                    board[row][column] = 0;
            }
        }
        return false;
    }

    void read() {
       EditText field = (EditText)findViewById(R.id.one);
        board[0][0] = Integer.parseInt(field.getText().toString());


        field = (EditText)findViewById(R.id.two);
        board[0][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.three);
        board[0][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.four);
        board[0][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.five);
        board[0][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.six);
        board[0][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seven);
        board[0][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.eight);
        board[0][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.nine);
        board[0][8] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.ten);
        board[1][0] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.eleven);
        board[1][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twelve);
        board[1][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirteen);
        board[1][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourteen);
        board[1][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fifteen);
        board[1][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixteen);
        board[1][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventeen);
        board[1][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.eighteen);
        board[1][8] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.nineteen);
        board[2][0] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twenty);
        board[2][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentyone);
        board[2][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentytwo);
        board[2][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentythree);
        board[2][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentyfour);
        board[2][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentyfive);
        board[2][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentysix);
        board[2][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentyseven);
        board[2][8] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentyeight);
        board[3][0] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.twentynine
        );
        board[3][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirty);
        board[3][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtyone);
        board[3][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtytwo);
        board[3][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtythree);
        board[3][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtyfour
        );
        board[3][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtyfive);
        board[3][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtysix
        );
        board[3][8] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtyseven);
        board[4][0] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtyeight
        );
        board[4][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.thirtynine);
        board[4][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourty);
        board[4][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtyone
        );
        board[4][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtytwo
        );
        board[4][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtythree

        );
        board[4][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtyfour);
        board[4][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtyfive
        );
        board[4][8] = Integer.parseInt(field.getText().toString());
        field = (EditText)findViewById(R.id.fiftyfour);
        board[5][8] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtysix
        );
        board[5][0] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtyseven);
        board[5][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtyeight);
        board[5][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fourtynine);
        board[5][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fifty);
        board[5][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fiftyone

        );
        board[5][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fiftytwo);
        board[5][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fiftythree

        );
        board[5][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fiftyfive);
        board[6][0] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fiftysix
        );
        board[6][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fiftyseven);
        board[6][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fiftyeight);
        board[6][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.fiftynine);
        board[6][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixty);
        board[6][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtyone
        );
        board[6][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtytwo);
        board[6][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtythree
        );
        board[6][8] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtyfour);
        board[7][0] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtyfive

        );
        board[7][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtysix);
        board[7][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtyseven);
        board[7][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtyeight);
        board[7][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.sixtynine);
        board[7][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventy
        );
        board[7][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventyone);
        board[7][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventytwo

        );
        board[7][8] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventythree);
        board[8][0] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventyfour

        );
        board[8][1] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventyfive
        );
        board[8][2] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventysix);
        board[8][3] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventyseven);
        board[8][4] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventyeight
        );
        board[8][5] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.seventynine
        );
        board[8][6] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.eighty);
        board[8][7] = Integer.parseInt(field.getText().toString());

        field = (EditText)findViewById(R.id.eightyone
        );
        board[8][8] = Integer.parseInt(field.getText().toString());
    }

    void display() {
        EditText field = (EditText)findViewById(R.id.one);

        field.setText(""+(board[0][0]), TextView.BufferType.EDITABLE);
        field = (EditText)findViewById(R.id.two);

        field.setText(""+(board[0][1]), TextView.BufferType.EDITABLE);
        field = (EditText)findViewById(R.id.three);

        field.setText(""+(board[0][2]), TextView.BufferType.EDITABLE);
        field = (EditText)findViewById(R.id.four);

        field.setText(""+(board[0][3]), TextView.BufferType.EDITABLE);
        field = (EditText)findViewById(R.id.five);

        field.setText(""+(board[0][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.six);

        field.setText(""+(board[0][5]), TextView.BufferType.EDITABLE);
        field = (EditText)findViewById(R.id.seven);
        field.setText(""+(board[0][6]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.eight);
        field.setText(""+(board[0][7]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.nine);
        field.setText(""+(board[0][8]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.ten);
        field.setText(""+(board[1][0]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.eleven);
        field.setText(""+(board[1][1]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twelve);
        field.setText(""+(board[1][2]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirteen);
        field.setText(""+(board[1][3]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fourteen);
        field.setText(""+(board[1][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fifteen);
        field.setText(""+(board[1][5]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixteen);
        field.setText(""+(board[1][6]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventeen);
        field.setText(""+(board[1][7]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.eighteen);
        field.setText(""+(board[1][8]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.nineteen);
        field.setText(""+(board[2][0]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.twenty);
        field.setText(""+(board[2][1]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentyone);
        field.setText(""+(board[2][2]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentytwo);
        field.setText(""+(board[2][3]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentythree);
        field.setText(""+(board[2][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentyfour);
        field.setText(""+(board[2][5]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentyfive);
        field.setText(""+(board[2][6]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentysix);
        field.setText(""+(board[2][7]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentyseven);
        field.setText(""+(board[2][8]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentyeight);
        field.setText(""+(board[3][0]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.twentynine
        );
        field.setText(""+(board[3][1]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirty);
        field.setText(""+(board[3][2]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirtyone);
        field.setText(""+(board[3][3]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirtytwo);
        field.setText(""+(board[3][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirtythree);
        field.setText(""+(board[3][5]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirtyfour
        );
        field.setText(""+(board[3][6]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirtyfive);
        field.setText(""+(board[3][7]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.thirtysix
        );
        field.setText(""+(board[3][8]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirtyseven);
        field.setText(""+(board[4][0]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.thirtyeight
        );
        field.setText(""+(board[4][1]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.thirtynine);
        field.setText(""+(board[4][2]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fourty);
        field.setText(""+(board[4][3]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.fourtyone
        );
        field.setText(""+(board[4][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fourtytwo
        );
        field.setText(""+(board[4][5]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fourtythree

        );
        field.setText(""+(board[4][6]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.fourtyfour);
        field.setText(""+(board[4][7]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fourtyfive
        );
        field.setText(""+(board[4][8]), TextView.BufferType.EDITABLE);


        field = (EditText)findViewById(R.id.fourtysix
        );
        field.setText(""+(board[5][0]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fourtyseven);
        field.setText(""+(board[5][1]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fourtyeight);
        field.setText(""+(board[5][2]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fourtynine);
        field.setText(""+(board[5][3]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fifty);
        field.setText(""+(board[5][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fiftyone

        );
        field.setText(""+(board[5][5]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fiftytwo);
        field.setText(""+(board[5][6]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fiftythree

        );
        field.setText(""+(board[5][7]), TextView.BufferType.EDITABLE);
        field = (EditText)findViewById(R.id.fiftyfour

        );
        field.setText(""+(board[5][8]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fiftyfive);
        field.setText(""+(board[6][0]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fiftysix
        );
        field.setText(""+(board[6][1]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fiftyseven);
        field.setText(""+(board[6][2]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fiftyeight);
        field.setText(""+(board[6][3]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.fiftynine);
        field.setText(""+(board[6][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixty);
        field.setText(""+(board[6][5]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtyone
        );
        field.setText(""+(board[6][6]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtytwo);
        field.setText(""+(board[6][7]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtythree
        );
        field.setText(""+(board[6][8]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtyfour);
        field.setText(""+(board[7][0]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtyfive

        );
        field.setText(""+(board[7][1]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtysix);
        field.setText(""+(board[7][2]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtyseven);
        field.setText(""+(board[7][3]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtyeight);
        field.setText(""+(board[7][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.sixtynine);
        field.setText(""+(board[7][5]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventy
        );
        field.setText(""+(board[7][6]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventyone);
        field.setText(""+(board[7][7]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventytwo

        );
        field.setText(""+(board[7][8]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventythree);
        field.setText(""+(board[8][0]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventyfour

        );
        field.setText(""+(board[8][1]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventyfive
        );
        field.setText(""+(board[8][2]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventysix);
        field.setText(""+(board[8][3]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventyseven);
        field.setText(""+(board[8][4]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventyeight
        );
        field.setText(""+(board[8][5]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.seventynine
        );
        field.setText(""+(board[8][6]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.eighty);
        field.setText(""+(board[8][7]), TextView.BufferType.EDITABLE);

        field = (EditText)findViewById(R.id.eightyone
        );
        field.setText(""+(board[8][8]), TextView.BufferType.EDITABLE);
    }

    public void startwork(View view) {

        read();


      if (solver() == true) display();
    }
}
