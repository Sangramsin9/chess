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
public class KingTest {

    @Test
    public void validateQueenMove() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("King", "D5");
        assertEquals(8, possibleMoves.size());
        List<String> moveSquares = possibleMoves.stream().map(e -> e.getRowName()).collect(Collectors.toList());
        assertTrue(moveSquares.containsAll(Arrays.asList("D4", "D6", "E5", "C5", "E4", "C4", "C6", "E6")));
    }

}
