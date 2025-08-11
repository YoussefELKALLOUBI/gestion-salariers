/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Hp
 */
public class Salarie {
    
    /** Definition des attributs**/
    private String code;
    private String nom;
    private String prenom;
    private Date dateNaiss;
    private Date dateEmbauche;
    private String fonction;
    private double tauxHoraire;
    private String situationFamiliale;
    private int nbrEnfants;
    private Categorie categorie;
    private Service service;
    /**
     * @param code
     * @param nom
     * @param prenom
     * @param dateNaiss
     * @param dateEmbauche
     * @param fonction
     * @param tauxHoraire
     * @param situationFamiliale
     * @param nbrEnfants
     */
    
    
    
    
    
 

    
    
    
    
    
    public Salarie(String code,String nom,String prenom,Date dateNaiss,Date dateEmbauche,String fonction,double tauxHoraire,String situationFamiliale,int nbrEnfants,Categorie categorie,Service service) {
       this.code=code;
       this.nom=nom;
       this.prenom=prenom;
       this.dateNaiss=dateNaiss;
       this.dateEmbauche=dateEmbauche;
       this.fonction=fonction;
       this.tauxHoraire=tauxHoraire;
       this.situationFamiliale=situationFamiliale;
       this.nbrEnfants=nbrEnfants;
       this.categorie=categorie;
       this.service=service;
    }

    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public String getFonction() {
        return fonction;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public String getSituationFamiliale() {
        return situationFamiliale;
    }

    public int getNbrEnfants() {
        return nbrEnfants;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public void setSituationFamiliale(String situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }

    public void setNbrEnfants(int nbrEnfants) {
        this.nbrEnfants = nbrEnfants;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Service getService() {
        return service;
    }

    
    
    @Override
    public String toString() {
        return this.getNom()+ " " + this.getPrenom();
                }
 
}



