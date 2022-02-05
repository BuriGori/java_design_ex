package com.example.java_design_ex.proxypattern;

import lombok.extern.slf4j.Slf4j;

import static java.lang.Thread.sleep;

@Slf4j
public class KoreaUAV implements StealthUAV{

    public KoreaUAV() throws InterruptedException {
        log.info("KoreaUAV GPS setting ... 5 second");
        sleep(5000);
        log.info("done");
    }

    @Override
    public void attack() {
        log.info("KoreaUAV attack!!!");
    }

    @Override
    public void checkGPS() {
        log.info("KoreaUAV GPS sending");
    }
}
