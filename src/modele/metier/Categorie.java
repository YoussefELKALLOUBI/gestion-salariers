/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;




/**
 *
 * @author Hp
 */
public class Categorie {
    
    private String code;
    private String libelle;
    private double salaireMini;
    private String CaisseRetraite;
    private int prime=0;
    /**
     *
     * @param code
     * @param libelle
     * @param salaireMini
     * @param CaisseRetraite
     * @param prime
     */
    
    public Categorie(String code,String libelle, double salaireMini,String CaisseRetraite,int prime) {
        this.code= code;
        this.libelle= libelle;
        this.salaireMini= salaireMini;
        this.CaisseRetraite=CaisseRetraite;
    }
    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getSalaireMini() {
        return salaireMini;
    }

    public String getCaisseRetraite() {
        return CaisseRetraite;
    }

    public int getPrime() {
        return prime;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setSalaireMini(double salaireMini) {
        this.salaireMini = salaireMini;
    }

    public void setCaisseRetraite(String CaisseRetraite) {
        this.CaisseRetraite = CaisseRetraite;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Categorie{" + "code=" + code + ", libelle=" + libelle + ", salaireMini=" + salaireMini + ", CaisseRetraite=" + CaisseRetraite + ", prime=" + prime + '}';
    }
    
}
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
