package com.manav;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
        for(String s : stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket manavBasket = new Basket("Manav");
        sellItem(manavBasket, "Car", 1);
        System.out.println(manavBasket);

        sellItem(manavBasket, "Car", 1);
        System.out.println(manavBasket);

        if(sellItem(manavBasket, "Car", 1) != 1){
            System.out.println("There are no more cars in stock");
        }

        sellItem(manavBasket, "spanner", 5);
        System.out.println(manavBasket);

        sellItem(manavBasket, "Juice", 4);
        sellItem(manavBasket, "Cup", 12);
        sellItem(manavBasket, "Bread", 1);
        System.out.println(manavBasket);

        System.out.println(stockList);
//        temp = new StockItem("Pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("Car").adjustStock(2000);
        stockList.get("Car").adjustStock(-1000);
        System.out.println(stockList);

        for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quantity){
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}