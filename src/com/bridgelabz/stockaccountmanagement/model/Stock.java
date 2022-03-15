package com.bridgelabz.stockaccountmanagement.model;

public class Stock {

    private String stockName;
    private int price;
    private int numberOfShare;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", price=" + price +
                ", numberOfShare=" + numberOfShare +
                '}';
    }
}
