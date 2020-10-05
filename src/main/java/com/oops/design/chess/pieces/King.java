package com.oops.design.chess.pieces;

import com.oops.design.chess.Square;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

    private List<Square> possibleMoves;

    public King() {
        possibleMoves = new ArrayList<>();
    }

    @Override
    public List<Square> generatePossibleMoves() {
        int row = getSquare().getRow();
        int col = getSquare().getColumn();

        //down
        Square square = getSquare().getBoardSquare(row+1, col);
        if (square != null && square.getPiece() == null) {
            possibleMoves.add(square);
        }

        // up
        square = getSquare().getBoardSquare(row-1, col);
        if (square != null && square.getPiece() == null) {
            possibleMoves.add(square);
        }
        // left
        square = getSquare().getBoardSquare(row, col+1);
        if (square != null && square.getPiece() == null) {
            possibleMoves.add(square);
        }
        // left
        square = getSquare().getBoardSquare(row, col-1);
        if (square != null && square.getPiece() == null) {
            possibleMoves.add(square);
        }

        // down left
        square = getSquare().getBoardSquare(row+1, col+1);
        if (square != null && square.getPiece() == null) {
            possibleMoves.add(square);
        }
        // down right
        square = getSquare().getBoardSquare(row+1, col-1);
        if (square != null && square.getPiece() == null) {
            possibleMoves.add(square);
        }
        // up left
        square = getSquare().getBoardSquare(row-1, col-1);
        if (square != null && square.getPiece() == null) {
            possibleMoves.add(square);
        }
        // up right
        square = getSquare().getBoardSquare(row-1, col+1);
        if (square != null && square.getPiece() == null) {
            possibleMoves.add(square);
        }

        return possibleMoves;
    }

}
