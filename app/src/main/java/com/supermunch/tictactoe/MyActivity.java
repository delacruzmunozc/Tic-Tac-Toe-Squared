package com.supermunch.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MyActivity extends Activity {
    int playerTurn = 1;
    int[] board = new int[36];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }
    public void zeroButtonClick(View view)
    {
        playMove(0);
    }
    public void oneButtonClick(View view)
    {
        playMove(1);
    }
    public void twoButtonClick(View view)
    {
        playMove(2);
    }
    public void threeButtonClick(View view)
    {
        playMove(3);
    }
    public void fourButtonClick(View view)
    {
        playMove(4);
    }
    public void fiveButtonClick(View view)
    {
        playMove(5);
    }
    public void sixButtonClick(View view)
    {
        playMove(6);
    }
    public void sevenButtonClick(View view)
    {
        playMove(7);
    }
    public void eightButtonClick(View view)
    {
        playMove(8);
    }
    public void nineButtonClick(View view)
    {
        playMove(9);
    }
    public void tenButtonClick(View view)
    {
        playMove(10);
    }
    public void elevenButtonClick(View view)
    {
        playMove(11);
    }
    public void twelveButtonClick(View view)
    {
        playMove(12);
    }
    public void thirteenButtonClick(View view)
    {
        playMove(13);
    }
    public void fourteenButtonClick(View view)
    {
        playMove(14);
    }
    public void fifteenButtonClick(View view)
    {
        playMove(15);
    }
    public void sixteenButtonClick(View view)
    {
        playMove(16);
    }
    public void seventeenButtonClick(View view)
    {
        playMove(17);
    }

    public void playMove(int position)
    {
        if (board[position] == 0)
        {
            board[position] = playerTurn;
            if (playerTurn == 1)
            {
                switch (position)
                {

                }
            }
            else
            {
                switch (position)
                {

                }
            }
        }
    }
}