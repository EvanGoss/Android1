package com.example.eg.activities;

public class Sport {
    private int id = 1, units = 3;
    private String name = "Baseball 101",
            description = "Players on the batting team take turns hitting against the pitcher of the fielding team, which tries to prevent runs by getting hitters out in any of several ways. A player on the batting team who reaches a base safely can later attempt to advance to subsequent bases during teammates' turns batting, such as on a hit or by other means. The teams switch between batting and fielding whenever the fielding team records three outs. One turn batting for both teams, beginning with the visiting team, constitutes an inning. A game is composed of nine innings, and the team with the greater number of runs at the end of the game wins. Baseball has no game clock, although almost all games end in the ninth inning.";

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUnits() {
        return units;
    }

}
