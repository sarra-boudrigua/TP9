package TP9_Sol;

import bandeau.Bandeau;
import java.awt.*;

public class Zoom extends Effets {

    public void excecuter(Bandeau b) {

        b.setForeground(Color.black);
        b.setMessage("Hello");
        b.sleep(1000);
        b.setMessage("Hello");
        for (int i = 5; i < 60; i += 5) {
            b.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            b.sleep(100);
        }
        b.sleep(1000);

    }

}
