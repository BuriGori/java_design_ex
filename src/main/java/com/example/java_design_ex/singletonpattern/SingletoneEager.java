package com.example.java_design_ex.singletonpattern;

public class SingletoneEager {
    private static final SingletoneEager instance = new SingletoneEager();

    private SingletoneEager(){}

    public static SingletoneEager getInstance() {
        return instance;
    }
}
