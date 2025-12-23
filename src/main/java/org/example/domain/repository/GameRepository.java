package org.example.domain.repository;

import org.example.domain.model.GameSession;

import java.util.UUID;

public interface GameRepository {
    void save(GameSession gameSession);

    GameSession findById(UUID id);
}
