package test.dao;

import java.io.IOException;
import modele.dao.ConnexionBDD;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author btssio
 */
public class TestConnexionBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cnx = null;
        try {
            System.out.println("\n Test de connexion");
            cnx = ConnexionBDD.getConnexion();
            System.out.println("ConnexionBDD : connexion réussie");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                cnx.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
