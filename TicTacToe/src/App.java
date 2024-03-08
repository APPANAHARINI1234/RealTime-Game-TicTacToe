import player.Player;
import board.Board;
import game.Game;
import symbol.Symbol;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----------TicTacToe Game-----------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size and default char to be filled initially:");
        Board board=new Board(sc.nextInt(),sc.next().charAt(0));
        Player player1=new Player();
        Player player2=new Player();
        Symbol symbol=new Symbol();
        //fill details of player1
        System.out.println("Fill the details of Player1:");
         System.out.println("Enter player name:");
        player1.setName(sc.next());
        System.out.println("Enter surname of player:");
        player1.setSurname(sc.next());
        System.out.println("Enter mobile number of player:");
        while(player1.setContact(sc.nextDouble())==0){

        }
        System.out.println("Enter age of player:");
        player1.setAge(sc.nextInt());
        System.out.println("Enter college name of player:");
        player1.setCollgeName(sc.next());
        //fill details of player2
        System.out.println("Fill the details of Player2:");
        System.out.println("Enter player name:");
       player2.setName(sc.next());
       System.out.println("Enter surname of player:");
       player2.setSurname(sc.next());
       System.out.println("Enter mobile number of player:");
       while(player2.setContact(sc.nextDouble())==0){

       }
       System.out.println("Enter age of player:");
       player2.setAge(sc.nextInt());
       System.out.println("Enter college name of player:");
       player2.setCollgeName(sc.next());
       System.out.println("Verify details of players:");
       player1.getDetails();
       player2.getDetails();
       Game game=new Game();
       boolean flag=false;
       symbol.setSymbol(player1, player2);
       symbol.getSymbol(player1,player2);
       while(game.noOfTurns!=board.size*board.size){
        board.getBoardConfig();
        System.out.println("------------------------------");
        System.out.println(player1.getName()+" it's yours turn"+"(Your symbol is "+player1.symbol+" ):");
             
            while(game.fillCell(sc.nextInt(),player1,board)){
                 System.out.println("Error occured see again!");
            }
            if(game.getWinner(player1,board.size,board)==1){
                System.out.println("------------------------------");
                board.getBoardConfig();
                System.out.println(player1.getName()+" is the winner");
                System.out.println("Details of winner:");
                player1.getDetails();
                break;
            }
            if(game.noOfTurns==board.size*board.size){
                flag=true;
                break;
            }
            System.out.println("------------------------------");
            board.getBoardConfig();
            System.out.println(player2.getName()+"  it's yours turn"+"(Your symbol is "+player2.symbol+" ):");
            while(game.fillCell(sc.nextInt(),player2,board)){
               System.out.println("Error occured see again!");
            }
            if(game.getWinner(player2,board.size,board)==1){
                System.out.println("------------------------------");
                board.getBoardConfig();
                System.out.println(player2.getName()+" is the winner");
                System.out.println("Details of winner:");
                player2.getDetails();
                break;
            }
            if(game.noOfTurns==board.size*board.size){
                flag=true;
                break;
            }
              
       }
      
       if(flag){
        System.out.println("------------------------------");
        board.getBoardConfig();
       System.out.println("Draw");
       }
        
        

    }
}
