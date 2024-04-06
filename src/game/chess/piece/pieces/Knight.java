package game.chess.piece.pieces;

import game.chess.piece.ChessPiece;

public class Knight extends ChessPiece {

    public Knight(boolean colour)
    {
        super(colour);
    }


    @Override
    public String toString()
    {
        if (this.colour)
            return "♘";
        return "♞";
    }
}
