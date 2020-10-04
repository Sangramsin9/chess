package com.oops.design.chess;

import com.oops.design.chess.pieces.Piece;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Board {

    public static final int SIZE = 8;
    private Square[][] board;

    public Board() {
        init();
    }

    private void init() {
        board = new Square[SIZE][SIZE];
        for ( int i=0; i<SIZE; i++) {
            for ( int j=0; j<SIZE; j++) {
                board[i][j] = new Square(i, j, this);
            }
        }
        System.out.println("Board initialized...");
    }

    public List<Square> getPossibleMoves(String piece, String location) {
        //TODO
        System.out.println("Find Possible moves for ("+ piece + "," + location+")");
        return null;
    }

}
