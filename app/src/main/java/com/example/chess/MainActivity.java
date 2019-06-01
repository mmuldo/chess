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

    private static Button selectedSquare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectedSquare = null;
        createBoard((LinearLayout) findViewById(R.id.board));
    }

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
                    square.setBackgroundColor(Color.parseColor("#C7D2C7"));
                } else {
                    square.setBackgroundColor(Color.parseColor("#466946"));
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

    private static void squareClicked(View square) {
        if (selectedSquare != null) {
            if (((ColorDrawable)selectedSquare.getBackground()).getColor() == Color.parseColor("#84925e")) {
                selectedSquare.setBackgroundColor(Color.parseColor("#466946"));
            } else {
                selectedSquare.setBackgroundColor(Color.parseColor("#C7D2C7"));
            }
        }

       if (((ColorDrawable)square.getBackground()).getColor() == Color.parseColor("#C7D2C7")) {
           square.setBackgroundColor(Color.parseColor("#d1d677"));
       } else {
           square.setBackgroundColor(Color.parseColor("#84925e"));
       }

       selectedSquare = (Button) square;
    }
}
