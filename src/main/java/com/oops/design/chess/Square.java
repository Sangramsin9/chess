package com.oops.design.chess;

import com.oops.design.chess.pieces.Piece;

/**
 * @author Sangramsing
 */
public class Square {

    private int row;
    private int column;
    private Board board;
    private Piece piece;
    private String rowName;

    public Square(int row, int column, Board board, String rowName) {
        this.row = row;
        this.column = column;
        this.board = board;
        this.rowName = rowName;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public Square getNextSquare(int row, int column) {
        return board.getSquare(this.row + row, this.column + column);
    }

    public Square getBoardSquare(int row, int column) {
        return board.getSquare(row,column);
    }

    public boolean isEmpty() {
        return (piece == null);
    }
}
