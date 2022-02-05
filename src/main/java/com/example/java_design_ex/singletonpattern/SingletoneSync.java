package com.example.java_design_ex.singletonpattern;

public class SingletoneSync {
    private static SingletoneSync instance;

    private SingletoneSync(){}

    public static synchronized SingletoneSync getInstance(){
        if(instance == null){
            instance = new SingletoneSync();
        }
        return instance;
    }
}
