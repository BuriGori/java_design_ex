package com.example.java_design_ex.proxypattern;

import lombok.extern.slf4j.Slf4j;

import static java.lang.Thread.sleep;

@Slf4j
public class UsaUAV implements StealthUAV{

    public UsaUAV() throws InterruptedException {
      log.info("UsaUAV GPS setting ...7 second");
      sleep(7000);
      log.info("done");
    }

    @Override
    public void attack() {
        log.info("UsaUAV attack!!!!!!!!");
    }

    @Override
    public void checkGPS() {
        log.info("UsaUAV GPS sending");
    }
}
