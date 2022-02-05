package com.example.java_design_ex.strategeypattern;

public class PlayerModel {
    private PlayStrategy strategy;

    public PlayerModel(PlayStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeSt(PlayStrategy strategy){
        this.strategy = strategy;
    }

    public void goPlay(){
        strategy.play();
    }
}
