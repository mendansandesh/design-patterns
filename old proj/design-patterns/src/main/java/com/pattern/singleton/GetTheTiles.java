package com.pattern.singleton;

import java.util.LinkedList;

/**
 * Created by sandesh on 03/03/22
 */
public class GetTheTiles implements Runnable{

  @Override
  public void run() {
    ScrabbleGame instanceOne = ScrabbleGame.getInstance();
    System.out.println("Instance 1 ID: " + System.identityHashCode(instanceOne));
    System.out.println(instanceOne.getLetterList());
    LinkedList<String> playerOneTiles = instanceOne.getTiles(3);
    System.out.println("Player1 tiles: " + playerOneTiles);
  }
}
