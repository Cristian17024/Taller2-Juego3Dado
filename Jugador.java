package com.example.juego3dados;

public class Jugador {
    private String nombre;
    private int puntos;
    private int rondasGanadas;
    private int juegosGanados;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntos = 0;
        this.rondasGanadas = 0;
        this.juegosGanados = 0;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPuntos() { return puntos; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
    public void addPuntos(int puntos){ this.puntos += puntos; }

    public int getRondasGanadas(){ return rondasGanadas; }
    public void incrementarRondasGanadas(){ rondasGanadas++; }

    public int getJuegosGanados(){ return juegosGanados; }
    public void incrementarJuegosGanados(){ juegosGanados++; }

    @Override
    public String toString(){
        return nombre + " - Puntos: " + puntos;
    }
}
