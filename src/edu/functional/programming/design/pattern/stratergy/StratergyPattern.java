package edu.functional.programming.design.pattern.stratergy;

import java.util.ArrayList;
import java.util.List;

public class StratergyPattern {
    public static void main(String[] args) {
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("AMZ",5.2,14.0));
        stockList.add(new Stock("GGL",0.2,16.0));
        stockList.add(new Stock("APL",100.1,40.0));
        stockList.add(new Stock("1PLS",3343.0,19.0));
        stockList.add(new Stock("VIVO",34.2,18.0));
        stockList.add(new Stock("APL",34.2,50.0));
        stockList.add(new Stock("AMZ",34340.2,100.0));

        /*List<Stock> filterByCompny = StockFilter.filterByCompny(stockList, "AMZ");
        System.out.println(filterByCompny);
        System.out.println("----------------------");

        List<Stock> filterByPriceAbove = StockFilter.filterByPriceAbove(stockList, 100.0);
        System.out.println(filterByPriceAbove);*/

        List<Stock> filterByCmpny = StockFilter.filter(stockList, stock -> stock.getName().equals("APL"));
        System.out.println(filterByCmpny);

        List<Stock> filterByPriceAbove = StockFilter.filter(stockList, stock -> stock.getPrice()>10);
        System.out.println(filterByPriceAbove);

    }
}
