package Logic;

import Model.Board;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by praewpatjiradecha on 10/15/2017 AD.
 */
public class Fall {

    public void down(int row, int column, int position, int[][] tiles, String side){
        Board board = new Board();
        int i=row,j=column;
        int count = 1;
        while(j>=0) {
            try {
                switch (side) {
                    case "Up":
                        while (i > 0) {
                            int hasNext = position - count;
                            tiles[i][j] = tiles[hasNext][j];
                            tiles[hasNext][j] = 0;
                            count++;
                            i--;
                        }
                        break;
                    case "Left":
                        i=row;count=1;
                        while (i > 0) {
                            int hasNext = row - count;//TODO
                            tiles[i][j] = tiles[hasNext][j];
                            tiles[hasNext][j] = 0;
                            count++;
                            i--;
                        }
                        break;
                }
            } catch (Exception e) {}
            while (i >= 0) {
                int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                tiles[i][j] = randomNum;
                i--;
            }
            j--;
        }
        board.setBoard(tiles);
    }
}
