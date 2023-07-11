package com.creational_patterns.fatorymethod.referee;

/**
 * @author yameng.dym
 */
public class BasketballScoreboard implements Scoreboard {
    @Override
    public void showTotalScore() {
        System.out.println("no limit");
    }

    @Override
    public void addForWin() {
        System.out.println("add 2 or 3");
    }
}
