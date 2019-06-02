package com.example.chess;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private static final String WhiteSquare = "#C7D2C7";
    private static final String WhiteSquareHL = "#d1d677";
    private static final String BlackSquare = "#466946";
    private static final String BlackSquareHL = "#84925e";

    private static Button selectedSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectedSquare = null;
        createBoard((LinearLayout) findViewById(R.id.board));
    }

    /**
     * Sets up new chess board
     * @param board layout containing board
     */
    private static void createBoard(LinearLayout board) {
        int numRows = board.getChildCount();
        int numSquares;
        View row = null;
        View square = null;
        boolean isWhite = true;

        for (int i=0; i < numRows; i++) {
            row = board.getChildAt(i);
            numSquares = ((ViewGroup)row).getChildCount();

            for (int j=0; j < numSquares; j++) {
                square = ((ViewGroup) row).getChildAt(j);
                if ((isWhite)) {
                    square.setBackgroundColor(Color.parseColor(WhiteSquare));
                } else {
                    square.setBackgroundColor(Color.parseColor(BlackSquare));
                }
                if (j != numSquares - 1) isWhite = !isWhite;

                square.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        squareClicked(v);
                    }
                });
            }
        }
    }

    /**
     * Highlights square when clicked
     * @param square clicked square
     */
    private static void squareClicked(View square) {
        if (selectedSquare != null) {
            if (((ColorDrawable)selectedSquare.getBackground()).getColor() == Color.parseColor(BlackSquareHL)) {
                selectedSquare.setBackgroundColor(Color.parseColor(BlackSquare));
            } else {
                selectedSquare.setBackgroundColor(Color.parseColor(WhiteSquare));
            }
        }

       if (((ColorDrawable)square.getBackground()).getColor() == Color.parseColor(WhiteSquare)) {
           square.setBackgroundColor(Color.parseColor(WhiteSquareHL));
       } else {
           square.setBackgroundColor(Color.parseColor(BlackSquareHL));
       }

       selectedSquare = (Button) square;
    }
}
