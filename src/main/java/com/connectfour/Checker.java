package com.connectfour;

// TODO: Add way to track winner

public interface Checker {

   boolean isGameOver(Boardable board);
   boolean isTie();
   void setTie(Boolean bool);
}
