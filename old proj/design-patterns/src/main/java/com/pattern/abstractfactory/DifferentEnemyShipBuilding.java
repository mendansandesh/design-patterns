package com.pattern.abstractfactory;

/**
 * Created by sandesh on 23/02/22
 */
public class DifferentEnemyShipBuilding extends EnemyShipBuilding{
  @Override
  protected EnemyShip makeEnemyShip(String shipType) {
    EnemyShip enemyShip = null;
    if(shipType.equals("UFO")){
      EnemyShipFactory enemyShipPartsFactory = new UFOEnemyShipFactory();
      enemyShip = new UFOEnemyShip(enemyShipPartsFactory);
      enemyShip.setName("UFO Ship");
    }else if(shipType.equals("Big UFO")){
      EnemyShipFactory enemyShipFactory = new BigUFOEnemyShipFactory();
      enemyShip = new BigUFOEnemyShip(enemyShipFactory);
      enemyShip.setName("Big UFO Ship");
    }
    return enemyShip;
  }
}
