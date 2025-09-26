package com.example.juego3dados;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class JugadorUI extends VBox {
    private Jugador jugador;
    private Label nombreLabel;
    private Label puntosLabel;

    public JugadorUI(Jugador jugador){
        this.jugador = jugador;
        nombreLabel = new Label(jugador.getNombre());
        puntosLabel = new Label("Puntos: " + jugador.getPuntos());

        nombreLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        puntosLabel.setStyle("-fx-font-size: 14px;");

        this.setSpacing(5);
        this.setStyle("-fx-alignment: center; -fx-padding: 10; -fx-background-color: yellow;");
        this.getChildren().addAll(nombreLabel, puntosLabel);
    }

    public void actualizar(){
        puntosLabel.setText("Puntos: " + jugador.getPuntos());
    }

    public void updatePuntos(int puntos){
        jugador.setPuntos(puntos);
        actualizar();
    }

    public void addPuntos(int puntos){
        jugador.addPuntos(puntos);
        actualizar();
    }
}
