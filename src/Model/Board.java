package Model;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by praewpatjiradecha on 10/7/2017 AD.
 */
public class Board {
    private static int[][] board = new int[][]{
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
    };

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }
}
