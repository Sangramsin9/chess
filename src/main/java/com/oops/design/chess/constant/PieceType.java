package com.oops.design.chess.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sangramsing
 */
public enum PieceType {

    PAWN("Pawn"),
    ROOK("Rook"),
    BISHOP("Bishop"),
    HORSE("Horse"),
    QUEEN("Queen"),
    KING("King");

    public final String type;
    //Lookup table
    private static final Map<String, PieceType> lookup = new HashMap<>();

    static {
        for(PieceType pieceType : PieceType.values()) {
            lookup.put(pieceType.getType(), pieceType);
        }
    }

    PieceType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static PieceType resolve(String piece) {
        return lookup.get(piece);
    }
}
