public class Pawn extends Piece {
    private Position position;
    private int color;

    public Pawn(Position position, int color) {
        this.initPosition(position);
        this.color = color;
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        boolean valid = false;
        if (colour == 0) {
            if (newPosition.getIntColumn() == this.getPosition().getIntColumn() && newPosition.getRow() == (this.getPosition().getRow() - 1) && board[newPosition.getRow() - 1][newPosition.getIntColumn()].isEmpty()) {
                valid = true;
            } else if ((newPosition.getIntColumn() == this.getPosition().getIntColumn() + 1 || newPosition.getIntColumn() == this.getPosition().getIntColumn() - 1) && newPosition.getRow() == (this.getPosition().getRow() - 1) && !board[newPosition.getRow() - 1][newPosition.getIntColumn()].isEmpty() && board[newPosition.getRow() - 1][newPosition.getIntColumn()].getPiece().getColour() != this.colour) {
                valid = true;
            }
        } else {
            if (newPosition.getIntColumn() == this.getPosition().getIntColumn() && newPosition.getRow() == (this.getPosition().getRow() + 1) && board[newPosition.getRow() - 1][newPosition.getIntColumn()].isEmpty()) {
                valid = true;
            } else if ((newPosition.getIntColumn() == this.getPosition().getIntColumn() + 1 || newPosition.getIntColumn() == this.getPosition().getIntColumn() - 1) && newPosition.getRow() == (this.getPosition().getRow() + 1) && !board[newPosition.getRow() - 1][newPosition.getIntColumn()].isEmpty() && board[newPosition.getRow() - 1][newPosition.getIntColumn()].getPiece().getColour() != this.colour) {
                valid = true;
            }

        }
        return valid;


    }

    @Override
    public String toString() {
        return "P";
    }
}
