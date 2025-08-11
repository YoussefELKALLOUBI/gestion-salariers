package test.Metier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import modele.metier.Categorie;
import modele.metier.Salarie;
import modele.metier.Service;

/**
 *
 * @author Hp
 */
public class testEtape1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Categorie categorie01 = new Categorie("C01", "Chef", 2400, "Carsat", 300);
        Service service01 = new Service(01, "Direction", "mperreux@esn.com", "+336110101010");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Salarie salarie01 = new Salarie("S01", "Martin", "Perreux", sdf.parse("03/04/1990"), sdf.parse("03/04/2015"), "Direction", 9.0, "Marié", 2, categorie01, service01);
        System.out.println(salarie01.toString());

        // TODO code application logic here
    }

}
