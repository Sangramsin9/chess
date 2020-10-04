package com.oops.design.chess.pieces;

import com.oops.design.chess.Square;

import java.util.List;

/**
 * @author Sangramsing
 */
public abstract class Piece {

    private Square square;

    private boolean isWhite;

    public Piece() {
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public abstract List<Square> generatePossibleMoves();

}
