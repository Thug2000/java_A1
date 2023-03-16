import static java.lang.Math.abs;

public class King extends Piece {
    private Position position;
    private int color;

    public King(Position position, int color){
        this.initPosition(position);
        this.color = color;
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board){
        return abs(newPosition.getIntColumn() - this.getPosition().getIntColumn()) <= 1 && abs(newPosition.getRow() - this.getPosition().getRow()) <= 1 && (board[newPosition.getRow() - 1][newPosition.getIntColumn()].isEmpty() || board[newPosition.getRow() - 1][newPosition.getIntColumn()].getPiece().getColour() != this.getColour());
    }

    @Override
    public String toString() {
        return "K";
    }
}
