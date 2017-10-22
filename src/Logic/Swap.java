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
//          TODO for test
            System.out.println();
            System.out.println("Swap position row 5 column 2 to row 5 column 1");
            System.out.println();
            Game.showBoard();
//          TODO for test
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
            duplication.checkSwap(tiles, row, column);
        }
    }

    private void swapRight(int[][] tiles, int row, int column) {
        int temp = tiles[row][column];
        tiles[row][column] = tiles[row][column + 1];
        tiles[row][column + 1] = temp;
    }
}