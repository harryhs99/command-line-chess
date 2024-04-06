package game.chess.piece.pieces;

import game.chess.piece.ChessPiece;

public class Bishop extends ChessPiece {

    public Bishop(boolean colour)
    {
        super(colour);
    }
    @Override
    public String toString()
    {
        if (this.colour) // placeholder logic
            return "♗";
        return "♝";
    }
}
