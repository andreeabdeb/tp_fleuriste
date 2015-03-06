/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.io.Serializable;

/**
 *
 * @author 0924345
 */
public class Membre implements Serializable {
   private static int int_code=10;
   private int code_membre;
   private float revenu_annuel;
   private String nom, prenom, adresse, statut;

    public Membre() {
        
    }

    public int getCode_membre() {
        return code_membre;
    }

    public void setCode_membre(int code_membre) {
        this.code_membre = code_membre;
    }

    public float getRevenu_annuel() {
        return revenu_annuel;
    }

    public void setRevenu_annuel(float revenu_annuel) {
        this.revenu_annuel = revenu_annuel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Membre(int code_membre, float revenu_annuel, String nom, String prenom, String adresse, String statut) {
        this.code_membre = code_membre;
        this.revenu_annuel = revenu_annuel;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.statut = statut;
    }

    public Membre(int code_membre, String nom, String prenom) {
        this.code_membre = code_membre;
        this.nom = nom;
        this.prenom = prenom;
    }

    public static int getInt_code() {
        return int_code;
    }

    public static void setInt_code(int int_code) {
        Membre.int_code = int_code;
    }

    @Override
    public String toString() {
        return "Membre{" + "code_membre=" + code_membre + ", revenu_annuel=" + revenu_annuel + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", statut=" + statut + '}';
    }


   
   
}
