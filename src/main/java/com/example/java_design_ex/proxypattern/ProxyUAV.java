package com.example.java_design_ex.proxypattern;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
public class ProxyUAV implements StealthUAV{

    StealthUAV stealthUAV;

    @Override
    public void attack() throws InterruptedException {
        if(stealthUAV == null){
            stealthUAV = new KoreaUAV();
        }
        stealthUAV.attack();
    }

    @Override
    public void checkGPS() throws InterruptedException {
        if (stealthUAV == null){
            stealthUAV = new KoreaUAV();
        }
        log.info("check .. and");
        stealthUAV.checkGPS();
    }
}
