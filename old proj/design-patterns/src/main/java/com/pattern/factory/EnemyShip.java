package com.pattern.factory;

/**
 * Created by sandesh on 23/02/22
 */
public abstract class EnemyShip {
  private String name;
  private double amountDamage;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAmountDamage() {
    return amountDamage;
  }

  public void setAmountDamage(double amountDamage) {
    this.amountDamage = amountDamage;
  }

  public void followHeroShip(){
    System.out.println(getName() + " is following the Hero");
  }

  public void displayEnemyShip(){
    System.out.println(getName() + " is on the screen");
  }

  public void enemyShipShoots(){
    System.out.println(getName() + " attacks and gets damage points: " + getAmountDamage());
  }
}
