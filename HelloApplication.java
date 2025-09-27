package com.example.juego3dados;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        ManejadorJuego manejadorJuego = new ManejadorJuego();
        Tablero tablero = new Tablero(manejadorJuego);

        Scene scene = new Scene(tablero, 700, 500);
        stage.setTitle("Juego 3 Dados");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
