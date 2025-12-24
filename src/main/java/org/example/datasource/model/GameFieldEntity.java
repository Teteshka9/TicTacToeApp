package org.example.datasource.model;

import java.util.UUID;

public class GameFieldEntity {
    private final int[][] field;
    private final int size;


    public GameFieldEntity(int size) {
        this.size = size;
        this.field = new int[size][size];
    }

    public int[][] getField() {
        return field;
    }

    public int getSize() {
        return size;
    }
}
