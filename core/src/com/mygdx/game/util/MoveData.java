package com.mygdx.game.util;

public class MoveData {
    String player;
    int x;
    int y;

    public MoveData(String player, int x, int y) {
        this.player = player;
        this.x = x;
        this.y = y;
    }

    public String getPlayer() {
        return player;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
