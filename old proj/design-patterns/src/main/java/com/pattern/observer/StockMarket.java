package com.pattern.observer;

import java.util.ArrayList;

/**
 * Created by sandesh on 22/02/22
 */
public class StockMarket implements Publisher{

  private ArrayList<Subscriber> subscribers;
  private double googlePrice;
  private double applePrice;
  private double nvidiaPrice;

  public StockMarket(){
    subscribers = new ArrayList<>();
  }

  @Override
  public void register(Subscriber newSubscriber) {
    subscribers.add(newSubscriber);
  }

  @Override
  public void unregister(Subscriber deleteSubscriber) {
    int removeIndex = subscribers.indexOf(deleteSubscriber)+1;
    System.out.println("Removing subscriber index: " + removeIndex);
    subscribers.remove(deleteSubscriber);
  }

  @Override
  public void notifySubscriber() {
    for(Subscriber subscriber : subscribers)
      subscriber.update(googlePrice, applePrice, nvidiaPrice);
  }

  public void setGooglePrice(double googlePrice) {
    this.googlePrice = googlePrice;
    notifySubscriber();
  }

  public void setApplePrice(double applePrice) {
    this.applePrice = applePrice;
    notifySubscriber();
  }

  public void setNvidiaPrice(double nvidiaPrice) {
    this.nvidiaPrice = nvidiaPrice;
    notifySubscriber();
  }
}
