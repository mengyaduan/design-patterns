package com.fatorymethod.referee;

/**
 * @author yameng.dym
 */
public class BasketballReferee extends Referee {
    @Override
    public Scoreboard createScoreBoard() {
        return new BasketballScoreboard();
    }
}
