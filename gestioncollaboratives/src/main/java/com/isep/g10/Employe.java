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
        return historiqueProjets;
    }

    public static void deletEmploye(Employe employe) {
        employes.remove(employe);
    }

    public static ArrayList<Employe> getEmployes() {
        return employes;
    }
    
}
