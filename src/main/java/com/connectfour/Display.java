package com.connectfour;

import java.io.PrintStream;

public class Display implements Displayable{

    // for Strings
    public void print(String message){
        System.out.print(message);
    }
    public void println(String message){
        System.out.println(message);
    }
    // for chars
    public void print(char message){
        System.out.print(message);
    }
    public void println(char message){
        System.out.println(message);
    }



}
