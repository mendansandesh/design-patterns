package com.pattern.observer;

/**
 * Created by sandesh on 22/02/22
 */
public class StockPlatform implements Subscriber{
  private double googlePrice;
  private double applePrice;
  private double nvidiaPrice;
  private Publisher stockMarket;
  private int subscriberID;
  private static int subscriberIDtracker = 0;

  public StockPlatform(Publisher stockMarket){
    this.stockMarket = stockMarket;
    this.subscriberID = ++subscriberIDtracker;
    System.out.println("New Subscriber ID: " + this.subscriberID);
    stockMarket.register(this);
  }

  @Override
  public void update(double googlePrice, double applePrice, double nvidiaPrice) {
    this.googlePrice = googlePrice;
    this.applePrice = applePrice;
    this.nvidiaPrice = nvidiaPrice;

    printAllPrices();
  }

  public void printAllPrices(){
    System.out.println(subscriberID + "\nGoogle: " + googlePrice + "\nApple: " + applePrice + "\nNvidia: " + nvidiaPrice);
  }
}
