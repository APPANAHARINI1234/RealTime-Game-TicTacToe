package board;
import java.util.*;
public class Board {
   public int size;
   public char[][]board;
   public char defaultSymbol;
   public Board(int size,char defaultSymbol){
    this.size=size;
    board=new char[size][size];
    this.defaultSymbol=defaultSymbol;
    //initializing board with default

    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            board[i][j]=defaultSymbol;
        }
    }
}
   public void getSymbol(){
        System.out.println("Default symbol is : "+this.defaultSymbol);
    }
    public void getBoardConfig(){
        System.out.println("Current configuration of board:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
   }

