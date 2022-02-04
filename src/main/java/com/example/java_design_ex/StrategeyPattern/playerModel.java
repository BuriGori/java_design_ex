package com.example.java_design_ex.StrategeyPattern;

public class playerModel {
    private playStrategy strategy;

    public playerModel(playStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeSt(playStrategy strategy){
        this.strategy = strategy;
    }

    public void goPlay(){
        strategy.play();
    }
}
