package com.connectfour;

import java.util.Scanner;

public class PlayerScanner implements Scannable{
    Scanner scanner;
    public PlayerScanner(Scanner scanner){
        this.scanner = scanner;
    }

    public int getColumn(){
        int col;
       try{
           col = scanner.nextInt();

       }catch(Exception e){
           String garbage = scanner.next();
            col = 0;
       }

       return col;
    }
}
