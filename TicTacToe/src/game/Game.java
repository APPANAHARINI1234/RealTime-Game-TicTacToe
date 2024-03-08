package game;
import player.Player;
import board.Board;
public class Game {
     public int noOfTurns;
      public Game(){
        this.noOfTurns=0;
      }
      public boolean gameOver(Game game,int n){
        if(game.noOfTurns==n*n)
        return true;
        else
        return false;
      }
      public boolean fillCell(int pos,Player p,Board b){
        int n=b.size;
        if(pos>=n*n){
            return true;
        }
           int row=pos/n;
           int col=pos%n;
           
        if  (b.board[row][col]==b.defaultSymbol){
              b.board[row][col]=p.symbol;
              noOfTurns++;
              return false;
        }
        return true;
           
      }
      public int getWinner(Player p,int n,Board b){
        char symbol=p.symbol;
        //search for row
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(b.board[i][j]!=symbol)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            return 1;
        }
        //search for column
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(b.board[j][i]!=symbol)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            return 1;
        }
         //clockwise diagonal search
         boolean flag=false;
         for(int i=0;i<n;i++){
            if(b.board[i][i]!=symbol)
            {
                flag=true;
                break;
            }
         }
         if(!flag)
            return 1;
            //search for anticlockwise diagonal
             flag=false;
            int j=n-1;
            for(int i=0;i<n;i++){
               if(b.board[i][j]!=symbol)
               {
                   flag=true;
                   break;
               }
               j--;
            }
            if(!flag)
               return 1;
            flag=false;
         for(int i=0;i<n;i++){
            if(b.board[i][i]!=symbol)
            {
                flag=true;
                break;
            }
         }
         if(!flag)
            return 1;
            return -1;
      }
       
     

      
}
