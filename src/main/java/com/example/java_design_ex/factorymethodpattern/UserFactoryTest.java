package com.example.java_design_ex.factorymethodpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFectory = new UserFactory();
        UserGrade someOne = userFectory.makeUser("C");
        someOne.show();
        someOne.event();
        log.info("------level up-------");
        someOne = userFectory.makeUser("B");
        someOne.show();
        someOne.event();
        log.info("------level up-------");
        someOne = userFectory.makeUser("A");
        someOne.show();
        someOne.event();
    }
}
