package com.connectfour;

import java.util.Scanner;

public class PlayerScanner implements Scannable{
    Scanner scanner;
    public PlayerScanner(Scanner scanner){
        this.scanner = scanner;
    }

    public int getColumn(){
        return scanner.nextInt();
    }
}
