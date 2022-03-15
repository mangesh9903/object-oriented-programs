package com.bridgelabz.stockaccountmanagement.controller;

import com.bridgelabz.stockaccountmanagement.model.Stock;
import com.bridgelabz.stockaccountmanagement.service.StockAccount;
import com.bridgelabz.stockaccountmanagement.serviceimpl.StockAccountImpl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockAccount stockAccount = new StockAccountImpl();
        List<Stock> stockList = new ArrayList<>();
        System.out.println("Welcome to Stock Account Management.");
        while (true) {
            System.out.println("========= Menu ============");
            System.out.println("1. Add Stock. ");
            System.out.println("2. Delete Stock. ");
            System.out.println("3. Exit Stock Account Management.");
            int ch = scanner.nextInt();
            try {
                switch (ch) {
                    case 1:
                        stockAccount.addStock(stockList);
                        for (Stock stock : stockList) {
                            System.out.println(stock);
                        }
                        break;
                    case 2:
                        for (Stock stock : stockList) {
                            System.out.println(stock);
                        }
                        stockAccount.deleteStock(stockList);
                        System.out.println("====== After Deletion ======");
                        for (Stock stock : stockList) {
                            System.out.println(stock);
                        }
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Input.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
