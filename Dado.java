package com.example.juego3dados;

import java.util.Random;

public class Dado {
    private int cara;
    private final String[] caras = {"⚀","⚁","⚂","⚃","⚄","⚅"};
    private Random aleatorio;

    public Dado(){
        aleatorio = new Random();
        lanzar();
    }

    public int lanzar(){
        cara = aleatorio.nextInt(6) + 1;
        return cara;
    }

    public int getValor(){ return cara; }
    public String getCara(){ return caras[cara - 1]; }
    public String[] getCaras(){ return caras; }
}
