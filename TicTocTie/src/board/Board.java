package board;
import java.util.Arrays;
public class Board {
   int size;
  public char[][]board;
  public Board(int size){
    this.size=size;
    board=new char[size][size];
    for(int i=0;i<size;i++){
        Arrays.fill(board[i],'-');
    }
   }
   public void getBoard(){
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
   }
}
