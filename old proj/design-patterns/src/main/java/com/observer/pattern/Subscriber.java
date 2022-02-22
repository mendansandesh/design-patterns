package com.observer.pattern;

/**
 * Created by sandesh on 22/02/22
 */
public interface Subscriber {
  public void update(double googlePrice, double applePrice, double nvidiaPrice);
}
