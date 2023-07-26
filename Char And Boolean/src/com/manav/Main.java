package com.manav;

public class Main {

    public static void main(String[] args) {
	    char myChar = 'D';
	    //width of 16 (2 bytes)
	    char unicode = '\u00A9';
        System.out.println("Unicode output was: " + unicode);

        boolean myBoolean = false;
        boolean isMale = true;

        System.out.println("---------------------------------------------");
        char registeredSystem = '\u00AE';
        System.out.println("Unicode Output was: " + registeredSystem);
    }
}
