package lk.ijse.gdse65.connect_four_assignment.service;

public interface BoardUI {
    public void update(int col,int row,boolean isHuman);
    public void NotifyWinner();
}
