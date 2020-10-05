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
                String rowName = String.valueOf( (char) ('A'+ j)) +""+((SIZE)-i);
                System.out.print(rowName + " ");
                board[i][j] = new Square(i, j, this, rowName);
            }
            System.out.println();
        }
        System.out.println("Board created...");
    }

    public List<Square> getPossibleMoves(String piece, String location) {
        System.out.println("Finding Possible moves for ("+ piece + "," + location+")");
        Piece piece1 = PieceFactory.getPiece(piece);

        // Find 'Pawn D5' move's actual 2D array location.
        Square currentPos = resolveSquare(location);

        piece1.setSquare(board[currentPos.getRow()][currentPos.getColumn()]);
        piece1.getSquare().setPiece(piece1);
        List<Square> squares = piece1.generatePossibleMoves();
        return squares;
    }

    public Square getSquare(int row, int column) {
        if ((row >= 0 && column >= 0) && (row < SIZE && column < SIZE)) {
            return board[row][column];
        }
        return null;
    }

    public Square resolveSquare(String squareName) {
        Optional<Square> squareOpt = Stream.of(board)
                .flatMap(row -> Stream.of(row))
                .filter(e -> e.getRowName().equals(squareName)).findAny();
        return squareOpt.get();
    }
}
