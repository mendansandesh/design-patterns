package com.pattern.abstractfactory;


/**
 * Created by sandesh on 23/02/22
 */
public abstract class EnemyShipBuilding {
  protected abstract EnemyShip makeEnemyShip(String shipType);

  public EnemyShip orderShip(String shipType){
    EnemyShip enemyShip = makeEnemyShip(shipType);
    enemyShip.makeShip();
    enemyShip.displayEnemyShip();
    enemyShip.followHeroShip();
    enemyShip.enemyShipShoots();

    return enemyShip;
  }
}
