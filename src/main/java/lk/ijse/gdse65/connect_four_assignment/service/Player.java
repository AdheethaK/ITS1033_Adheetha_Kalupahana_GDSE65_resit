package lk.ijse.gdse65.connect_four_assignment.service;

public abstract class Player {

    //an abstract base class for both human and AI players.It defines the common
    // interface for making moves

    //the game board on which the player will make moves
    protected BoardImpl board;

    public Player(Board board){}

    // Abstract method that must be implemented by subclasses to execute a move
    public abstract void move(int row,int col);
}
