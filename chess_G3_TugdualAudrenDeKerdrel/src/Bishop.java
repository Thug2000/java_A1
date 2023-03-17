import static java.lang.Math.abs;

public class Bishop extends Piece {
    private Position position;
    private int color;

    public Bishop(Position position, int color) {
        this.initPosition(position);
        this.color = color;
    }

    @Override
    public boolean isValidMove(Position newPosition, Cell[][] board){
        boolean valid = false;
        int compt=0;

        if (abs(newPosition.getRow()-this.getPosition().getRow()) == abs(newPosition.getIntColumn()-this.getPosition().getIntColumn())){

            if (newPosition.getRow()>this.getPosition().getRow() && newPosition.getIntColumn()>this.getPosition().getIntColumn()){
                for(int i=1; i<newPosition.getRow()-this.getPosition().getRow();i++){
                    if (!board[this.getPosition().getRow() - 1 + i][this.getPosition().getIntColumn() + i].isEmpty()){
                        compt++;
                    }
                }
            }
            else if (newPosition.getRow()<this.getPosition().getRow() && newPosition.getIntColumn()<this.getPosition().getIntColumn()){
                for(int i=1; i<abs(newPosition.getRow()-this.getPosition().getRow());i++){
                    if (!board[this.getPosition().getRow() - 1 - i][this.getPosition().getIntColumn() - i].isEmpty()){
                        compt++;
                    }
                }
            }
            else if (newPosition.getRow()>this.getPosition().getRow() && newPosition.getIntColumn()<this.getPosition().getIntColumn()){
                for(int i=1; i<abs(newPosition.getRow()-this.getPosition().getRow());i++){
                    if (!board[this.getPosition().getRow() - 1 + i][this.getPosition().getIntColumn() - i].isEmpty()){
                        compt++;
                    }
                }
            }
            else if (newPosition.getRow()<this.getPosition().getRow() && newPosition.getIntColumn()>this.getPosition().getIntColumn()){
                for(int i=1; i<abs(newPosition.getRow()-this.getPosition().getRow());i++){
                    if (!board[this.getPosition().getRow() - 1 - i][this.getPosition().getIntColumn() + i].isEmpty()){
                        compt++;
                    }
                }
            }

            if(compt==0 && (board[newPosition.getRow() - 1][newPosition.getIntColumn()].isEmpty() || board[newPosition.getRow()-1][newPosition.getIntColumn()].getPiece().getColour() != this.getColour())){
                valid=true;
            }
        }
        return valid;

    }

    @Override
    public String toString() {
        return "B";
    }
}
