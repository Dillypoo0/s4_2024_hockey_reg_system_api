package com.keyin.rest.Game;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;

import cn.enaium.kookstarter.model.request.GameActivityBody;
import cn.enaium.kookstarter.model.request.GameCreateBody;
import cn.enaium.kookstarter.model.request.GameDeleteActivityBody;
import cn.enaium.kookstarter.model.request.GameDeleteBody;
import cn.enaium.kookstarter.model.request.GameUpdateBody;
import cn.enaium.kookstarter.model.response.GameActivityResponse;
import cn.enaium.kookstarter.model.response.GameCreateResponse;
import cn.enaium.kookstarter.model.response.GameDeleteActivityResponse;
import cn.enaium.kookstarter.model.response.GameDeleteResponse;
import cn.enaium.kookstarter.model.response.GameResponse;
import cn.enaium.kookstarter.model.response.GameUpdateResponse;

import java.util.List;

@Service
public class GameServiceImpl1 implements GameServiceImpl {
    private GameRepository gameRepository;
    
        public void GameService(GameRepository gameRepository) {
            this.gameRepository = gameRepository;
    }

    public GameServiceImpl1(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public GameResponse game(@com.keyin.rest.Game.Nullable String arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'game'");
    }

    @Override
    public GameActivityResponse gameActivity(@com.keyin.rest.Game.NotNull @NotNull GameActivityBody arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gameActivity'");
    }

    @Override
    public GameCreateResponse gameCreate(@NotNull GameCreateBody arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gameCreate'");
    }

    @Override
    public GameDeleteResponse gameDelete(@NotNull GameDeleteBody arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gameDelete'");
    }

    @Override
    public GameDeleteActivityResponse gameDeleteActivity(@NotNull GameDeleteActivityBody arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gameDeleteActivity'");
    }

    @Override
    public GameUpdateResponse gameUpdate(@NotNull GameUpdateBody arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gameUpdate'");
    }
}
