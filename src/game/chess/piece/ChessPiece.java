package game.chess.piece;

/**
 * ChessPiece - abstract representation of a chess piece.
 *
 * @author Harry Hainsworth-Staples
 */
public abstract class ChessPiece implements Piece {

    protected boolean colour;

    public ChessPiece(boolean colour)
    {
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "";
    }
}
