package TP9_Sol;

import bandeau.Bandeau;

public class Clignotant extends Effets {
    public void excecuter(Bandeau b) {
        b.setMessage("Hello");
        b.sleep(100);
        b.setMessage("");
        b.sleep(100);
    }
}
