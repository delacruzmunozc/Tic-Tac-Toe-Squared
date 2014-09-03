package com.supermunch.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void zeroButtonClick()
    {
        playMove(0);
    }
    public void oneButtonClick()
    {
        playMove(1);
    }
    public void twoButtonClick()
    {
        playMove(2);
    }
    public void threeButtonClick()
    {
        playMove(3);
    }
    public void fourButtonClick()
    {
        playMove(4);
    }
    public void fiveButtonClick()
    {
        playMove(5);
    }
    public void sixButtonClick()
    {
        playMove(6);
    }
    public void sevenButtonClick()
    {
        playMove(7);
    }
    public void eightButtonClick()
    {
        playMove(8);
    }
    public void nineButtonClick()
    {
        playMove(9);
    }
    public void tenButtonClick()
    {
        playMove(10);
    }
    public void elevenButtonClick()
    {
        playMove(11);
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