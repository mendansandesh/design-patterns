package com.pattern.abstractfactory;

/**
 * Created by sandesh on 23/02/22
 */
public class BigUFOEnemyShip extends EnemyShip{
  EnemyShipFactory enemyShipFactory;
  public BigUFOEnemyShip(EnemyShipFactory enemyShipFactory){
    this.enemyShipFactory = enemyShipFactory;
  }
  @Override
  void makeShip() {
    System.out.println("Making enemy ship " + getName());
    weapon = enemyShipFactory.addESGun();
    engine = enemyShipFactory.addESEngine();
  }
  public void followHeroShip(){
    System.out.println(getName() + " is following the Hero");
  }

  public void displayEnemyShip(){
    System.out.println(getName() + " is on the screen");
  }

  public void enemyShipShoots(){
    System.out.println("Name is : " + getName() + ", with engine: " + engine + " and attacks: " + weapon);
  }
}
