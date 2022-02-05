package com.example.java_design_ex.observerpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObserverTest {

    public static void main(String[] args) {
        PlayersTeam playersTeam = new PlayersTeam();
        PlayerFan playerFan = new PlayerFan();
        PlayerCoach playerCoach = new PlayerCoach();
        playersTeam.addOb(playerCoach);
        playersTeam.addOb(playerFan);

//        playersTeam.removePlayer("MF");
//        log.info("------------------");
//        playersTeam.removeOb(new PlayerFan());


        Playertype player1 = new Playertype("ST",88);
        Playertype player2 = new Playertype("MF",90);
        playersTeam.addPlayer(player1);
        playersTeam.addPlayer(player2);

        playersTeam.goPlay();
    }

}
