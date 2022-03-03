package com.pattern.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


/**
 * Created by sandesh on 03/03/22
 */
public class ScrabbleGame {
  private static ScrabbleGame firstInstance = null;
  String[] letters = {"a", "a", "g", "w", "p","x","y","z"};
  private LinkedList<String> list = new LinkedList<>(Arrays.asList(letters));
  static boolean firstThread = true; //just to create disaster scenario; so that other thread can create

  private ScrabbleGame(){}
  public static ScrabbleGame getInstance(){
    if(firstInstance == null){
      if(firstThread){
        firstThread = false;
        Thread.currentThread();
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      synchronized (ScrabbleGame.class){
        if(firstInstance == null){
          firstInstance = new ScrabbleGame();
          Collections.shuffle(firstInstance.list);
        }
      }
    }
    return firstInstance;
  }

  public LinkedList<String> getLetterList(){
    return firstInstance.list;
  }
  public LinkedList<String> getTiles(int howManyTiles){
    LinkedList<String> tilesToSend = new LinkedList<>();
    for(int i = 0; i < howManyTiles; i++)
      tilesToSend.add(firstInstance.list.remove(0));
    return tilesToSend;
  }
}
