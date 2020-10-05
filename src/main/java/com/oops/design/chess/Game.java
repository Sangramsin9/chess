package com.oops.design.chess;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Sangramsing
 */
public class Game {

    public static void main(String[] args) {
        char a;
        do {
            getPossibleMoves(args);
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to continue (Y/N) ?");
            a = sc.next().charAt(0);
         } while ( a == 'Y' || a == 'y' );
    }



    private static void getPossibleMoves(String[] commandLineArgs) {
        boolean displayBoard = false;
        if (commandLineArgs.length> 0 && commandLineArgs[0]!= null && commandLineArgs[0].equals("--displayBoard")){
            displayBoard = true;
        }
        Board board = new Board(displayBoard);
        System.out.println("Enter Piece type (Pawn, Rook, Horse, Bishop, Queen, King) and current position e.g. 'Pawn D5' :");
        Scanner sc = new Scanner(System.in);
        String pieceMove = sc.nextLine();
        String[] pieceMoveArr = pieceMove.split(" ");

        List<Square> possibleMoves = board.getPossibleMoves(pieceMoveArr[0], pieceMoveArr[1]);
        List<String> moves = possibleMoves.stream().map(e -> e.getRowName()).collect(Collectors.toList());
        //possibleMoves.forEach(e-> System.out.println( e.getRowName() +" ["+ e.getRow() + ","+ e.getColumn()+"]"));
        System.out.println("Possible Moves : "+moves);
    }

}
