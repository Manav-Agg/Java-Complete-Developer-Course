package com.manav;

public class Main {

    public static void main(String[] args) {
        FootballPlayer manav = new FootballPlayer("Manav");
        BaseballPlayer vashu = new BaseballPlayer("Vashu");
        SoccerPlayer yogi = new SoccerPlayer("Yogi");

        Team<FootballPlayer> delhi = new Team<>("Delhi");
        delhi.addPlayer(manav);
//        delhi.addPlayer(vashu);
//        delhi.addPlayer(yogi);

        System.out.println(delhi.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(vashu);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(yogi);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(delhi, 3 , 8);

        delhi.matchResult(fremantle, 2, 1);
//        delhi.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(delhi.getName() + ": " + delhi.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(delhi.compareTo(melbourne));
        System.out.println(delhi.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(delhi));
        System.out.println(melbourne.compareTo(fremantle));
    }
}