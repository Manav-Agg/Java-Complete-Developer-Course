package com.manav;

public class Main {

    public static void main(String[] args) {
//	    Your job is to create a simple banking application.
//      There should be a bank class
//      It should have an arraylist of branches
//      Each branch should have an arraylist of customers
//      The customer class should have an Arraylist of doubles (transactions)
//      Customer:
//      Name, and the Arraylist of doubles.
//      Branch:
//      Need to be able to add a new customer and initial transaction amount.
//      Also needs to add additional transactions for that customer/branch
//      Bank:
//      Add a new branch
//      Add a customer to that branch with initial transaction
//      Add a transaction for an existing customer for that branch
//      Show a list of customers for a particular branch and optically a list of their transaction
//      Demonstration autoboxing and unboxing in your code
//      Hint: Transactions
//      Add data validation.
//      e.g. check if exists, or does not exist, etc.
//      Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("Manav Private Bank Limited");
        if(bank.addBranch("Delhi")){
            System.out.println("Delhi Branch Created");
        }

        bank.addCustomer("Delhi", "Manav", 100);
        bank.addCustomer("Delhi", "Vashu", 10);
        bank.addCustomer("Delhi", "Yogi", 200);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Mike", 0);

        bank.addCustomerTransaction("Delhi", "Yogi", 50);
        bank.addCustomerTransaction("Delhi", "Yogi", 30);
        bank.addCustomerTransaction("Delhi", "Manav", 10);

        bank.listCustomers("Delhi", false);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Australia");
        if(!bank.addCustomer("Australia", "John", 10)){
            System.out.println("Error Australia branch does not exist");
        }

        if(!bank.addBranch("Delhi")){
            System.out.println("Delhi is already exist");

        }

        if(!bank.addCustomerTransaction("Delhi", "Sanjay", 60)){
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Delhi", "Manav", 1000)){
            System.out.println("Customer Manav already exist");
        }
    }
}