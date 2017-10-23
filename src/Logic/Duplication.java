package Logic;

import Controller.Game;

/**
 * Created by praewpatjiradecha on 10/8/2017 AD.
 */
public class Duplication {
    int countColumn, countRow;

    private boolean checkDupLeft(int[][] tiles, int row, int column) {
        setCountEmpty();
        for (int k = column-1; k >= 0; k--) {
                if(tiles[row][column] == tiles[row][k]){
                    countRow++;
                }if(countRow==0 && column-k == 1 || countRow==1 && column-k == 2){
                    column--;
                    return false;
                }
                try{
                    if(countRow >=2 && tiles[row][column] != tiles[row][k-1]){
                        return true;
                    }
                }catch (Exception e){
                    return true;
                }
        }
        return false;
    }

    private boolean checkDupUp(int[][] tiles, int row, int column) {
        setCountEmpty();
        for (int k = row-1; k >= 0; k--) {
                if(tiles[row][column] == tiles[k][column]){
                    countColumn++;
                }if(countColumn==0 && row-k == 1 || countColumn==1 && row-k == 2){
                    row--;
                    return false;
                }
                try{
                    if(countColumn >=2 && tiles[row][column] != tiles[k-1][column]){
                        return true;
                    }
                }catch (Exception e){
                    return true;
                }
        }
        return false;
    }

    private boolean checkDupRight(int[][] tiles, int row,int column){
        setCountEmpty();
        for (int k = column+1; k <= 5; k++) {
                if(tiles[row][column] == tiles[row][k]){
                    countRow++;
                }if(countRow==0 && column-k == 1 || countRow==1 && column-k == 2){
                    column++;
                    return false;
                }
                try{
                    if(countRow >=2 && tiles[row][column] != tiles[row][k-1]){
                        return true;
                    }
                }catch (Exception e){
                    return true;
                }
        }
        return false;
    }

    private boolean checkDupDown(int[][] tiles,int row,int column){
        setCountEmpty();
        for (int k = row+1; k <= 5; k++) {
                if(tiles[row][column] == tiles[k][column]){
                    countColumn++;
                }if(countColumn==0 && row-k == 1 || countColumn==1 && row-k == 2){
                    row++;
                    return false;
                }
                try{
                    if(countColumn >=2 && tiles[row][column] != tiles[k-1][column]){
                        return true;
                    }
                }catch (Exception e){
                    return true;
                }
        }
        return false;
    }

    private boolean canCheckDupRight(int column) {
        return column <= 2;
    }

    private boolean canCheckDupLeft(int column) {
        return column >= 2;
    }

    private boolean canCheckDupUp(int row) {
        return row >= 2;
    }

    private boolean canCheckDupDown(int row){
        return row <= 2;
    }

    public void checkSwap(int[][] tiles, int row, int column) {
        Delete delete = new Delete();
        if(canCheckDupUp(row)){
            if(checkDupUp(tiles,row,column)) delete.tile("Up,"+countColumn,row,column);
        }
        if(canCheckDupLeft(column)){
            if(checkDupLeft(tiles,row,column)) delete.tile("Left,"+countRow,row,column);
        }
        if(canCheckDupRight(column)){
            if(checkDupRight(tiles,row,column)) delete.tile("Right,"+countRow,row,column);
        }
        if(canCheckDupDown(row)){
            if(checkDupDown(tiles,row,column)) delete.tile("Down,"+countColumn,row,column);
        }
    }


    public boolean initialCheckDup(int[][] tiles, int row, int column) {
        if(canCheckDupLeft(column) || canCheckDupUp(row)){
            setCountEmpty();
            return checkDupLeft(tiles,row,column) || checkDupUp(tiles,row,column);
        }
        return false;
    }

    private void setCountEmpty() {
        countColumn =0;
        countRow=0;
    }
}
