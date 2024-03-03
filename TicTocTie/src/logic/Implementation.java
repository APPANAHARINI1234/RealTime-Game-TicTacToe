package logic;
import player.Player;
import board.Board;
public class Implementation {
    Player p1;
    Player p2;
    Board b;
    public Implementation(Player p1,Player p2,Board b){
        this.p1=p1;
        this.p2=p2;
        this.b=b;
    }
    public void playSymbol(int pos,Player p,int size){
       
        b.board[pos/size][pos%size]=p.symbol;
        
    }
    public int checkBoard(Player p1,int size){
        //check row
        char symbol=p1.symbol;
        int count=0;
        for(int i=0;i<size;i++){
            int flag=0;
           for(int j=0;j<size;j++){
            if(b.board[i][j]!=symbol){
                flag=1;
                break;
            }
           }
           if(flag==0){
            return 1;
           }
        }
        //column
        for(int i=0;i<size;i++){
            int flag=0;
           for(int j=0;j<size;j++){
            if(b.board[j][i]!=symbol){
                flag=1;
                break;
            }
           }
           if(flag==0){
            return 1;
           }
        }
        //diagonal
        int flag=0;
        for(int i=0;i<size;i++){
            if(b.board[i][i]!=symbol){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return 1;
        }
         flag=0;
        for(int i=0;i<size;i++){
           if(b.board[i][size-1-i]!=symbol){
            flag=1;
            break;
           }
        }
        if(flag==0){
            return 1;
        }
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            if(b.board[i][j]=='-')
            {
                return 0;
            }
        }
    }
    return 2;
}

}
