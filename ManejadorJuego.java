package com.example.juego3dados;

public class ManejadorJuego {
    private Juego3Dados juego;
    private Jugador[] jugadores;
    private int turno;
    private int lanzamientos;

    public ManejadorJuego(){
        juego = new Juego3Dados();
        jugadores = new Jugador[]{
                new Jugador("Manolito"),
                new Jugador("Pedrito"),
                new Jugador("Carlitos"),
                new Jugador("Sofi")
        };
        turno = 0;
        lanzamientos = 0;
    }

    public Jugador getJugador(int i){ return jugadores[i]; }
    public Juego3Dados getJuego(){ return juego; }

    public void lanzarTurno(){
        if (lanzamientos < 12) {
            juego.lanzar();
            int puntos = juego.sumar();
            jugadores[turno].addPuntos(puntos);

            System.out.println(jugadores[turno].getNombre() + " obtuvo " + puntos + " puntos. Total: " + jugadores[turno].getPuntos());

            turno = (turno + 1) % jugadores.length;
            lanzamientos++;
        } else {
            System.out.println("Ya se completaron los 12 lanzamientos.");
            mostrarGanador();
        }
    }

    public void mostrarGanador(){
        Jugador ganador = jugadores[0];
        boolean empate = false;

        for (int i = 1; i < jugadores.length; i++) {
            if (jugadores[i].getPuntos() > ganador.getPuntos()) {
                ganador = jugadores[i];
                empate = false;
            } else if (jugadores[i].getPuntos() == ganador.getPuntos()) {
                empate = true;
            }
        }

        System.out.println("\nResultados: ");
        for (Jugador j : jugadores) {
            System.out.println(j.getNombre() + ": " + j.getPuntos() + " puntos");
        }

        if (empate) {
            System.out.println("\nEl juego terminó en EMPATE con " + ganador.getPuntos() + " puntos.");
        } else {
            System.out.println("\nEl ganador es: " + ganador.getNombre() + " con " + ganador.getPuntos() + " puntos 🎉");
            ganador.incrementarJuegosGanados();
        }
    }

    public void iniciarRonda(){ }
    public void jugar(){ }
    public void verificar(){ }
    public void verificarRonda(){ }
    public void verificarGanador(){ }
}
