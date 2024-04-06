package game.chess.piece.pieces;

import game.chess.piece.ChessPiece;

public class King extends ChessPiece {

    private final String whitePiece = "♔";
    private final String blackPiece = "♚";


    @Override
    public String toString()
    {
        if (this == this) // placeholder logic
            return whitePiece;
        return blackPiece;
    }
}
