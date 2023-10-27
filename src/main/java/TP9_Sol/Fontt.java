package TP9_Sol;

import bandeau.Bandeau;

import java.awt.*;

public class Fontt extends Effets {
    public void excecuter(Bandeau b) {
        b.setMessage("Hello");
        b.sleep(1000);
        b.setMessage("Hello");
        b.setFont(new Font("Monospaced", Font.BOLD, 15));
        b.sleep(1000);
        b.setMessage("Hello");
        b.setFont(new Font("SansSerif", Font.PLAIN, 15));
        b.sleep(1000);
    }
}
