package com.pattern.abstractfactory;

/**
 * Created by sandesh on 23/02/22
 */
public class Driver {
  public static void main(String[] args){
    EnemyShipBuilding someUFO = new DifferentEnemyShipBuilding();
    EnemyShip ufoShip = someUFO.orderShip("UFO");
    System.out.println("UFO done");

    EnemyShip bigUfoShip = someUFO.orderShip("Big UFO");
    System.out.println("Big UFO done");
  }
}
