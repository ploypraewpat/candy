package Logic;

import Controller.Game;
import Model.Board;
import Model.Score_Time;

/**
 * Created by praewpatjiradecha on 10/14/2017 AD.
 */
public class Delete {
    public void tile(String s, int row, int column){
        Board board = new Board();
        Score_Time score = new Score_Time();

        int[][] tiles = board.getBoard();
        String[] data = s.split(",");
        if(data[0].equals("Up")){
            int position = row-Integer.valueOf(data[1]);
            for (int i = row; i >= position; i--) {
                tiles[i][column]=0;
                int point = score.getScore()+100;
                score.setScore(point);
            }
//          TODO for test
            System.out.println();
            Game.showBoard();
//          TODO for test
            Fall fall = new Fall();
            fall.down(row,column,position,tiles,data[0]);
        }
        if(data[0].equals("Left")){
            int position = column-Integer.valueOf(data[1]);
            for (int i = column; i >= position; i--) {
                tiles[row][i]=0;
                int point = score.getScore()+100;
                score.setScore(point);
            }
//          TODO for test
            System.out.println();
            Game.showBoard();
//          TODO for test
            Fall fall = new Fall();
            fall.down(row,column,position,tiles, data[0]);
        }
        board.setBoard(tiles);
    }
}
