package com.example.java_design_ex.observerpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlayerCoach implements ObserverInf{

    @Override
    public void update(Playertype playertype) {
      log.info("Coach thinks new training for {}, stats up to {}"
              ,playertype.getPosition()
              ,playertype.getStats()+10);
    }
}
