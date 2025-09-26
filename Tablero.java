package com.example.juego3dados;

import javafx.scene.layout.BorderPane;

public class Tablero extends BorderPane {
    private Jugador j1, j2;
    private JugadorUI ui1, ui2, ui3, ui4;
    private CentroTablero centroTablero;
    private ManejadorJuego manejador;

    public Tablero(ManejadorJuego manejador){
        this.manejador = manejador;

        j1 = manejador.getJugador(0);
        j2 = manejador.getJugador(1);

        ui1 = new JugadorUI(manejador.getJugador(0));
        ui2 = new JugadorUI(manejador.getJugador(1));
        ui3 = new JugadorUI(manejador.getJugador(2));
        ui4 = new JugadorUI(manejador.getJugador(3));

        centroTablero = new CentroTablero(manejador);

        setTop(ui1);
        setBottom(ui2);
        setLeft(ui3);
        setRight(ui4);
        setCenter(centroTablero);

        centroTablero.getLanzar().setOnAction(e -> {
            manejador.lanzarTurno();
            actualizarDados();
            actualizarPuntos();
        });
    }

    private void actualizarDados(){
        Juego3Dados juego = manejador.getJuego();
        cambiarEmojis(juego.getDado1(), juego.getDado2(), juego.getDado3());
    }

    private void actualizarPuntos(){
        ui1.actualizar();
        ui2.actualizar();
        ui3.actualizar();
        ui4.actualizar();
    }

    public void cambiarEmojis(int v1, int v2, int v3){
        centroTablero.cambiarEmojis(v1, v2, v3);
    }

    public JugadorUI getUI1(){ return ui1; }
    public JugadorUI getUI2(){ return ui2; }
    public JugadorUI getUI3(){ return ui3; }
    public JugadorUI getUI4(){ return ui4; }
    public CentroTablero getCentroTablero(){ return centroTablero; }

    public Jugador getJ1(){ return j1; }
    public Jugador getJ2(){ return j2; }
}
