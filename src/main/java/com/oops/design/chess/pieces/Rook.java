package com.oops.design.chess.pieces;

import com.oops.design.chess.Board;
import com.oops.design.chess.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sangramsing
 */
public class Rook extends Piece {

    private List<Square> possibleMoves;

    public Rook() {
        this.possibleMoves = new ArrayList<>();
    }

    @Override
    public List<Square> generatePossibleMoves() {
        int column = getSquare().getColumn();
        int row = getSquare().getRow();
        int j = column;
        // down
        for (int i = row + 1; i < Board.SIZE; ) {
            Square square = getSquare().getBoardSquare(i, j);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else {
                break;
            }
            i++;
        }
        // up
        for (int i = row - 1; i >= 0; ) {
            Square square = getSquare().getBoardSquare(i, j);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else {
                break;
            }
            i--;
        }

        // left
        j = row;
        for (int i = column + 1; i < Board.SIZE; ) {
            Square square = getSquare().getBoardSquare(j, i);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else {
                break;
            }
            i++;
        }
        // left
        j = row;
        for (int i = column - 1; i >=0 ; ) {
            Square square = getSquare().getBoardSquare(j, i);
            if (square.getPiece() == null) {
                possibleMoves.add(square);
            } else {
                break;
            }
            i--;
        }
        return possibleMoves;
    }
}
