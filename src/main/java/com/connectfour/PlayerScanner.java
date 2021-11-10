package com.connectfour;

import java.io.InputStream;
import java.util.Scanner;

public class PlayerScanner {
    Scanner scanner;
    public PlayerScanner(Scanner scanner){
        this.scanner = scanner;
    }

    public int getColumn(){
        return scanner.nextInt();
    }
}
