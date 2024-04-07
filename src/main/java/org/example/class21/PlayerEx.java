package org.example.class21;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PlayerEx {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {

        FileInputStream fis = new FileInputStream("C:\\Users\\IronMan\\IdeaProjects\\SDETJavaBatch19\\src\\main\\java\\org\\example\\class21\\Ambient-music-free.mp3");
        Player p=new Player(fis);
        p.play();
    }
}
