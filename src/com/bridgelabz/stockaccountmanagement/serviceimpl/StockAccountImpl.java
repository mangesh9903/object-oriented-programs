package com.bridgelabz.stockaccountmanagement.serviceimpl;

import com.bridgelabz.stockaccountmanagement.model.Stock;
import com.bridgelabz.stockaccountmanagement.service.StockAccount;

import java.util.List;
import java.util.Scanner;

public class StockAccountImpl implements StockAccount {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addStock(List<Stock> stockList) {
        Stock stock = new Stock();
        System.out.println("Enter the Stock Name: ");
        stock.setStockName(scanner.next());
        System.out.println("Enter the Price Of Stock Share: ");
        stock.setPrice(scanner.nextInt());
        System.out.println("Enter the Number Of Share: ");
        stock.setNumberOfShare(scanner.nextInt());

        stockList.add(stock);
    }

    @Override
    public void deleteStock(List<Stock> stockList) {
        System.out.println("Enter the Stock Name that you want to delete.");
        String stockName = scanner.next();
        for (int index = 0; index < stockList.size(); index++) {
            if (stockList.get(index).getStockName().equals(stockName)) {
                stockList.remove(index);
            }
        }
    }

}
