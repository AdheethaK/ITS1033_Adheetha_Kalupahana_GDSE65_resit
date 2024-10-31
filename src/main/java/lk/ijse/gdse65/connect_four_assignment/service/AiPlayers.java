package lk.ijse.gdse65.connect_four_assignment.service;

import java.util.Random;

public class AiPlayers extends Player{

    // handles the AI player logic. Later it can be enhanced with algorithms like Minimax

    // Generates random moves for the AI
    Random random;

    public AiPlayers(Board board) {
        super(board);
    }

    // selects a random valid move on the board and places an 0 in the corresponding location
    @Override
    public void move(int row, int col) {

    }
}
