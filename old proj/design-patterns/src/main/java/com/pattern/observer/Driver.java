package com.pattern.observer;

/**
 * Created by sandesh on 22/02/22
 */
public class Driver {
  public static void main(String[] args){
    StockMarket nse = new StockMarket();
    StockPlatform zerodha = new StockPlatform(nse);

    nse.setGooglePrice(2123.43);
    nse.setApplePrice(6442.35);
    nse.setNvidiaPrice(246.97);
    /** ------------- */
    StockPlatform fundsIndia = new StockPlatform(nse);

    nse.setGooglePrice(2123.43);
    nse.setApplePrice(6442.35);
    nse.setNvidiaPrice(246.97);
    /** ------------- */
    nse.unregister(fundsIndia); //all updates will only notify the existing subscribers ie after this only zerodha will get update
    nse.setGooglePrice(2123.43);
    nse.setApplePrice(6442.35);
    nse.setNvidiaPrice(246.97);

    /** -----Thread implementation-------- */
    System.out.println("-----------------");
    Runnable getGoogle = new GetTheStock(nse, 2, "GOOGL", 2123.43);
    Runnable getApple = new GetTheStock(nse, 2, "AAPL", 2123.43);
    Runnable getNvidia = new GetTheStock(nse, 2, "NVDA", 2123.43);

    new Thread(getGoogle).start();
    new Thread(getApple).start();
    new Thread(getNvidia).start();
  }
}
