package TP9_Sol;

import bandeau.Bandeau;

import java.awt.*;

public class Rotation extends Effets{
    public void excecuter(Bandeau b) {

        b.setMessage("Hello");
        for (int i = 0; i <= 20; i++) {
            b.sleep(300);
            b.setRotation(i);
            b.setFont(new Font("SansSerif", Font.PLAIN, 20));
        }

    }
}
