package chess;

import boardgame.Position;

public class ChessPositon {
    private char column;
    private int row;

    public ChessPositon(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw  new ChessExcepiton("Error instantiating ChessPositon");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPositon(){
        return new Position(8 - row,column - 'a' );
    }

    protected static ChessPositon fromPositon(Position pos){
        return  new ChessPositon((char)('a' - pos.getCol()), 8 - pos.getRow() );
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}
