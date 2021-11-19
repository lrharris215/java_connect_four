package com.connectfour;

public interface Checker {

   boolean isGameOver(Boardable board);
   boolean isTie();
   void setTie(Boolean bool);
}
