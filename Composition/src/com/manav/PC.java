package com.manav;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawlogo();
    }

    private void drawlogo(){
        //Fancy Graphics
        monitor.drawPixelAt(1200, 50, "Yellow");
    }
}