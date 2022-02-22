package com.observer.pattern;

import java.text.DecimalFormat;

/**
 * Created by sandesh on 22/02/22
 */
// Observer pattern using Threads
public class GetTheStock implements Runnable{
  private int startTime;
  private String stock;
  private double price;

  private Publisher stockMarket;

  public GetTheStock(Publisher stockMarket, int newStartTime, String newStock,  double newPrice){
    this.stockMarket = stockMarket;
    this.startTime = newStartTime;
    this.stock = newStock;
    this.price = newPrice;
  }

  @Override
  public void run() {
    for(int i = 1; i <= 20; i++){
      try{
        Thread.sleep(2000);
      }catch (InterruptedException e){}

      double randNum = (Math.random() * 0.06) - 0.03;

      DecimalFormat df = new DecimalFormat("#.##");

      price = Double.parseDouble(df.format(price + randNum));

      if(stock == "GOOGL") ((StockMarket)stockMarket).setGooglePrice(price);
      if(stock == "AAPL") ((StockMarket)stockMarket).setApplePrice(price);
      if(stock == "NVDA") ((StockMarket)stockMarket).setNvidiaPrice(price);

      System.out.println(stock + ": " + df.format(price + randNum) + " " + df.format(randNum) + "\n");
    }
  }
}
