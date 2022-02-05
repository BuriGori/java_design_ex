package com.example.java_design_ex.observerpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlayerFan implements ObserverInf{

    @Override
    public void update(Playertype playertype) {
        log.info("that {} player can grow stats to {}",
                playertype.getPosition(),
                playertype.getStats()+50);
    }
}
