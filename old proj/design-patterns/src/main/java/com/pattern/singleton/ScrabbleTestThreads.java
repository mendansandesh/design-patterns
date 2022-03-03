package com.pattern.singleton;

/**
 * Created by sandesh on 03/03/22
 */
public class ScrabbleTestThreads {
  public static void main(String[] args){
    Runnable getTiles1 = new GetTheTiles();
    Runnable getTiles2 = new GetTheTiles();

    new Thread(getTiles1).start();
    new Thread(getTiles2).start();
  }
}
