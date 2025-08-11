package test.dao;

import java.io.IOException;
import modele.dao.ConnexionBDD;
import modele.dao.DaoService;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.dao.DaoCategorie;
import modele.metier.Categorie;
import modele.metier.Service;
/**
 *
 * @author btssio
 */
public class TestDaoCategorie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test 1 getOneById
        System.out.println("\n Test 1 : DaoCategorie.getOneById");
        try {
            String idRecherche = "C1";
            Categorie cat = DaoCategorie.getOneById(idRecherche);
            if(cat != null){
                System.out.println("Categorie d'id "+idRecherche+" trouvé : \n"+cat.toString());
            }else{
                System.out.println("Categorie d'id "+idRecherche+" non trouvé : \n");
            }
            
        } catch (SQLException ex) {
            System.out.println("TestDaoCategorie - échec getOneById : " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("TestDaoategorie - échec getOneById : " + ex.getMessage());
        }
        // Test 2 getAll
        System.out.println("\n Test 2 : DaoCategorie.getAll");
        try {
            ArrayList<Categorie> lesCategorie = DaoCategorie.getAll();
            for (Categorie cat : lesCategorie) {
                System.out.println(cat);
            }
            System.out.println(lesCategorie.size()+" catégorie trouvés");
        } catch (SQLException ex) {
            System.out.println("TestDaoCategorie - échec getAll : " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("TestDaoCategorie - échec getAll : " + ex.getMessage());
        }
        
        // Fermeture de la connexion
        try {
            ConnexionBDD.getConnexion().close();
            System.out.println("\nConnexion à la BDD fermée");
        } catch (SQLException ex) {
            System.out.println("TestDaoCategorie - échec de la fermeture de la connexion : " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("TestDaoCategorie - échec de la fermeture de la connexion : " + ex.getMessage());
        }
    }

}
