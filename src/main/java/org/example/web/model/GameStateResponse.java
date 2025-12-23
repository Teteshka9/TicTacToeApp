package org.example.web.model;

import java.util.UUID;

public class GameStateResponse {
    private UUID gameId;
    private int[][] field;
    private String status;

    public GameStateResponse(){}

    public UUID getGameId() {
        return gameId;
    }

    public void setGameId(UUID gameId) {
        this.gameId = gameId;
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int[][] field) {
        this.field = field;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
