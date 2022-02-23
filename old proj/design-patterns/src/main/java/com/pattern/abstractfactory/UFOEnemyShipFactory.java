package com.pattern.abstractfactory;

/**
 * Created by sandesh on 23/02/22
 */
public class UFOEnemyShipFactory implements EnemyShipFactory{
  @Override
  public ESWeapon addESGun() {
    return new ESUFOGun();
  }

  @Override
  public ESEngine addESEngine() {
    return new ESUFOEngine();
  }
}
