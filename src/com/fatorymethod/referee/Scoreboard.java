package com.fatorymethod.referee;

/**
 * @author yameng.dym
 */
public interface Scoreboard {
    /**
     * 每局总共多少分
     */
    void showTotalScore();

    /**
     * 每次加多少分
     */
    void addForWin();
}
