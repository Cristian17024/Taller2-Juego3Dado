package com.example.juego3dados;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class DadoUI extends Label {
    private static final int EMOJI_DADO = 9855;

    public DadoUI(){
        setFont(new Font("Arial", 60));
        cambiarEmoji(1);
    }

    public void cambiarEmoji(int valor){
        String emoji = new String(Character.toChars(EMOJI_DADO + valor));
        setText(emoji);
    }

    public void cambiarEmojis(int valor){
        cambiarEmoji(valor);
    }
}
