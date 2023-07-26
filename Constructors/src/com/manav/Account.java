package com.manav;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Account(){
        this("56789", 2.50, "Dafault name",
                "Default Address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String emailAddress, String phoneNumber){
        System.out.println("Account constructor with parameter called");
        setNumber(number);
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String emailAddress, String phoneNumber) {
        this("99999", 100.55, customerName, emailAddress, phoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " done. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount <   0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }
        else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}