package com.creational_patterns.fatorymethod.referee;

/**
 * @author yameng.dym
 */
public class TableTennisScoreboard implements Scoreboard {

    @Override
    public void showTotalScore() {
        System.out.println("total score: 11");
    }

    @Override
    public void addForWin() {
        System.out.println("add 1");
    }
}
