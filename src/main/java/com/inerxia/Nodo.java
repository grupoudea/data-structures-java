package com.inerxia;

public class Nodo {

    private int dato;
    private Nodo liga;

    public Nodo(){}
    public Nodo(int dato){
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
}
