package com.oops.design.chess.pieces;

import com.oops.design.chess.Board;
import com.oops.design.chess.PieceFactory;
import com.oops.design.chess.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sangramsing
 */
public class Queen extends Piece {

    private List<Square> possibleMoves;

    public Queen() {
        possibleMoves = new ArrayList<>();
    }

    @Override
    public List<Square> generatePossibleMoves() {
        // As Queen moves across the board in all direction
        // so we will use Rook and Bishop's moves to populate Queen's possible moves.
        Piece rook = PieceFactory.getPiece("Rook");
        rook.setSquare(getSquare());
        List<Square> rookMoves = rook.generatePossibleMoves();
        possibleMoves.addAll(rookMoves);

        Piece bishop = PieceFactory.getPiece("Bishop");
        bishop.setSquare(getSquare());
        List<Square> bishopMoves = bishop.generatePossibleMoves();
        possibleMoves.addAll(bishopMoves);

        return possibleMoves;
    }
}
