package org.example.domain.service;

import org.example.domain.model.GameSession;

public interface GameService {
    int[] getNextMove(GameSession gameSession);
    boolean checkWin(int[][] field, int player);
    boolean isBoardFull(int[][] field);
    boolean isGameOver(GameSession gameSession);
}
