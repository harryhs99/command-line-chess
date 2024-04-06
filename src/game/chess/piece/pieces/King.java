package game.chess.piece.pieces;

import game.chess.piece.ChessPiece;

public class King extends ChessPiece {

    public King(boolean colour)
    {
        super(colour);
    }

    @Override
    public String toString()
    {
        if (this.colour) // placeholder logic
            return "♔";
        return "♚";
    }
}
