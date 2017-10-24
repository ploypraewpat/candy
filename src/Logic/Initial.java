package Logic;

import java.util.concurrent.ThreadLocalRandom;
import Model.Board;

/**
 * Created by praewpatjiradecha on 10/7/2017 AD.
 */
public class Initial {
    public void initialBoard(){
        Duplication duplication = new Duplication();
        Board board = new Board();
        int randomNum;
        int row=0,column;
        int[][] tiles = new int[6][6];
        while(row<6)
        {
            column=0;
            while (column<6){
                randomNum = 1 + (int)(Math.random() * 4);
                tiles[row][column] = randomNum;
                if(!duplication.initialCheckDup(tiles,row,column)){
                    column++;
                }
            }
            row++;
        }
        board.setBoard(tiles);
    }

}
