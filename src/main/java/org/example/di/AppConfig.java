package org.example.di;

import org.example.domain.repository.GameRepository;
import org.example.domain.service.GameService;
import org.example.domain.service.GameServiceUsage;
import org.example.datasource.repository.GameRepositoryUsage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GameRepository gameRepository() {
        return new GameRepositoryUsage();
    }

    @Bean
    public GameService gameService(GameRepository gameRepository) {
        return new GameServiceUsage(gameRepository);
    }
}
