import Controller.Game;

/**
 * Created by praewpatjiradecha on 10/7/2017 AD.
 */
public class Main {
    public static void main(String arg[]){
        int ploy = 1;
        Game.start();
        Game.showScore();
        Game.showBoard();


//        swap ไม่ dup เอากลับที่เดิม
//        swap dup remove ตำแหน่่งที่ dup
          Game.swapRight(4,2);
//          Game.swapLeft(4,1);
          System.out.println();
          Game.showScore();
          Game.showBoard();
//        Game.swapUp();
//        Game.SwapRight();
//        Game.SwapDown();
    }
}
