package org.example.datasource.mapper;

import org.example.domain.model.GameField;
import org.example.datasource.model.GameFieldEntity;
import org.example.domain.model.GameSession;
import org.example.datasource.model.GameSessionEntity;

public class GameMapper {
    public static GameSessionEntity toEntity(GameSession domainSession) {
         GameSessionEntity entity = new GameSessionEntity(domainSession.getId(),
                 domainSession.getField().getSize());

        System.out.println("Object identifier: " + entity.getId());

        GameField domainField = domainSession.getField();
        GameFieldEntity entityField = entity.getField();

        int[][] domainArray = domainField.getField();
        int[][] entityArray = entityField.getField();

        for (int i = 0; i < domainArray.length; i++) {
            System.arraycopy(domainArray[i], 0, entityArray[i], 0, domainArray[i].length);
        }
        return entity;
    }

    public static GameSession toDomain(GameSessionEntity entity) {
        if (entity == null) {
            return null;
        }

        GameSession domainSession = new GameSession(entity.getField().getSize());

        domainSession.setId(entity.getId());

        System.out.println("Domain ID: " + domainSession.getId());

        return domainSession;
    }
}
