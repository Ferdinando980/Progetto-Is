package com.justInTime.repository;

import com.justInTime.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Puoi aggiungere metodi personalizzati se necessario

    // Esempio di metodo per trovare un giocatore per nome
    Optional<Player> findByName(String name);
    
    // Puoi anche aggiungere altri metodi come:
    // List<Player> findByMaxScoreGreaterThan(int score);
}
