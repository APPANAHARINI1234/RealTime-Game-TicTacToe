package symbol;
import player.Player;

import java.util.*;
public class Symbol {
   
    Random rand=new Random();
    int random=rand.nextInt(2);
    //if random=0 then p1 symbol is X and p2 is O and vice versa
   public void setSymbol(Player p1,Player p2){
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
        System.out.println(p1.getName()+" "+"symbol is : "+p1.symbol);
        System.out.println(p2.getName()+" "+"symbol is : "+p2.symbol);
    }

}
