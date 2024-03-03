package game;
import player.Player;
import java.util.*;
public class Game {
    public void setSymbol(Player p1,Player p2){
       Random rand=new Random();
       int random=rand.nextInt(2);
         if(random==0){
            p1.symbol='X';
            p2.symbol='O';
         }
         else{
            p1.symbol='O';
            p2.symbol='X';
         }

    }
    public void getSymbol(Player p1,Player p2){
        System.out.println("Player1 : "+p1.symbol);
        System.out.println("Player2 : "+p2.symbol);
    }
    
}
