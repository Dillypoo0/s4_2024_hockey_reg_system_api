package com.keyin.rest.Game;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameRepository gameRepository;
    public GameController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    // GET all games
    @GetMapping
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    //POST create new game
    @PostMapping
    public ResponseEntity<Game> createGame(@RequestBody Game game) {
        Game savedGame = gameRepository.save(game);
        return new ResponseEntity<>(savedGame, HttpStatus.CREATED);
    }
}
