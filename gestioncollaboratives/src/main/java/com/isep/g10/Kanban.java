package com.isep.g10;

import java.util.ArrayList;

public class Kanban {
    private ArrayList<Tache> TachesAFaire;
    private ArrayList<Tache> TachesEnCours;
    private ArrayList<Tache> TachesTermine;

    public Kanban() {
        this.TachesAFaire = new ArrayList<Tache>();
        this.TachesEnCours = new ArrayList<Tache>();
        this.TachesTermine = new ArrayList<Tache>();
    }

    public ArrayList<Tache> getTachesAFaire() {
        return TachesAFaire;
    }

    public ArrayList<Tache> getTachesEnCours() {
        return TachesEnCours;
    }

    public ArrayList<Tache> getTachesTermine() {
        return TachesTermine;
    }

    public void moveTache(Tache tache) {
        switch (tache.getCategory()) {
            case "a faire":
                TachesAFaire.add(tache);
                break;
            case "en cours":
                TachesEnCours.add(tache);
                break;
            case "termine":
                TachesTermine.add(tache);
                break;
            default:
                break;
        }
    }

    public void removeTache(Tache tache) {
        switch (tache.getCategory()) {
            case "a faire":
                TachesAFaire.remove(tache);
                break;
            case "en cours":
                TachesEnCours.remove(tache);
                break;
            case "termine":
                TachesTermine.remove(tache);
                break;
            default:
                break;
        }
    }
    
}
