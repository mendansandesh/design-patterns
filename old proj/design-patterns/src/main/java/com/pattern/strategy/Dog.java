package com.pattern.strategy;

/**
 * Created by sandesh on 22/02/22
 */
public class Dog extends Animal{

  public Dog(){
    super();
    setSound("Woof");
    flyType = new CannotFly();
  }

  public void digHole(){
    System.out.println("Digging a hole..");
  }

}
