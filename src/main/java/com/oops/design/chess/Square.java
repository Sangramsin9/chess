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

    public Square(int row, int column, Board board) {
        this.row = row;
        this.column = column;
        this.board = board;
    }

}
