package com.oops.design.chess;

import com.oops.design.chess.constant.PieceType;
import com.oops.design.chess.pieces.*;

/**
 * Piece Factory Implementation.
 * @author Sangramsing
 */
public class PieceFactory {

    /**
     * @param pieceType (possible values Pawn, Rook, Bishop, Horse, Queen, King)
     * @return piece instance.
     */
    public static Piece getPiece(String pieceType) {
        switch (PieceType.resolve(pieceType)) {
            case PAWN: return new Pawn();
            case BISHOP: return new Bishop();
            case ROOK: return new Rook();
            case QUEEN: return new Queen();
            case KING: return new King();
            case HORSE: return new Horse();
            default:
                throw new RuntimeException("Invalid piece type.");
        }
    }

}
