package com.creational_patterns.fatorymethod.referee;

public abstract class Referee {

    public void show() {
        Scoreboard scoreboard = createScoreBoard();
        scoreboard.showTotalScore();
        scoreboard.addForWin();
    }

    /**
     * 获取记分牌和积分方式
     *
     * @return
     */
    public abstract Scoreboard createScoreBoard();
}
