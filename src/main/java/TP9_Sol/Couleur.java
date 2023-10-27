package TP9_Sol;

import bandeau.Bandeau;

import java.awt.*;

public class Couleur extends Effets{

    public void excecuter(Bandeau b) {
        b.setMessage("Hello");
        b.sleep(1000);
        b.setBackground(Color.DARK_GRAY);
        b.setMessage("Hello");
        b.sleep(1000);
        b.setForeground(Color.YELLOW);
        b.sleep(1000);

    }
}
