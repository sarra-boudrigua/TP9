package TP9_Sol;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Scenario {
    private ArrayList <Effets> lesEffets;
    private Bandeau bandeau;

    public Scenario(Bandeau bandeau) {
        this.lesEffets= new ArrayList<>();
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effets e, int nbRept) {
    for (int i = 0; i < nbRept; i++) {
        lesEffets.add(e);
    }
}
    public void excecuter() {
        for (Effets e : lesEffets) {
            e.excecuter(bandeau);
        }

    }
}
