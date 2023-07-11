package com.creational_patterns.fatorymethod.referee;

/**
 * @author yameng.dym
 */
public class BasketballReferee extends Referee {
    @Override
    public Scoreboard createScoreBoard() {
        return new BasketballScoreboard();
    }
}
