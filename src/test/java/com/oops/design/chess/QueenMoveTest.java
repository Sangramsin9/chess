package com.oops.design.chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Sangramsing
 */
public class QueenMoveTest {

    @Test
    public void validateQueenMove() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("Queen", "D4");
        assertEquals(27, possibleMoves.size());
        List<String> moveSquares = possibleMoves.stream().map(e -> e.getRowName()).collect(Collectors.toList());
        assertTrue(!moveSquares.contains("C2"));
        assertTrue(!moveSquares.contains("C1"));
        assertTrue(!moveSquares.contains("G8"));
        assertTrue(!moveSquares.contains("H2"));
        assertTrue(!moveSquares.contains("B8"));
        assertTrue(!moveSquares.contains("F7"));
    }

}
