package com.example.java_design_ex.strategeypattern;

public class LambdaStrategy {
    public enum Strategy implements PlayStrategy {
        FWPlayer(()-> System.out.println("make a goal!!")),
        MFPlayer(()-> System.out.println("take a pass!!")),
        DFPlayer(()-> System.out.println("prepare other player"));

        private final PlayStrategy strategy;
        Strategy(PlayStrategy strategy) {
            this.strategy = strategy;
        }
        @Override
        public void play(){
            strategy.play();
        }
    }
}
