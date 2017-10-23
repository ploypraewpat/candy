package Logic;

import Controller.Game;
import Model.Board;

/**
 * Created by praewpatjiradecha on 10/8/2017 AD.
 */
public class Swap {

    public void left(int row, int column) {
        Board board = new Board();
        Duplication duplication = new Duplication();
        if (column >= 0) {
            int[][] tiles = board.getBoard();
            swapLeft(tiles, row, column);
            //TODO for test
            System.out.println();
            System.out.println("Swap position row 5 column 2 to row 5 column 1");
            System.out.println();
            Game.showBoard();
            //TODO for test
            //TODO for test
            System.out.println();
            System.out.println("set duplicate for test up");
            System.out.println();
            tiles[3][0] = 1;
            tiles[4][0] = 1;
            tiles[5][0] = 1;
            tiles[1][1] = 2;
            tiles[2][1] = 2;
            tiles[3][1] = 2;
            tiles[4][1] = 2;
            Game.showBoard();
            //TODO for test
            duplication.checkSwap(tiles, row, column);
            column--;
            duplication.checkSwap(tiles, row, column);
        }
    }

    private void swapLeft(int[][] tiles, int row, int column) {
        int temp = tiles[row][column];
        tiles[row][column] = tiles[row][column - 1];
        tiles[row][column - 1] = temp;
    }

    public void right(int row, int column) {
        Board board = new Board();
        Duplication duplication = new Duplication();
        if (column <= 5) {
            int[][] tiles = board.getBoard();
            swapRight(tiles, row, column);
//          TODO for test
            System.out.println();
            System.out.println("Swap position row 5 column 2 to row 5 column 3");
            System.out.println();
            Game.showBoard();
//          TODO for test
            //TODO for test
            System.out.println();
            System.out.println("set duplicate for test left");
            System.out.println();
            tiles[4][0] = 1;
            tiles[4][1] = 1;
            tiles[4][2] = 1;
            Game.showBoard();
            //TODO for test
            duplication.checkSwap(tiles, row, column);
            column++;
            duplication.checkSwap(tiles, row, column);
        }
    }

    private void swapRight(int[][] tiles, int row, int column) {
        int temp = tiles[row][column];
        tiles[row][column] = tiles[row][column + 1];
        tiles[row][column + 1] = temp;
    }
}