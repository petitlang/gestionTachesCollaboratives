package com.isep.g10;

import java.util.ArrayList;

public class Projet {
    private int id;
    private String nom;
    private String dateLimit; // format : "yyyy-MM-dd HH:mm:ss"
    private double budget;
    private double realCost;
    private ArrayList<Employe> membresProjet;
    private ArrayList<Tache> taches;

    private static ArrayList<Projet> projets;

    public Projet(int id, String nom, String dateLimit, double budget) {
        this.id = id;
        this.nom = nom;
        this.dateLimit = dateLimit;
        this.budget = budget;
        this.realCost = 0;
        this.membresProjet = new ArrayList<Employe>();
        this.taches = new ArrayList<Tache>();
        if (projets == null) {
            projets = new ArrayList<Projet>();
        }
        projets.add(this);
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDateLimit() {
        return dateLimit;
    }

    public double getBudget() {
        return budget;
    }

    public double getRealCost() {
        return realCost;
    }

    public ArrayList<Employe> getMembresProjet() {
        return membresProjet;
    }

    public ArrayList<Tache> getTaches() {
        return taches;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateLimit(String dateLimit) {
        this.dateLimit = dateLimit;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setRealCost(double realCost) {
        this.realCost = realCost;
    }

    public void addMembre(Employe employe) {
        membresProjet.add(employe);
    }

    public void deleteMembre(Employe employe) {
            membresProjet.remove(employe);
    }

    public void addTache(Tache tache) {
        taches.add(tache);
    }

    public void deleteTache(Tache tache) {
        taches.remove(tache);
    }

    public static void deleteProjet(Projet projet) {
        projets.remove(projet);
    }

    public static ArrayList<Projet> getProjets() {
        return projets;
    }

    public String toString() {
        return "Projet [id=" + id + ", nom=" + nom + ", dateLimit=" + dateLimit + ", budget=" + budget + ", realCost=" + realCost + "]"
                + "\nTaches du projet : \n" + taches;
    }

}
