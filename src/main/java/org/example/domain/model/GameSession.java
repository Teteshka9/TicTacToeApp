package org.example.domain.model;

import java.util.UUID;

public class GameSession {
    private UUID id;
    private final GameField field;

    public GameSession(int fieldSize) {
        this.id = UUID.randomUUID();
        this.field = new GameField(fieldSize);
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public GameField getField() {
        return field;
    }
}
