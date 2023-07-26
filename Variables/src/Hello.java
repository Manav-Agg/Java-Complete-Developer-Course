public class Hello {
    public static void main(String [] args){
        int myFirstNumber = 10;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myFirstNumber);

        myFirstNumber = 10 + 5;
        System.out.println(myFirstNumber);

        myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);
        System.out.println("myFirstNunmber");

        System.out.println(myTotal);

        myThirdNumber = myFirstNumber * 2;
        System.out.println(myThirdNumber);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
