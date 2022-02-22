package com.strategy.pattern;

/**
 * Created by sandesh on 22/02/22
 */
public class Driver {
  public static void main(String[] args){
    Animal d = new Dog();
    Animal b = new Bird();
    System.out.println("Dog: " + d.tryToFly());
    System.out.println("Bird: " + b.tryToFly());

    d.setFlyType(new CanFly());
    System.out.println("Dog: " + d.tryToFly());
  }
}
