package com.example.java_design_ex.singletonpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletoneTest {
    public static void main(String[] args) {
        var user1 = SingletoneHold.getInstance();
        var user2 = SingletoneHold.getInstance();

        log.info(user1.toString());
        log.info(user2.toString());
    }
}
