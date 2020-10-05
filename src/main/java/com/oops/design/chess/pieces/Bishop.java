package com.oops.design.chess.pieces;

import com.oops.design.chess.Board;
import com.oops.design.chess.Square;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {

    private List<Square> possibleMoves;

    public Bishop( ) {
        possibleMoves = new ArrayList<>();
    }

    @Override
    public List<Square> generatePossibleMoves() {
        int column = getSquare().getColumn();
        int row = getSquare().getRow();
        int j= column+1;

        //down right
        for (int i= row+1; (i < Board.SIZE  && j <Board.SIZE);) {
            Square square = getSquare().getBoardSquare(i, j);
            if (square.isEmpty()) {
                possibleMoves.add(square);
            } else {
                break;
            }
            i++;
            j++;
        }

        // up left
        j=column-1;
        for (int i= row-1; (i >= 0 && j >= 0);) {
            Square square = getSquare().getBoardSquare(i, j);
            if (square.isEmpty()) {
                possibleMoves.add(square);
            }
            i--;
            j--;
        }

        // up right
        j = column+1;
        for (int i=row-1; (i >= 0 && j < Board.SIZE);) {
            Square square = getSquare().getBoardSquare(i, j);
            if (square.isEmpty()) {
                possibleMoves.add(square);
            }
            i--;
            j++;
        }

        // down left
        j = column-1;
        for (int i=row+1; (i < Board.SIZE && j >= 0);) {
            Square square = getSquare().getBoardSquare(i, j);
            if (square.isEmpty()) {
                possibleMoves.add(square);
            }
            i++;
            j--;
        }
        return possibleMoves;
    }
}
