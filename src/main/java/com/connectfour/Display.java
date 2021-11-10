package com.connectfour;

import java.io.PrintStream;

public class Display implements Displayable{

    PrintStream output;

    public Display(PrintStream output){
        this.output = output;
    }
    // for Strings
    public void print(String message){
        output.print(message);
    }
    public void println(String message){
        output.println(message);
    }
    // for chars
    public void print(char message){
        output.print(message);
    }
    public void println(char message){
        output.println(message);
    }



}
