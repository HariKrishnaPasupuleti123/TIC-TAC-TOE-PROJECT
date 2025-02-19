# Tic-Tac-Toe Game (Java)

## Overview
This is a simple **Tic-Tac-Toe** game implemented in Java, featuring both **human vs AI** and **two-player** modes. Players can compete against an AI opponent or play against another human.

## Features
- **Human vs AI Gameplay**: One player is human, and the other is an AI making random moves.
- **Two-Player Mode**: Two human players can take turns making moves.
- **3x3 Board Formation**: The game maintains a valid 3x3 Tic-Tac-Toe grid.
- **Win Conditions**: The game checks for row, column, or diagonal wins.
- **Draw Condition**: The game detects when the board is full and ends in a draw.
- **Player Turns**: The game alternates turns between the players.

## How to Play
1. Run the `Launch` class.
2. Choose the game mode: **Human vs AI** or **Two-Player Mode**.
3. If playing against AI, the human player enters a row and column (0-2) to place their mark (`X`). The AI then makes a random valid move (`O`).
4. If in two-player mode, both players take turns entering their row and column.
5. The game continues until a player wins or the board is full (draw).
6. The winner or draw result is displayed.

## Classes & Responsibilities
- **TicTacToe**: Handles the game board, marking positions, and checking win/draw conditions.
- **Player (Abstract Class)**: Base class for both human and AI players.
- **HumanPlayer**: Allows user input for making moves.
- **AiPlayer**: Generates random moves for the AI opponent.
- **Launch**: Main class to run the game.

## Setup & Execution
1. **Compile the Code**:
   ```sh
   javac Launch.java
   ```
2. **Run the Game**:
   ```sh
   java Launch
   ```

## Example Game Output
```
Player Turn
Enter row and column: 1 1
-------------
|   |   |   |
-------------
|   | X |   |
-------------
|   |   |   |
-------------
AI Turn
-------------
|   |   | O |
-------------
|   | X |   |
-------------
|   |   |   |
-------------
```

## Future Enhancements
- Improve AI logic to make smarter moves.
- Implement an advanced AI difficulty level.
- Add a graphical user interface (GUI).

## Author
**Hari Krishna Pasupuleti**
