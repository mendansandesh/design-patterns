package com.pattern.strategy;

/**
 * Created by sandesh on 22/02/22
 */
public class Animal {
  private String name;
  private String sound;
  public Fly flyType;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public String tryToFly(){
    return flyType.fly();
  }

  public void setFlyType(Fly flyType){
    this.flyType = flyType;
  }

}
