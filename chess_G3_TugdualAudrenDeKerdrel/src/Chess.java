import java.util.Scanner;

public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;

    private Scanner sc = new Scanner(System.in);

    public void play(){
        while (true){
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()){
                printBoard();
                String move;
                do {
                    move=askMove();
                }
                while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }

    }

    private void createPlayers(){
        players = new Player[2];
        System.out.println("Veuillez entrer le nom du joueur blanc :");
        String name1=sc.nextLine();
        players[0] = new Player(name1, 0);
        System.out.println("Veuillez entrer le nom du joueur noir :");
        String name2=sc.nextLine();
        players[1] = new Player(name2, 1);
        this.currentPlayer=players[0];
    }

    private void initialiseBoard(){
        board=new Cell[8][8];
        board[0][0]=new Cell(new Position(1,'a'),false,"R",1);
        board[0][1] = new Cell(new Position(1,'b'),false,"N",1);
        board[0][2] = new Cell(new Position(1,'c'),false,"B",1);
        board[0][3] = new Cell(new Position(1,'d'),false,"K",1);
        board[0][4] = new Cell(new Position(1,'e'),false,"Q",1);
        board[0][5] = new Cell(new Position(1,'f'),false,"B",1);
        board[0][6] = new Cell(new Position(1,'g'),false,"N",1);
        board[0][7] = new Cell(new Position(1,'h'),false,"R",1);

        for(int i=0;i<8;i++){
            board[1][i] = new Cell(new Position(2,(char)('a'+i)),false,"P",1);
        }

        for (int c=2;c<6;c++){
            for (int a = 0;a<8;a++){
                board[c][a] = new Cell(new Position(2,(char)('a'+a)),true,"0",1);

            }
        }

        for(int j=0;j<8;j++){
            board[6][j] = new Cell(new Position(7,(char)('a'+j)),false,"P",0);
        }
        board[7][0]=new Cell(new Position(8,'a'),false,"R",0);
        board[7][1] = new Cell(new Position(8,'b'),false,"N",0);
        board[7][2] = new Cell(new Position(8,'c'),false,"B",0);
        board[7][3] = new Cell(new Position(8,'d'),false,"K",0);
        board[7][4] = new Cell(new Position(8,'e'),false,"Q",0);
        board[7][5] = new Cell(new Position(8,'f'),false,"B",0);
        board[7][6] = new Cell(new Position(8,'g'),false,"N",0);
        board[7][7] = new Cell(new Position(8,'h'),false,"R",0);
    }

    private void printBoard(){
        for (int i=0;i<8;i++){
            for (int c=0;c<8;c++){
                if (board[i][c].getPiece() != null) {
                    System.out.print(board[i][c].getPiece().toString());
                }
                else{
                    System.out.print("0");
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    private String askMove(){
        int format=0;
        String move = "";

        while(format==0) {
            String couleur = (currentPlayer.getColour() == 0) ? "blanc " : "noir ";
            System.out.print("Joueur " + couleur + "(" + this.currentPlayer.getName() + "), ");
            System.out.println("veuillez entrer un coup valide :");
            move = sc.nextLine();

            if (move.length() == 7) {
                if (move.charAt(0) == 'K' || move.charAt(0) == 'Q' || move.charAt(0) == 'B' || move.charAt(0) == 'R' || move.charAt(0) == 'N' || move.charAt(0) == 'P') {
                    if (move.charAt(1) <= 'a' + 8 && move.charAt(1) >= 'a' && move.charAt(2) <= '8' && move.charAt(2) > '0') {
                        if (move.charAt(4) == move.charAt(0) && move.charAt(3) == 32) {
                            if (move.charAt(5) <= 'a' + 8 && move.charAt(5) >= 'a' && move.charAt(6) <= '8' && move.charAt(6) > '0') {
                                format = 1;
                            }
                        }
                    }
                }

            }
        }
        System.out.println("Votre mouvement : " + move);
        return move;

    }

    private boolean isCheck(){
        return false;
    }

    private boolean isCheckMate(){
        return false;
    }

    private boolean isValidMove(String move){
        boolean valid = false;
        int currentRow = move.charAt(2)-48;
        int currentCol = move.charAt(1)-97;
        int newRow = move.charAt(6)-48;
        int newCol = move.charAt(5)-97;

        if (!board[currentRow - 1][currentCol].isEmpty() && board[currentRow-1][currentCol].getPiece().toString().charAt(0)==move.charAt(0) && board[currentRow-1][currentCol].getPiece().colour==currentPlayer.getColour()){
            valid=board[currentRow-1][currentCol].getPiece().isValidMove(new Position(newRow, move.charAt(5) ),board);
        }
        return valid;
    }

    private void updateBoard(String move){
        board[(move.charAt(2)-48-1)][move.charAt(1)-97].getPiece().setPosition(new Position(move.charAt(6)-48, move.charAt(5) ),board);

    }

    private void switchPlayer(){
        this.currentPlayer=(currentPlayer==players[0]) ? players[1] : players[0];
    }
}
