# TicTacToe

## Project Requirements

1. A board (matrix)
2. Two players

## Rules

If any player completes any of these combinations consisting of the symbol given to him, he will be considered as the winner:

- A row
- A column
- Clockwise diagonal
- Anti-clockwise diagonal

If all cells on the board are filled but no one made any combination, then it will be considered as a draw.

## Project Outcome

1. Player 1 may be the winner.
2. Player 2 may be the winner.
3. The play can be a draw.

## Project Description

The project consists of four classes inside separate packages:

1. **Board Class:**
   - Consider a char matrix and size of the matrix.
   - Use the constructor to initialize the matrix with the default character taken from the user.
   - `getBoardConfig()` method: Provides the current configuration of the board (matrix).

2. **Player Class:**
   - Takes personal information of the player using setters, initializes private data members.
   - `getName()`: Returns the name of the player.
   - `getDetails()`: Returns personal details of the player, used when announcing the winner.

3. **Symbol Class:**
   - Assigns a symbol to a player randomly using the Random inbuilt class to get 0/1 randomly.
   - Ensures fair play with two symbols: 'X' and 'O'.

4. **Game Class:**
   - The entire logic is written inside the Game class.
   - Considers the `noOfTurns` variable to keep track of how many cells are filled.
   - `fillCell()`: Takes a player who wants to make a move and the position where they wish to place their symbol. If the position is not out of bounds and not filled by any player before, the symbol will be placed in the desired position.
   - `getWinner()`: Takes a player and checks if any of the combinations (row, column, clockwise diagonal, anti-clockwise diagonal) with the player's symbol are fulfilled. If any of them are fulfilled, consider that player as the winner. Checks if `noOfTurns` crossed the number of cells limit, then considers it a draw.
   - `gameOver()`: Checks if `noOfTurns` crossed the number of cells limit, then considers it a draw; otherwise, not a draw.

## App Class

In this class, import all the packages discussed above and use all the methods in different classes.
