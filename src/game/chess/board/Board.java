package game.chess.board;

import game.chess.piece.Piece;
import game.chess.piece.pieces.*;

/**
 * Board - a class to represent a board to play a game on.
 *
 * @author Harry Hainsworth-Staples
 */
public class Board {

    Piece[][] board;

    public Board(int x, int y)
    {
        this.board = new Piece[x][y];
    }

    public void initialiseBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                switch (i) {
                    case 0:
                    case 7:
                        switch (j) {
                            case 0:
                            case 7:
                                board[i][j] = new Rook();
                                break;
                            case 1:
                            case 6:
                                board[i][j] = new Knight();
                                break;
                            case 2:
                            case 5:
                                board[i][j] = new Bishop();
                                break;
                            case 3:
                                board[i][j] = new Queen();
                                break;
                            case 4:
                                board[i][j] = new King();
                                break;
                        }
                        break;
                    case 1:
                    case 6:
                        board[i][j] = new Pawn();
                        break;


                }


            }
        }
    }

    public void displayBoard() {
        System.out.println("  | A | B | C | D | E | F | G | H |");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j == 0)
                    System.out.print((i + 1) + " | ");
                if (board[i][j] == null)
                    System.out.print("  | ");
                else
                    System.out.print(board[i][j] + " | ");
                if (j == 7)
                    System.out.print((i + 1));
            }
            System.out.println();
            System.out.println("-------------------------------------");
        }
        System.out.println("  | A | B | C | D | E | F | G | H |");
    }
}
