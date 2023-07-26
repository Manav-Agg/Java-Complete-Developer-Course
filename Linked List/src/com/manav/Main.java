package com.manav;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Manav", 100.99);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(50.99);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        System.out.println("Index   Element");
        for(int i = 0; i < intList.size(); i++){
            System.out.println("  " + i + ":      " + intList.get(i));
        }

        intList.add(1, 2);
        for(int i = 0; i < intList.size(); i++){
            System.out.println("  " + i + ":      " + intList.get(i));
        }
    }
}
