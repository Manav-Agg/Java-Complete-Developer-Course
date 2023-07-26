package com.manav;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();
    public static void main(String[] args) {
        /*Modify the program so that adding items to the shopping basket doesn't
        actually reduce the stock count but, instead, reserves the requested
        number of items.

        You will need to add a "reserved" field to the StockItem class to store the
        number of items reserved.

        Items can continue to be added to the basket, but it should not be possible to
        reserve more than the available stock of any item. An item's available stock
        is the stock count less the reserved amount.

        The stock count for each item is reduced when a basket is checked out, at which
        point all reserved items in the basket have their actual stock count reduced.

        Once checkout is complete, the contents of the basket are cleared.

        It should also be possible to "unreserve" items that were added to the basket
        by mistake.

        The program should prevent any attempt to unreserve more items than were
        reserved for a basket.

        Add code to Main that will unreserve items after they have been added to the basket,
        as well as unreserving items that have not been added to make sure that the code
        can cope with invalid requests like that.

        After checking out the baskets, display the full stock list and the contents of each
        basket that you created.*/

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
//        System.out.println(manavBasket);

        sellItem(manavBasket, "Juice", 4);
        sellItem(manavBasket, "Cup", 12);
        sellItem(manavBasket, "Bread", 1);
//        System.out.println(manavBasket);
//        System.out.println(stockList);

        Basket basket = new Basket("Customer");
        sellItem(basket, "Cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(manavBasket, "Car", 1);
        removeItem(manavBasket, "Cup", 9);
        removeItem(manavBasket, "Car", 1);
        System.out.println("Cars removed: " + removeItem(manavBasket, "Car", 1)); //should not remove any
        System.out.println(manavBasket);

//        remove all items from manavBasket
        removeItem(manavBasket, "Bread", 1);
        removeItem(manavBasket, "Cup", 3);
        removeItem(manavBasket, "Juice", 4);
        removeItem(manavBasket, "Cup", 3);
        System.out.println(manavBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

//        temp = new StockItem("Pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        StockItem car = stockList.Items().get("Car");
        if(car != null){
            car.adjustStock(2000);
        }
        if(car != null) {
            stockList.get("Car").adjustStock(-1000);
        }
        System.out.println(stockList);

//        for(Map.Entry<String, Double> price : stockList.PriceList().entrySet()){
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }
        checkOut(manavBasket);
        System.out.println(manavBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity){
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.reserveStock(item, quantity) != 0){
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(basket.removeFromBasket(stockItem, quantity) == quantity){
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}