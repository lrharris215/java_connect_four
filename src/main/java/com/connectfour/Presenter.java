package com.connectfour;

public class Presenter {
    public static void printBoard(Board board){
        Disc disc;
        for(int i = 0; i < board.grid.length; i++){
            for(int j = 0; j < board.grid[0].length; j++){
                disc = board.grid[i][j];
                System.out.print("| ");
                printDisc(disc);
                System.out.print(" |");
            }
            System.out.print("\n");
        }
        System.out.print("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    public static void printDisc(Disc disc){
        if (disc == null){
            return;
        }
        System.out.print(disc.symbol);
    }


}
