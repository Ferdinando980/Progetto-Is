
package com.justInTime.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Genera un ID unico per ogni player
    private Long id;

    private String name;  // Nome del giocatore
    private int maxScore;  // Punteggio ottenuto dal numero di partite vinte

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

    public void setMaxScore(int maxScore)
    {
        this.maxScore=maxScore;

    }

    public void IncreaseMaxScore() {
            this.maxScore++;  // Aumenta il numero di partite vinte
        }
    }