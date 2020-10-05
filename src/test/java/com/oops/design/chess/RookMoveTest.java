package com.oops.design.chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RookMoveTest {

    @Test
    public void validateRookMove() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("Rook", "G6");
        assertEquals(14, possibleMoves.size());
        List<String> moveSquares = possibleMoves.stream().map(e -> e.getRowName()).collect(Collectors.toList());
        List<String> inputSquares = Arrays.asList("G3", "G2", "G1", "G5", "G6", "G7", "G8", "H4", "F4", "E4", "D4", "C4", "B4", "A4");
        assertTrue(moveSquares.containsAll(inputSquares));
    }

}
