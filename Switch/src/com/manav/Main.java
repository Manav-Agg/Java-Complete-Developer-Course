package com.manav;

public class Main {

    public static void main(String[] args) {
        int value = 2;
        if (value == 1){
            System.out.println("Value was 1");
        }
        else if (value == 2){
            System.out.println("Value was 2");
        }
        else{
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");  break;
            case 2:
                System.out.println("Value was 2");  break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);   break;
            default:
                System.out.println("Was not 1, 2, 3, 4, 5 and 6");   break;
        }

        System.out.println("-----------------------------------------------------");

        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");  break;
            case 'B':
                System.out.println("B was found");  break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");   break;
            default:
                System.out.println("Could not found A, B, C, D or E");  break;
        }

        String month = "JANUARY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");  break;
            case "june":
                System.out.println("jun");  break;
            default:
                System.out.println("Not sure"); break;
        }
    }
}
