package com.example.java_design_ex.strategeypattern;

public class StrategyTest {
    public static void main(String[] args) {
        PlayerModel player = new PlayerModel(LambdaStrategy.Strategy.FWPlayer);
        player.goPlay();
        player.changeSt(LambdaStrategy.Strategy.MFPlayer);
        player.goPlay();
        player.changeSt(LambdaStrategy.Strategy.DFPlayer);
        player.goPlay();
    }
}
