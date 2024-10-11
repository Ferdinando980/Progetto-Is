
package com.justInTime.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Genera un ID unico per ogni player
    private Long id;

    private String name;  // Nome del giocatore
    private int maxScore;  // Punteggio ottenuto dal numero di partite vinte
    private  String cognome;
    private Long telefono;
    private String email;
    private String password;
    private String username;
    private String tipo;
    private String genere;
    private int posizione;

    // Costruttore
    public Player() {
    }

    public Player(String name, int maxScore) {
        this.name = name;
        this.maxScore = maxScore;
    }

    public Player(String name, int maxScore, String cognome, String genere, Long telefono, String email, String username, String password, String tipo) {
        this.name = name;
        this.maxScore = maxScore;
        this.telefono=telefono;
        this.cognome = cognome;
        this.posizione = 0; //Nuovo utente senza una posizione in classifica
        this.email = email;
        this.username = username;
        this.password = password;
        this.tipo = tipo;
        this.genere=genere;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    public void IncreaseMaxScore() {
            this.maxScore++;  // Aumenta il numero di partite vinte
        }
    }