package com.example.java_design_ex.StrategeyPattern;

public class lambdaStrategy {
    public enum Strategy implements playStrategy{
        FWPlayer(()-> System.out.println("make a goal!!")),
        MFPlayer(()-> System.out.println("take a pass!!")),
        DFPlayer(()-> System.out.println("prepare other player"));

        private final playStrategy strategy;
        Strategy(playStrategy strategy) {
            this.strategy = strategy;
        }
        @Override
        public void play(){
            strategy.play();
        }
    }
}
