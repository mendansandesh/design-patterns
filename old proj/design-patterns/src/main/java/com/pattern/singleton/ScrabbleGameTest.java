package com.pattern.singleton;

import java.util.LinkedList;

/**
 * Created by sandesh on 03/03/22
 */
public class ScrabbleGameTest {
  public static void main(String[] args){
    ScrabbleGame instanceOne = ScrabbleGame.getInstance();
    System.out.println("Instance 1 ID: " + System.identityHashCode(instanceOne));
    System.out.println(instanceOne.getLetterList());
    LinkedList<String> playerOneTiles = instanceOne.getTiles(3);
    System.out.println("Player1 tiles: " + playerOneTiles);
    System.out.println(instanceOne.getLetterList());

    ScrabbleGame instanceTwo = ScrabbleGame.getInstance();
    System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
    LinkedList<String> playerTwoTiles = instanceTwo.getTiles(3);
    System.out.println("Player2 tiles: " + playerTwoTiles);
    System.out.println(instanceOne.getLetterList());

  }
}
