package com.justInTime.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Genera un ID unico per ogni player
    private Long id;

    private String name;  // Nome del giocatore
    private int maxScore;  // Punteggio massimo ottenuto in una singola partita

    // Costruttore
    public Player() {
    }

    public Player(String name, int maxScore) {
        this.name = name;
        this.maxScore = maxScore;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int score) {
        if (score > this.maxScore) {
            this.maxScore = score;  // Salva solo se è superiore
        }
    }
}
