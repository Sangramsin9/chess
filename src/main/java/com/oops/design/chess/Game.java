package com.oops.design.chess;

import java.util.List;
import java.util.Scanner;

/**
 * @author Sangramsing
 */
public class Game {

    public static void main(String[] args) {
        System.out.println("Enter Piece type and the current position e.g. 'Pawn D5' : ");
        Scanner sc = new Scanner(System.in);
        String pieceMove = sc.nextLine();
        String[] pieceMoveArr = pieceMove.split(" ");
        Board board = new Board();
        List<Square> possibleMoves = board.getPossibleMoves(pieceMoveArr[0], pieceMoveArr[1]);
        possibleMoves.forEach(e-> System.out.println( e.getRowName() +" ["+ e.getRow() + ","+ e.getColumn()+"]"));
    }

}
