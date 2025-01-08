package com.isep.g10;

import java.util.ArrayList;

public class Employe extends Personne {

    private ArrayList<Projet> historiqueProjets;
    private static ArrayList<Employe> employes;

    public Employe(int id, String nom) {
        super(id, nom);
        this.historiqueProjets = new ArrayList<Projet>();
        if (employes == null) {
            employes = new ArrayList<Employe>();
        }
        employes.add(this);
    }

    public ArrayList<Projet> getHistoriqueProjets() {
        for (Projet projet : Projet.getProjets()) {
            if (projet.getMembresProjet().contains(this) && !historiqueProjets.contains(projet)) {
                historiqueProjets.add(projet);
            }
        }

        for (Projet projet : historiqueProjets) {
            if (!projet.getMembresProjet().contains(this)) {
                historiqueProjets.remove(projet);
            }
        }

        return historiqueProjets;
    }

    public static void deletEmploye(Employe employe) {
        employes.remove(employe);
    }

    public static ArrayList<Employe> getEmployes() {
        return employes;
    }

    @Override
    public String toString() {
        String historiqueProjetsStr = "";
        for (Projet projet : historiqueProjets) {
            historiqueProjetsStr += "\nNom du projet : " + projet.getNom() + " id : " + projet.getId() + ", ";
        }

        return "Employe [id=" + this.getId() + ", nom=" + this.getNom() + "]"
                + " historiqueProjets : " + historiqueProjets;
    }
    
}
