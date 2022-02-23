package com.pattern.abstractfactory;

/**
 * Created by sandesh on 23/02/22
 */
public interface EnemyShipFactory {
  public ESWeapon addESGun();
  public ESEngine addESEngine();
}
