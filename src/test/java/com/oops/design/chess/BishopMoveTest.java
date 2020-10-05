package com.oops.design.chess;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class BishopMoveTest {

    @Test
    public void validateBishopMove() {
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves("Bishop", "D5");
        assertEquals(13, possibleMoves.size());
        List<String> moveSquares = possibleMoves.stream().map(e -> e.getRowName()).collect(Collectors.toList());
        List<String> inputSquares = Arrays.asList("E4", "F3", "G2", "H1", "C6", "B7", "A8", "E6", "F7", "G8", "C4", "B3", "A2");
        assertTrue(moveSquares.containsAll(inputSquares));

    }

}
