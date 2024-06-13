package com.WebTech;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Kleidung {

    @Id
    @GeneratedValue
    private String kleidungName;
    private String groesse;
    private int anzahl;
    private int lager;

    public Kleidung() {} //leerer Konstruktor

    public Kleidung(String kleidungName, String groesse, int anzahl, int lager) {
        this.kleidungName = kleidungName;
        this.groesse = groesse;
        this.anzahl = anzahl;
        this.lager = lager;
    }

    public String getKleidungName() {
        return kleidungName;
    }

    public String getGroesse() {
        return groesse;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public int getLager() {
        return lager;
    }
}