package org.example.datasource.repository;

import org.example.datasource.mapper.GameMapper;
import org.example.datasource.model.GameSessionEntity;
import org.example.domain.model.GameSession;
import org.example.domain.repository.GameRepository;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;


public class GameRepositoryUsage implements GameRepository {
    private final Map<UUID, GameSessionEntity> storage = new ConcurrentHashMap<>();

    @Override
    public void save(GameSession gameSession) {
        System.out.println("~~~ Save GAME ~~~");
        System.out.println("Save GAME with ID: " + gameSession.getId());

        GameSessionEntity entity =
    }
}
