package TP9_Sol;

import bandeau.Bandeau;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Rotation r = new Rotation();
        Clignotant cl = new Clignotant();
        Couleur c = new Couleur();
        Zoom z = new Zoom();
        Caractere car = new Caractere();
        Fontt f = new Fontt();


        Bandeau bd = new Bandeau();
        Font font = bd.getFont();
        Color back = bd.getBackground();
        Color fore = bd.getForeground();

        Scenario scenario = new Scenario();
        scenario.ajouterEffet(c, 1);
        scenario.ajouterEffet(cl, 5);
        scenario.ajouterEffet(z, 1);
        scenario.ajouterEffet(r, 1);

        scenario.excecuter();


    }


}