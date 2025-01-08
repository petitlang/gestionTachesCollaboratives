package com.isep.g10;

import java.util.ArrayList;

public class Tache {
    
    private int id;
    private String nom;
    private String dateLimit; // format : "yyyy-MM-dd HH:mm
    private double budget;
    private double realCost;
    private int priority;
    private String category; // "a faire", "en cours", "termine"
    private ArrayList<Employe> membresTache;
    private String descriptions;
    private String commentaires;

    public Tache(int id, String nom, String dateLimit, double budget, int priority, String descriptions) {
        this.id = id;
        this.nom = nom;
        this.dateLimit = dateLimit;
        this.budget = budget;
        this.realCost = 0;
        this.priority = priority;
        this.category = "a faire";
        this.membresTache = new ArrayList<Employe>();
        this.descriptions = descriptions;
        this.commentaires = "";
        // add tache to Kanban

        // add tache to projet

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

    public int getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<Employe> getMembresTache() {
        return membresTache;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public String getCommentaires() {
        return commentaires;
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

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setCategory(String category) {
        // verifier si category est valide

        // update Kanban
        
        this.category = category;

    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public void addMembre(Employe employe) {
        membresTache.add(employe);
    }

    public void deletMembre(Employe employe) {
        membresTache.remove(employe);
    }

    public void addCommentaire(String commentaire) {
        this.commentaires += commentaire + "\n";
    }

    public void deleteCommentaire(String commentaire) {
        this.commentaires = this.commentaires.replace(commentaire + "\n", "");
    }

    public void addTache(Tache tache) {
        // add tache to projet

        // add tache to Kanban

    }

    public void deleteTache(Tache tache) {
        // delete tache from projet

        // delete tache from Kanban

    }

    public String toString() {
        return "Tache [id=" + id + ", nom=" + nom + ", dateLimit=" + dateLimit + ", budget=" + budget + ", realCost=" + realCost + ", priority=" + priority + ", category=" + category + ", \ndescriptions=" + descriptions + ", \ncommentaires=" + commentaires + "]";
    }
}
