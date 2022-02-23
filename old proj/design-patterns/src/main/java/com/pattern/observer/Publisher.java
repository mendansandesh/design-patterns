package com.pattern.observer;

/**
 * Created by sandesh on 22/02/22
 */
public interface Publisher {
  public void register(Subscriber s);
  public void unregister(Subscriber s);
  public void notifySubscriber();
}
