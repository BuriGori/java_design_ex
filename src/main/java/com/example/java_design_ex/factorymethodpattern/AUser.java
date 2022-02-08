package com.example.java_design_ex.factorymethodpattern;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class AUser implements UserGrade {
    @Override
    public void show() {
        log.info("My grade is A");
    }

    @Override
    public void event() {
        log.info("I can play Kukusaiten");
    }
}
