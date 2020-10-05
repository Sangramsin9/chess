package com.oops.design.chess;

import org.junit.Test;

/**
 * @author Sangramsing
 */
public class PieceTypeTest {

    @Test(expected = RuntimeException.class)
    public void validatePieceType() {
        Board board = new Board();
        board.getPossibleMoves("Knight", "B5");
    }

}
