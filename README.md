# Tic-Tac-Toe

This is a simple graphical implementation of the classic game tic-tac-toe.

Players alternate placing X's or O's into a 3x3 grid.
The first player to get 3 of either symbol in a row (diagonal,
horizontal, or vertical), wins!

# Requirements

Java openjdk runtime >= 11.0.2 (or equivalent from Oracle).

# Compilation / running

This project is built using `Maven >= 3.6.3`.

From the root project directory (which contains this `README` file):
1. `mvn verify`
2. `mvn package`
3. `java -cp  target/tictac-toe-1.0-SNAPSHOT.jar io.github.caitlinrichard.tictactoe.TicTacToeGame`
