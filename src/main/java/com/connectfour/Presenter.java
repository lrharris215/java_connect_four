package com.connectfour;

public class Presenter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void printBoard(Displayable display, Boardable board){
        Discable disc;

        for(int i = 0; i < board.getGrid().length; i++){
            for(int j = 0; j < board.getRow(0).length; j++){
                disc = board.findDisc(i,j);
                display.print("| ");
                printDisc(display, disc);
                display.print(" |");
            }
            display.print("\n");
        }
        display.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        display.println("  1    2    3    4    5    6    7 ");
    }

    public static void printDisc(Displayable display, Discable disc){
        if(disc.getColor().equals("red")){
            display.print(ANSI_RED + disc.getSymbol() + ANSI_RESET);
        }else if (disc.getColor().equals("blue")){
            display.print(ANSI_BLUE + disc.getSymbol() + ANSI_RESET);
        }
        else {
            display.print(disc.getSymbol());
        }

    }

    public static void printError(Displayable display, String error){
        display.println(ANSI_RED + error + ANSI_RESET);
    }


}
