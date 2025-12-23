package org.example.domain.service;


import org.example.domain.model.GameSession;
import org.example.domain.repository.GameRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameServiceUsage implements GameService {
    private final GameRepository gameRepository;

    public GameServiceUsage(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public int[] getNextMove(GameSession gameSession) {
        int[][] field = gameSession.getField().getField();
        int size = field.length;

        int[] winningMove = findWinningMove(field, 2);
        if (winningMove != null) {
            System.out.println("Opponent finds a win: " + Arrays.toString(winningMove));
            return winningMove;
        }

        int[] blockingMove = findWinnigMove(field, 1);
        if (blockingMove != null) {
            System.out.println("Opponent blocks: " + Arrays.toString(blockingMove));
            return blockingMove;
        }

        List<int[]> availableMoves = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (field[i][j] == 0) {
                    availableMoves.add(new int[]{i, j});
                }
            }
        }
        if (!availableMoves.isEmpty()) {
            Random random = new Random();
            int[] randomMove = availableMoves.get(random.nextInt(availableMoves.size()));
            System.out.println("it is random: " + Arrays.toString(randomMove));
            return randomMove;
        }
        return new int[]{-1, -1};
    }

    private int[] findWinningMove(int[][] field, int player) {
        int size = field.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (field[i][j] == 0) {
                    field[i][j] = player;
                    boolean isWin = checkWin(field, player);
                    field[i][j] = 0;

                    if (isWin) {
                        return new int[i][j];
                    }
                }
            }
        }
        return null;
    }
}

