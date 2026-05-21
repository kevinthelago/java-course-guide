package com.kevinthelago.securedapi.dao;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "fortunes")
public class Fortune {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "phrase")
    private String phrase;
    private List<Integer> luckyNumbers;

    public Fortune() {

    }

    public Fortune(String phrase) {
        this.phrase = phrase;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public List<Integer> getLuckyNumbers() {
        return luckyNumbers;
    }

    public void setLuckyNumbers(List<Integer> luckyNumbers) {
        this.luckyNumbers = luckyNumbers;
    }
}
