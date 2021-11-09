package com.connectfour;

public class Presenter {
    public static void printBoard(Board board){
        Discable disc;
        for(int i = 0; i < board.grid.length; i++){
            for(int j = 0; j < board.grid[0].length; j++){
                disc = board.grid[i][j];
                System.out.print("| ");
                printDisc(disc);
                System.out.print(" |");
            }
            System.out.print("\n");
        }
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
    }

    public static void printDisc(Discable disc){
        System.out.print(disc.getSymbol());
    }


}
