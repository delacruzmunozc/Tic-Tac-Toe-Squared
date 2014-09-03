package com.supermunch.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import static com.supermunch.tictactoe.R.id.*;


public class MyActivity extends Activity {
    int playerTurn = 1;
    int[] board = new int[36];
    ImageButton imageButton;
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
    public void eighteenButtonClick(View view)
    {
        playMove(18);
    }
    public void nineteenButtonClick(View view)
    {
        playMove(19);
    }
    public void twentyButtonClick(View view)
    {
        playMove(20);
    }
    public void twentyOneButtonClick(View view)
    {
        playMove(21);
    }
    public void twentyTwoButtonClick(View view)
    {
        playMove(22);
    }
    public void twentyThreeButtonClick(View view)
    {
        playMove(23);
    }
    public void twentyFourButtonClick(View view)
    {
        playMove(24);
    }
    public void twentyFiveButtonClick(View view)
    {
        playMove(25);
    }
    public void twentySixButtonClick(View view)
    {
        playMove(26);
    }
    public void twentySevenButtonClick(View view)
    {
        playMove(27);
    }
    public void twentyEightButtonClick(View view)
    {
        playMove(28);
    }
    public void twentyNineButtonClick(View view)
    {
        playMove(29);
    }
    public void thirtyButtonClick(View view)
    {
        playMove(30);
    }
    public void thirtyOneButtonClick(View view)
    {
        playMove(31);
    }
    public void thirtyTwoButtonClick(View view)
    {
        playMove(32);
    }
    public void thirtyThreeButtonClick(View view)
    {
        playMove(33);
    }
    public void thirtyFourButtonClick(View view)
    {
        playMove(34);
    }
    public void thirtyFiveButtonClick(View view)
    {
        playMove(35);
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
                    case 0:
                        imageButton = (ImageButton) findViewById(zeroButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 1:
                        imageButton = (ImageButton) findViewById(oneButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 2:
                        imageButton = (ImageButton) findViewById(twoButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 3:
                        imageButton = (ImageButton) findViewById(threeButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 4:
                        imageButton = (ImageButton) findViewById(fourButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 5:
                        imageButton = (ImageButton) findViewById(fiveButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 6:
                        imageButton = (ImageButton) findViewById(sixButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 7:
                        imageButton = (ImageButton) findViewById(sevenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 8:
                        imageButton = (ImageButton) findViewById(eightButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 9:
                        imageButton = (ImageButton) findViewById(nineButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 10:
                        imageButton = (ImageButton) findViewById(tenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 11:
                        imageButton = (ImageButton) findViewById(elevenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 12:
                        imageButton = (ImageButton) findViewById(twelveButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 13:
                        imageButton = (ImageButton) findViewById(thirteenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 14:
                        imageButton = (ImageButton) findViewById(fourteenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 15:
                        imageButton = (ImageButton) findViewById(fifteenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 16:
                        imageButton = (ImageButton) findViewById(sixteenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 17:
                        imageButton = (ImageButton) findViewById(seventeenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 18:
                        imageButton = (ImageButton) findViewById(eighteenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 19:
                        imageButton = (ImageButton) findViewById(nineteenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 20:
                        imageButton = (ImageButton) findViewById(twentyButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 21:
                        imageButton = (ImageButton) findViewById(twentyOneButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 22:
                        imageButton = (ImageButton) findViewById(twentyTwoButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 23:
                        imageButton = (ImageButton) findViewById(twentyThreeButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 24:
                        imageButton = (ImageButton) findViewById(twentyFourButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 25:
                        imageButton = (ImageButton) findViewById(twentyFiveButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 26:
                        imageButton = (ImageButton) findViewById(twentySixButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 27:
                        imageButton = (ImageButton) findViewById(twentySevenButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 28:
                        imageButton = (ImageButton) findViewById(twentyEightButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 29:
                        imageButton = (ImageButton) findViewById(twentyNineButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 30:
                        imageButton = (ImageButton) findViewById(thirtyButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 31:
                        imageButton = (ImageButton) findViewById(thirtyOneButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 32:
                        imageButton = (ImageButton) findViewById(thirtyTwoButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 33:
                        imageButton = (ImageButton) findViewById(thirtyThreeButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 34:
                        imageButton = (ImageButton) findViewById(thirtyFourButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                    case 35:
                        imageButton = (ImageButton) findViewById(thirtyFiveButton);
                        imageButton.setImageResource(R.drawable.X);
                        break;
                }
                playerTurn = 2;
            }
            else
            {
                switch (position)
                {

                }
                playerTurn = 1;
            }
        }
    }
}