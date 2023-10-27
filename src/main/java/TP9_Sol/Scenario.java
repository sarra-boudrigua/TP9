package TP9_Sol;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Scenario {
    private ArrayList <Effets> lesEffets;

    public Scenario(){
        this.lesEffets= new ArrayList<>();
    }
public void ajouterEffet(Effets e, int nbRept) {
    for (int i = 0; i < nbRept; i++) {
        lesEffets.add(e);
    }
}
    public void excecuter() {
        Bandeau b = new Bandeau();
        for (Effets e : lesEffets) {
            e.excecuter(b);
        }

    }
}
