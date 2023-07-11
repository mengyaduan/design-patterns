package com.creational_patterns.fatorymethod.referee;

/**
 * @author yameng.dym
 */
public class TableTennisReferee extends Referee {

    @Override
    public Scoreboard createScoreBoard() {
        return new TableTennisScoreboard();
    }
}
