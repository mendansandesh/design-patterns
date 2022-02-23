package com.pattern.abstractfactory;

/**
 * Created by sandesh on 23/02/22
 */
public abstract class EnemyShip {
  private String name;
  ESWeapon weapon;
  ESEngine engine;
  abstract void makeShip();
  abstract void followHeroShip();
  abstract void displayEnemyShip();
  abstract void enemyShipShoots();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString(){
    return "The " + name + " has top speed of " + engine + " and attack power " + weapon;
  }
}
