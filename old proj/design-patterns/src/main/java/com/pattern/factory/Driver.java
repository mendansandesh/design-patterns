package com.pattern.factory;

import java.util.Scanner;

/**
 * Created by sandesh on 23/02/22
 */
public class Driver {
  public static void main(String[] args){
    EnemyShipFactory shipFactory = new EnemyShipFactory();
    EnemyShip enemyShip = null;
    Scanner input = new Scanner(System.in);
    System.out.println("What type of Ship? U/R/B: ");
    if(input.hasNextLine()){
      String typeOfShip = input.nextLine();
      enemyShip = shipFactory.makeEnemyShip(typeOfShip);
    }
    if(enemyShip != null)
      doEnemyStuff(enemyShip);
    else
      System.out.println("Enter U or R or B");
  }

  private static void doEnemyStuff(EnemyShip enemyShip) {
    enemyShip.followHeroShip();
    enemyShip.displayEnemyShip();
    enemyShip.enemyShipShoots();
  }
}
