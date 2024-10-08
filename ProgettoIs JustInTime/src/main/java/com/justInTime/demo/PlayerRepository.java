package com.justInTime.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Puoi aggiungere metodi personalizzati se necessario

    /*
     * save(S entity): Salva un'entità (crea o aggiorna).
     * findById(ID id): Trova un'entità per ID.
     * findAll(): Restituisce tutte le entità.
     * deleteById(ID id): Elimina un'entità per ID.
     * count(): Restituisce il numero totale di entità nel database.
     * existsById(ID id): Controlla se un'entità esiste per ID.
     */
}
