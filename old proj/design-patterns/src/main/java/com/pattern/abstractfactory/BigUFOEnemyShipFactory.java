package com.pattern.abstractfactory;

/**
 * Created by sandesh on 23/02/22
 */
public class BigUFOEnemyShipFactory implements EnemyShipFactory{
  @Override
  public ESWeapon addESGun() {
    return new BigESUFOGun();
  }

  @Override
  public ESEngine addESEngine() {
    return new BigESUFOEngine();
  }
}
