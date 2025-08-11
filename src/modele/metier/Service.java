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
public class Service {
    private int code;
    private String designation;
    private String email;
    private String telephone;
    /**
     *
     * @param code
     * @param designation
     * @param email
     * @param CaisseRetraite
     * @param telephone
     */
    
    public Service(int code,String designation, String email,String telephone) {
        this.code= code;
        this.designation= designation;
        this.email= email;
        this.telephone=telephone;
    }

    public int getCode() {
        return code;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Service{" + "code=" + code + ", designation=" + designation + ", email=" + email + ", telephone=" + telephone + '}';
    }

        
}


