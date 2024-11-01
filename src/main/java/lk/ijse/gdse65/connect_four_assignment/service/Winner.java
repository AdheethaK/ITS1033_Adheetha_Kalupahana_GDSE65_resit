package lk.ijse.gdse65.connect_four_assignment.service;

public class Winner {
    public Piece WinningPiece;
    public int col1;
    public int row1;
    public int col2;
    public int row2;
    public int col3;
    public int row3;

    public Piece getWinningPiece() {
        return WinningPiece;
    }

    @Override
    public String toString() {
        return "Winner{" +
                "WinningPiece=" + WinningPiece +
                ", col1=" + col1 +
                ", row1=" + row1 +
                ", col2=" + col2 +
                ", row2=" + row2 +
                ", col3=" + col3 +
                ", row3=" + row3 +
                '}';
    }

    public void setWinningPiece(Piece winningPiece) {
        WinningPiece = winningPiece;
    }

    public int getCol1() {
        return col1;
    }

    public void setCol1(int col1) {
        this.col1 = col1;
    }

    public int getRow1() {
        return row1;
    }

    public void setRow1(int row1) {
        this.row1 = row1;
    }

    public int getCol2() {
        return col2;
    }

    public void setCol2(int col2) {
        this.col2 = col2;
    }

    public int getRow2() {
        return row2;
    }

    public void setRow2(int row2) {
        this.row2 = row2;
    }

    public int getCol3() {
        return col3;
    }

    public void setCol3(int col3) {
        this.col3 = col3;
    }

    public int getRow3() {
        return row3;
    }

    public void setRow3(int row3) {
        this.row3 = row3;
    }

    public Winner(Piece winningPiece){

    }
    public Winner(Piece winningPiece,int col1,int row1,int col2,int row2,int col3,int row3){
        this.WinningPiece = winningPiece;
        this.col1=col1;
        this.row1=row1;
        this.col2=col2;
        this.row2 =row2;
        this.col3=col3;
        this.row3=row3;
    }
}
