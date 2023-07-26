package com.manav;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Manav";
//        player.health = 20;
//        player.weapon = "Mind";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Manav", 200, "Mind");
        System.out.println("Initial Health is " + player.getHealth());
    }
}
