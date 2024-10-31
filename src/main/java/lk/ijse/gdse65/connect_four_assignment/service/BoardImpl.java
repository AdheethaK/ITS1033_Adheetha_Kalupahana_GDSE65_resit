package lk.ijse.gdse65.connect_four_assignment.service;

import javafx.scene.image.Image;

public class BoardImpl implements Board{

    // Represents the Tic-Tac-Toe board and handles game logic , including validating moves ,
    // updating the board state and checking for a winner

    // What to do here :
    //      1. TODO: Initialize a 3x3 grid to represent the board
    //      2. Implement methods :
    //                  TODO: 1). findNextAvailableSpot():return the next available cell in a row or column
    //                  TODO: 2). isLegalMove(int row,int col):check if a move is valid
    //                  TODO: 3). updateMove(int row,int col,Piece piece):update the board with the current move
    //                  TODO: 4). findWinner():check if a player has won by forming a line of three pieces

    public Piece[][] pieces = new Piece[3][3]; // A 2D array representing the Tic-Tac-Toe board [3 x 3 grid]
    public BoardUI boardUI;

    //Initializes the board , filling all cells with Piece.EMPTY
    public BoardImpl(BoardUI boardUI){
        initializeBoard();
    }

    @Override
    public BoardUI getBoardUI() {
        return null;
    }

    // Resets the board to an empty state
    @Override
    public void initializeBoard() {
        for ( int i = 0 ; i < pieces.length ; i++ ){
            for ( int j = 0 ; j < pieces[i].length ; j++ ){
                pieces[i][j]=Piece.EMPTY;
            }
        }
    }

    // Checks whether a move to the specified row and column is valid
    @Override
    public Boolean isLegalMove(int row, int col) {
        if(pieces[row][col] == Piece.EMPTY){
            return true;
        }else {
            return false;
        }
    }

    // Updates the board by placing a piece ( X or 0 ) at the specified location
    @Override
    public void updateMove(int row, int col, Piece piece) {
        pieces[row][col] = piece;
    }

    //Checks if there is a winner,returns the winning piece or indicates a tie/no winner.
    @Override
    public Winner checkWinner() {
        return null;
    }

    //Displays the current board state in the console
    @Override
    public void printBoard() {
        System.out.println("|"+print_piece(pieces[2][0])+"|"+print_piece(pieces[2][1])+"|"+print_piece(pieces[2][2]));
        System.out.println("|"+print_piece(pieces[1][0])+"|"+print_piece(pieces[1][1])+"|"+print_piece(pieces[1][2]));
        System.out.println("|"+print_piece(pieces[0][0])+"|"+print_piece(pieces[0][1])+"|"+print_piece(pieces[0][2]));
    }
    public String print_piece(Piece piece){
        if (piece == Piece.EMPTY){
            return " ";
        } else if (piece == Piece.X) {
            return "X";
        } else {
            return " ";
        }
    }

}
