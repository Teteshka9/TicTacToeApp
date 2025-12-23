package org.example.web.controller;

import org.example.domain.model.GameSession;
import org.example.domain.repository.GameRepository;
import org.example.domain.service.GameService;
import org.example.web.mapper.GameMapper;
import org.example.web.model.GameStateResponse;
import org.example.web.model.GameFieldRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/game")
public class GameController {
    private final GameService gameService;
    private final GameRepository gameRepository;

    public GameController(GameService gameService, GameRepository gameRepository) {
        this.gameService = gameService;
        this.gameRepository = gameRepository;
    }

    @PostMapping("/start")
    public GameStateResponse startGame(@RequestBody GameFieldRequest request) {
        System.out.println("~~~~ Creating NEW GAME ~~~~");
        System.out.println("Board size: " + request.getSize());

        GameSession newGame = new GameSession(request.getSize());
        System.out.println("Create NEW GAME with ID: " + newGame.getId());

        gameRepository.save(newGame);

        GameStateResponse response = GameMapper.toResponse(newGame);
        System.out.println("Send game with ID: " + response.getGameId());

        return response;
    }
}
