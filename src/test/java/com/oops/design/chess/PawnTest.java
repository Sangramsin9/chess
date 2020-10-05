package com.oops.design.chess;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class PawnTest {

    @Test
    public void validatePawnMoveStartPosition() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("Pawn", "B2");
        assertEquals(2,possibleMoves.size());
        assertTrue(possibleMoves.stream().anyMatch(e -> e.getRowName().equals("B3")));
        assertTrue(possibleMoves.stream().anyMatch(e -> e.getRowName().equals("B4")));
    }

    @Test
    public void validatePawnMove() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("Pawn", "B5");
        assertEquals(1,possibleMoves.size());
        assertTrue(possibleMoves.stream().anyMatch(e -> e.getRowName().equals("B6")));
    }

    @Test
    public void validatePawnMoveLastMove() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("Pawn", "B8");
        assertTrue(possibleMoves.isEmpty());
    }
}
