package com.keyin.rest.Game;

import java.util.List;

public interface GameService {
    List<Game> getGames();

    List<Game> getAllGames();

    Game createGame(Game game);
}
