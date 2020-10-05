package com.oops.design.chess.pieces;

import com.oops.design.chess.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sangramsing
 */
public class Horse extends Piece {

    private List<Square> possibleMoves;

    public Horse() {
        possibleMoves = new ArrayList<>();
    }

    @Override
    public List<Square> generatePossibleMoves() {
        int row = getSquare().getRow();
        int column = getSquare().getColumn();

        int arr [][] = {
                {row+2, column-1},
                {row+2, column+1},
                {row-2, column-1},
                {row-2, column+1},
                {row+1, column+2},
                {row-1, column+2},
                {row+1, column-2},
                {row-1, column-2}
        };

        for (int a[] : arr) {
            Square boardSquare = getSquare().getBoardSquare(a[0], a[1]);
            if (boardSquare!= null && boardSquare.getPiece()==null) {
                possibleMoves.add(boardSquare);
            }
        }

        return possibleMoves;
    }
}
