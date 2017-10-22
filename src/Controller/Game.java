package Controller;

import Logic.Initial;
import Logic.Swap;
import Model.Board;
import Model.Score_Time;

import java.text.MessageFormat;
import java.util.Arrays;

/**
 * Created by praewpatjiradecha on 10/7/2017 AD.
   Only static method !!
 */

public class Game {

    public static void start(){
        Initial initial = new Initial();
        initial.initialBoard();
    }

    public static void showBoard(){
        Board board = new Board();
        for (int[] row : board.getBoard())
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void swapLeft(int row, int column) {
        Swap swap = new Swap();
        swap.left(row,column);
    }

    public static void swapRight(int row, int column) {
        Swap swapR = new Swap();
        swapR.right(row,column);
    }

    public static void showScore(){
        Score_Time score_time = new Score_Time();
        System.out.println(MessageFormat.format("Score: {0}", score_time.getScore()));
    }
}
