package Logic;

import Model.Board;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by praewpatjiradecha on 10/15/2017 AD.
 */
public class Fall {
    public void down(int row, int column, int position, int[][] tiles){
        Board board = new Board();
        int i = row;
        int count = 1;
        try {
            while(i>0){
                int hasNext = position - count;
                tiles[i][column] = tiles[hasNext][column];
                tiles[hasNext][column] = 0;
                count++;i--;
            }
        }catch (Exception e){
            while(i>=0){
                int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                tiles[i][column] = randomNum;
                i--;
            }
        }
        board.setBoard(tiles);
    }
}
