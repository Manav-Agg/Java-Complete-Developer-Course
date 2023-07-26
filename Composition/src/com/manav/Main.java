package com.manav;

public class Main {

    public static void main(String[] args) {
        Dimentions dimentions = new Dimentions(20, 20, 5);
        Case theCase = new Case("220B", "HP", "240", dimentions);
        Monitor theMonitor = new Monitor("27 inch Beast", "HP", 27, new Resolution(2550, 1440));
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "HP", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
        thePC.powerUp();

//        Create a single room of a house using composition.
//        Think about the things that should be included in the room.
//        Maybe physical parts of the house but furniture as well.
//        Add at least one method to access an object via a getter and
//        then that objects public method as you saw in the previous video
//        then add at least one method to hide the object e.g. not using the getter
//        but to access the object used in composition within the main class.

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Manav", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
