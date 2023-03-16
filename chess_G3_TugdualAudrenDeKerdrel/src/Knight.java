import static java.lang.Math.abs;

public class Knight extends Piece {
    private Position position;
    private int color;


    public Knight(Position position, int color){
        this.initPosition(position);
        this.color = color;
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board){
        boolean valid = abs(newPosition.getRow() - this.getPosition().getRow()) == 2 && abs(newPosition.getIntColumn() - this.getPosition().getIntColumn()) == 1 && (board[newPosition.getRow() - 1][newPosition.getIntColumn()].isEmpty() || board[newPosition.getRow() - 1][newPosition.getIntColumn()].getPiece().getColour() != this.getColour());

        if (abs(newPosition.getRow()-this.getPosition().getRow())==1 && abs(newPosition.getIntColumn()-this.getPosition().getIntColumn())==2 && (board[newPosition.getRow() - 1][newPosition.getIntColumn()].isEmpty() || board[newPosition.getRow()-1][newPosition.getIntColumn()].getPiece().getColour() != this.getColour())){
            valid=true;
        }
        return valid;
    }

    @Override
    public String toString() {
        return "N";
    }


}
