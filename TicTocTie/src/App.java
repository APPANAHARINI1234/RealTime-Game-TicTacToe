import board.Board;
import player.Player;
import game.Game;
import logic.Implementation;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of board:");
        n=sc.nextInt();
         Board b=new Board(n);
         b.getBoard();
         Player Player1=new Player();
         Player Player2=new Player();
         System.out.println("Enter name(Player1):");
         Player1.setName(sc.next());
         System.out.println("Enter contact(Player1):");
         Player1.setContact(sc.nextDouble());
         System.out.println("Enter age(Player1):");
         Player1.setAge(sc.nextInt());
         System.out.println("Enter name(Player2):");
         Player2.setName(sc.next());
         System.out.println("Enter contact(Player2):");
         Player2.setContact(sc.nextDouble());
         System.out.println("Enter age(Player2):");
         Player2.setAge(sc.nextInt());
         Player1.getPlayer();
         Player2.getPlayer();
        Game game=new Game();
        game.setSymbol(Player1,Player2);
        game.getSymbol(Player1,Player2);
         Implementation im=new Implementation(Player1, Player2, b);
         while(true){
          System.out.println("Player1 enter symbol pos"+"("+Player1.symbol+")"+":");
          b.getBoard();
          int pos=sc.nextInt();
          im.playSymbol(pos,Player1,n);
          int s=im.checkBoard(Player1, n);
          if(s==1){
            b.getBoard();
            System.out.println("Player1 is winner");
            Player1.getPlayer();
            break;
          }
          else if(s==2){
            System.out.println("Draw");
            break;
          }
          System.out.println("Player2 enter symbol pos"+"("+Player2.symbol+")"+":");
          b.getBoard();
           pos=sc.nextInt();
          im.playSymbol(pos,Player2,n);
           s=im.checkBoard(Player2, n);
          if(s==1){
            b.getBoard();
            System.out.println("Player2 is winner");

            Player2.getPlayer();
            break;
          }
          else if(s==2){
            System.out.println("Draw");
            break;
          }

         }
    }
}
