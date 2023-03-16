public abstract class Piece {

    private Position position;
    protected int colour;
    public abstract boolean isValidMove(Position newPosition, Cell[][] board);
    public abstract String toString();
    public Position getPosition(){
        return position;
    }

    public void setPosition(Position newPos, Cell[][] board){
        board[position.getRow()-1][position.getIntColumn()].setPiece(null);
        board[position.getRow()-1][position.getIntColumn()].setEmpty(true);
        position = newPos;
        board[newPos.getRow()-1][newPos.getIntColumn()].setPiece(this);
        board[newPos.getRow()-1][newPos.getIntColumn()].setEmpty(false);
    }

    public void initPosition(Position basePosition){
        position = basePosition;
    }

    public int getColour(){
        return colour;
    }
}
