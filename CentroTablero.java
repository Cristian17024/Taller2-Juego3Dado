package com.example.juego3dados;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class CentroTablero extends HBox {
    private DadoUI dadoUI1, dadoUI2, dadoUI3;
    private Button lanzar;

    public CentroTablero(ManejadorJuego manejador){
        dadoUI1 = new DadoUI();
        dadoUI2 = new DadoUI();
        dadoUI3 = new DadoUI();
        lanzar = new Button("LANZAR");

        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        this.getChildren().addAll(dadoUI1, dadoUI2, dadoUI3, lanzar);
    }

    public void cambiarEmojis(int v1, int v2, int v3){
        dadoUI1.cambiarEmojis(v1);
        dadoUI2.cambiarEmojis(v2);
        dadoUI3.cambiarEmojis(v3);
    }

    public Button getLanzar(){ return lanzar; }

    public DadoUI getDadoUI1(){ return dadoUI1; }
    public DadoUI getDadoUI2(){ return dadoUI2; }
    public DadoUI getDadoUI3(){ return dadoUI3; }
}

