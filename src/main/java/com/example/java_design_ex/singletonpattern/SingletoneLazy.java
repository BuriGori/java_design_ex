package com.example.java_design_ex.singletonpattern;

public class SingletoneLazy {
    private static SingletoneLazy instance;

    private SingletoneLazy(){}

    public static SingletoneLazy getInstance(){
        if(instance == null){
            instance = new SingletoneLazy();
        }
        return instance;
    }
}
