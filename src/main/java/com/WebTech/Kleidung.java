package com.WebTech;

public class Kleidung {
    private String kleidungName;
    private String groesse;
    private int lager;

    public Kleidung(String kleidungName, String groesse, int lager) {
        this.kleidungName = kleidungName;
        this.groesse = groesse;
        this.lager = lager;
    }

    public String getKleidungName() {
        return kleidungName;
    }

    public String getGroesse() {
        return groesse;
    }

    public int getLager() {
        return lager;
    }
}