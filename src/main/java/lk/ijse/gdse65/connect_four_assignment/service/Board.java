package lk.ijse.gdse65.connect_four_assignment.service;

public interface Board {

    // Defines the essential methods that any implementation of a Tic-Tac-Toe board must provide

    public BoardUI getBoardUI();
    public void initializeBoard();
    public Boolean isLegalMove(int row,int col);
    public void updateMove(int row,int col,Piece piece);
    public Winner checkWinner();
    public void printBoard();
}
