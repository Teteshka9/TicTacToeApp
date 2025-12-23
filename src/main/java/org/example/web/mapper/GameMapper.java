package org.example.web.mapper;


import org.example.web.model.GameStateResponse;


public class GameMapper {
    public static GameStateResponse toResponse(GameSession gameSession) {
        GameStateResponse response = new GameStateResponse();
        response.setGameId(gameSession.getId());
        response.setField(gameSession.getField().getField());
        response.setStatus("Please wait, downloading...");

        return response;
    }
}
