package edu.functional.programming.design.pattern.stratergy;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StockFilter {
    /*public static List<Stock> filterByCompny(List<Stock> stockList, String cmpny) {
        List<Stock> filterStock = stockList.stream()
                .filter(stock -> stock.getName().equals(cmpny))
                .collect(Collectors.toList());
        return filterStock;
    }

    public static List<Stock> filterByPriceAbove(List<Stock> stockList, double price) {
        List<Stock> filterStockList = stockList.stream()
                .filter(stock -> stock.getPrice() > price)
                .collect(Collectors.toList());
        return filterStockList;
    }*/

    public static List<Stock> filter(List<Stock> stockList, Predicate<Stock> p) {
        List<Stock> fiterStockList = stockList.stream()
                .filter(stock -> p.test(stock))
                .collect(Collectors.toList());
        return fiterStockList;
    }
}
