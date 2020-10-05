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
public class HorseMoveTest {

    @Test
    public void validateHorseMove() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("Horse", "E3");
        assertEquals(8, possibleMoves.size());
        List<String> moveSquares = possibleMoves.stream().map(e -> e.getRowName()).collect(Collectors.toList());
        List<String> inputSquares = Arrays.asList("D1", "F1", "D5", "F5", "G2", "G4", "C2", "C4");
        assertTrue(moveSquares.containsAll(inputSquares));
    }

}
