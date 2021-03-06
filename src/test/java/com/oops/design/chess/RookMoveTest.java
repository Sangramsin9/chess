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
public class RookMoveTest {

    @Test
    public void validateRookMove() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("Rook", "G6");
        assertEquals(14, possibleMoves.size());
        List<String> moveSquares = possibleMoves.stream().map(e -> e.getRowName()).collect(Collectors.toList());
        List<String> inputSquares = Arrays.asList("G5", "G4", "G3", "G2", "G1", "G7", "G8", "H6", "F6", "E6", "D6", "C6", "B6", "A6");
        assertTrue(moveSquares.containsAll(inputSquares));
    }

}
