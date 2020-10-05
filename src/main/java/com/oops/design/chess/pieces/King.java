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

        int arr [][] = {
                {row+1, col},
                {row-1, col},
                {row, col+1},
                {row, col-1},
                {row+1, col+1},
                {row+1, col-1},
                {row-1, col-1},
                {row-1, col+1}
        };

        for (int a[] : arr) {
            Square square = getSquare().getBoardSquare(a[0],a[1]);
            if (square != null && square.getPiece() == null) {
                possibleMoves.add(square);
            }
        }

        return possibleMoves;
    }

}
