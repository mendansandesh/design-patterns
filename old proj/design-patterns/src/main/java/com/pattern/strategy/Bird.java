package com.pattern.strategy;

/**
 * Created by sandesh on 22/02/22
 */
public class Bird extends Animal{
  public Bird(){
    super();
    setSound("tweet");
    flyType = new CanFly();
  }
}
