public class Position {
    private char column;
    private int row;

    public Position(int row,char column){
        this.column=column;
        this.row=row;

    }

    public String toString(){
        return column +Integer.toString(row);
    }

    public int getRow() {
        return row;
    }

    public int getIntColumn() {
        return column-97;
    }
}
