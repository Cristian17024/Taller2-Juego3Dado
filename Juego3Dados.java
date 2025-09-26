package com.example.juego3dados;

public class Juego3Dados {
    private Dado dado1, dado2, dado3;
    private boolean valoresIguales;

    public Juego3Dados(){
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
    }

    public void lanzar(){
        dado1.lanzar();
        dado2.lanzar();
        dado3.lanzar();
        verificar();
    }

    public void tirar(){ lanzar(); }

    public int sumar(){ return dado1.getValor() + dado2.getValor() + dado3.getValor(); }

    public void verificar(){
        valoresIguales = (dado1.getValor() == dado2.getValor() && dado2.getValor() == dado3.getValor());
    }

    public boolean isValoresIguales(){ return valoresIguales; }

    public int getDado1(){ return dado1.getValor(); }
    public int getDado2(){ return dado2.getValor(); }
    public int getDado3(){ return dado3.getValor(); }
}

