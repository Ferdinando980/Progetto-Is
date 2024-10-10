package com.justInTime.controller;

import java.util.List;
import com.justInTime.model.Player;
import com.justInTime.service.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService PlayerService;

    // Aggiungi un nuovo giocatore
    @PostMapping("/add")
    public Player addPlayer(@RequestBody Player player) {
        return PlayerService.addPlayer(player);
    }

    // Ottieni tutti i giocatori
    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return PlayerService.getAllPlayers();
    }

    // Ottieni un giocatore per ID
    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable Long id) {
        return PlayerService.getPlayer(id);
    }

    // Aggiorna il punteggio massimo di un giocatore
    @PutMapping("/update/{id}")
    public Player updatePlayerScore(@PathVariable Long id, @RequestBody int newScore) {
        return PlayerService.updatePlayerScore(id, newScore);
    }

    // Elimina un giocatore
    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable Long id) {
        PlayerService.deletePlayer(id);
    }

}
