
public class Cell {
    private final Position position;
    private boolean isEmpty;
    private Piece piece;


    public Cell(Position position, boolean isEmpty, String pieceLetter,int color){
        this.position=position;
        this.isEmpty=isEmpty;
        switch (pieceLetter) {
            case "R" -> this.piece = new Rook(this.position, color);
            case "B" -> this.piece = new Bishop(this.position, color);
            case "K" -> this.piece = new King(this.position, color);
            case "N" -> this.piece = new Knight(this.position, color);
            case "P" -> this.piece = new Pawn(this.position, color);
            case "Q" -> this.piece = new Queen(this.position, color);
            case "0" -> this.piece = null;
        }
    }

    public Position getPosition() {
        return position;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Piece getPiece(){
        return piece;
    }

    public void setPiece(Piece piece){
        this.piece=piece;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
