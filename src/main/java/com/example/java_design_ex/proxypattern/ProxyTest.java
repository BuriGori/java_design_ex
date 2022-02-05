package com.example.java_design_ex.proxypattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProxyTest {
    public static void main(String[] args) throws InterruptedException {
        ProxyUAV proxyUAV = new ProxyUAV();

        proxyUAV.attack();
        proxyUAV.attack();
        proxyUAV.checkGPS();
        log.info("--------------UsaUAV comming-------");
        UsaUAV usaUAV = new UsaUAV();
        proxyUAV.setStealthUAV(usaUAV);
        proxyUAV.attack();
        proxyUAV.attack();
        proxyUAV.attack();
        proxyUAV.checkGPS();
    }
}
