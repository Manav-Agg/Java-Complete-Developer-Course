package com.manav;

public class Main {

    public static void main(String[] args) {
//        Account manavAccount = new Account("12345", 0.00, "Manav", "myemail@gmail.com", "1234567890");
        Account manavAccount = new Account();
        System.out.println(manavAccount.getNumber());
        System.out.println(manavAccount.getBalance());
//        manavAccount.setNumber("12345");
//        manavAccount.setBalance(0.00);
//        manavAccount.setCustomerName("Manav");
//        manavAccount.setEmailAddress("myemail@gmail.com");
//        manavAccount.setPhoneNumber("1234567890");
//        manavAccount.withdrawal(100.0);

        manavAccount.deposit(200.0);
        manavAccount.withdrawal(100.0);

        Account vashuAccount = new Account("Vashu", "vashu@gmail.com", "12345");
        System.out.println(vashuAccount.getNumber() + " name " + vashuAccount.getCustomerName());

        System.out.println("---------------------------------------------------");

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getname());

        VipPerson person2 = new VipPerson("Manav", 50000.00);
        System.out.println(person2.getname());

        VipPerson person3 = new VipPerson("Vashu", 25000.00, "vashu@gmail.com");
        System.out.println(person3.getname());
        System.out.println(person3.getEmailAddress());
    }
}

