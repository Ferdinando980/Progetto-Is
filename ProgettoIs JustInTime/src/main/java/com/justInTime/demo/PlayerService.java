

package com.justInTime.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    // Aggiungi un nuovo giocatore
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    // Trova un giocatore per ID
    public Player getPlayer(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    // Ottieni tutti i giocatori
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    // Aggiorna il punteggio massimo di un giocatore
    public Player updatePlayerScore(Long id, int newScore) {
        Player player = getPlayer(id);
        if (player != null) {
            player.setMaxScore(newScore);
            playerRepository.save(player);
        }
        return player;
    }

    // Elimina un giocatore
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
