package com.manav;

import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 30;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true){
            System.out.println("It is not an alien!!!");
        }

        int topScore = 100;
        if (topScore != 100){
            System.out.println("You got the high score!!!");
        }
        if (topScore > 100){
            System.out.println("You got the high score!!!");
        }
        if (topScore >= 100){
            System.out.println("You got the high score!!!");
        }
        if (topScore <= 100){
            System.out.println("You got the high score!!!");
        }

        topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!!!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("One of these tests are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        System.out.println("-----------------------------------------");

        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder is " + theRemainder);
        if (theRemainder <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
