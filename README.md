Project Name : TicTacToe
Project requirements : 1. A board (matrix)
                       2. Two players
Rules : If any player completes any of these combinations consisting of symbol given to him he will be considered as winner
        -> A row
        ->A column
        ->clockwise diagonal
        ->anti-clockwise diagonal
        if all cells in board are filled but no one made any combination then it will be considered as draw
Project outcome : 1. Player1 may be the winner
                  2. Player2 may be the winner
                  3.Play can be a draw
Project description :
Here there are Four classes inside seperate package.There are :
1.Board
2.Player
3.Symbol
4.Game
I.Board class:
->Consider a char matrix and size of matrix
->Use constructor to initialize matrix with default character taken from user
->getBoardConfig() method :
      will provides current configuration of board(matrix)
II.Player class:
->Take personal information of player using setters, initialize private data memebers
->getName():
     will return name of the player
->getDetails():
      will return personal details of player
      . It is used while announcing winner of the play
III. Symbol class :
->To assign symbol to player randomly
->Here Random inbuilt class is used to get 0/1 randomly by the system.
->This helps in fair play
->Here two symbols are 'X' and 'O'
IV. Game class:
->The entire logic is written inside Game class
->Considering noOfTurns variable to keep track of how many cells filled
->fillCell():
   . Here we will take player who wants to take a move and position where they wish to place their symbol
   . If position is not out of bounds and if position not filled by any player before then symbol will be places in desired position
   . else then symbol will not be placed in board
->getWinner():
   . It will take player for whose we need to check whether he is winner or not
   . we will check for the combinations be fulfilled or not (row,column,clockwise diagonal,anti-clockwise diagonal) with the player symbol given
   . if fulfilled any of them then consider that player as winner
   . Check whether noOfTurns crossed no of cells limit then consider as draw
->gameOver():
   . if noOfTurns crossed no of cells limit then consider as draw
   . else not draw
**********************************************************************************************************************************************************
App class:
->In this class import all packages discussed above
->Use all methods in different classes
                 
