package org.example.datasource.model;

import java.util.UUID;

public class GameSessionEntity {
    private final UUID id;
    private final GameFieldEntity field;

    public GameSessionEntity(UUID id, int fieldSize) {
        this.id = id;
        this.field = new GameFieldEntity(fieldSize);
    }

    public UUID getId() {
        return id;
    }

    public GameFieldEntity getField() {
        return field;
    }
}