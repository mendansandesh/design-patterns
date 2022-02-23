package com.pattern.strategy;

/**
 * Created by sandesh on 22/02/22
 */
public interface Fly {
  String fly();
}

class CanFly implements Fly {
  @Override
  public String fly() {
    return "I am flying";
  }
}

class CannotFly implements Fly {
  @Override
  public String fly() {
    return "I can't fly";
  }
}
