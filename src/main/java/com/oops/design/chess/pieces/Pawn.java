package com.oops.design.chess.pieces;

import com.oops.design.chess.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sangramsing
 */
public class Pawn extends Piece{

    List<Square> possibleMoves;

    public Pawn() {
        possibleMoves = new ArrayList<>();
    }

    @Override
    public List<Square> generatePossibleMoves() {
        // Pass first arg based on White or Black...
        // for now we are considering forward vertical direction only.
        Square nextSquare = getSquare().getNextSquare(-1, 0);
        if (nextSquare == null) {
            System.out.println("Invalid move.");
            return possibleMoves; // Invalid move return empty list.
        }
        if ( nextSquare.getPiece() == null)
            possibleMoves.add(nextSquare);
        //Check if Pawn is at starting position, if yes, then it can move two locations.
        if (getSquare().getRow() == 6) {
            Square nextSquare2 = nextSquare.getNextSquare(-1, 0);
            if (nextSquare2 != null && nextSquare2.getPiece()==null)
                possibleMoves.add(nextSquare2);
        }
        if (getSquare().getRow() == 1) {
            Square nextSquare2 = nextSquare.getNextSquare(-1, 0);
            if (nextSquare2 != null && nextSquare2.getPiece()==null)
                possibleMoves.add(nextSquare2);
        }
        return possibleMoves;
    }
}
