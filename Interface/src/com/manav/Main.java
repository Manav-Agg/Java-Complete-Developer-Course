package com.manav;

public class Main {

    public static void main(String[] args) {
	    ITelephone manavPhone;
        manavPhone = new DeskPhone(12345);
        manavPhone.powerOn();
        manavPhone.callPhone(12345);
        manavPhone.answer();

        manavPhone = new MobilePhone(54321);
        manavPhone.powerOn();
        manavPhone.callPhone(54321);
        manavPhone.answer();
    }
}
