package modele.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.metier.*;


/**
 *
 * @author btssio
 */
public class DaoSalarie {

    /**
     * Rechercher un enregistrement dans la table SALARIE d'après son code
     * (String) et en faire un objet de type Salarie
     *
     * @param id code du salarie recherché
     * @return objet de type Salarie si trouvé dans la BDD, null sinon
     * @throws SQLException
     */
    public static Salarie getOneById(String id) throws SQLException, IOException {
        Salarie salarieTrouve = null;
        Connection cnx = ConnexionBDD.getConnexion();
        PreparedStatement pstmt = cnx.prepareStatement("SELECT * FROM Salarie WHERE Code = ?");
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            salarieTrouve = enregToObjet(rs);
        }
        return salarieTrouve;
    }

    /**
     * Extraire l'ensemble des enregistrements de la table SALARIE
     *
     * @return liste d'objets de type Salarie
     * @throws SQLException
     */
    public static ArrayList<Salarie> getAll() throws SQLException, IOException {
        ArrayList<Salarie> lesSalariesTrouves = new ArrayList<>();
        Connection cnx = ConnexionBDD.getConnexion();
        PreparedStatement pstmt = cnx.prepareStatement("SELECT * FROM Salarie");
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Salarie unSalarie = enregToObjet(rs);
            lesSalariesTrouves.add(unSalarie);
        }
        return lesSalariesTrouves;
    }

    /**
     * Extraire les enregistrements de la table SALARIE liés à un service donné
     * @param idService code du service à filtrer
     * @return liste d'objets de type Salarie
     * @throws SQLException 
     */
    public static ArrayList<Salarie> getAllByService(int idService) throws SQLException, IOException {
         ArrayList<Salarie> lesSalariesTrouves = new ArrayList<>();
        Connection cnx = ConnexionBDD.getConnexion();
        PreparedStatement pstmt = cnx.prepareStatement("SELECT * FROM Salarie WHERE CodeServ = ?");
        pstmt.setInt(1, idService);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Salarie unSalarie = enregToObjet(rs);
            lesSalariesTrouves.add(unSalarie);
        }
        return lesSalariesTrouves;
    }
    
    /**
     * Transforme un enregistrement de la table SALARIE en instance de Salarie
     * @param rs jeu d'enregistrements ; l'enregistrement courant est concerné
     * @return instance de Salarie
     * @throws SQLException 
     */
    private static Salarie enregToObjet(ResultSet rs) throws SQLException, IOException {
        Salarie unSalarie = null;
        // Récupération du service du salarié
        Service unService = DaoService.getOneById(rs.getInt("CodeServ"));
        // Récupération de la catégorie du salarié
        Categorie uneCategorie = DaoCategorie.getOneById(rs.getString("NumCat"));
        unSalarie = new Salarie(
                rs.getString("Code"),
                rs.getString("Nom"),
                rs.getString("Prenom"),
                (java.util.Date) rs.getDate("DateNaiss"),
                (java.util.Date) rs.getDate("DateEmbauche"),
                rs.getString("Fonction"),
                rs.getDouble("TauxHoraire"),
                rs.getString("situationFamiliale"),
                rs.getInt("NbrEnfants"),
                uneCategorie,
                unService
        );
        return unSalarie;
    }
    public static void supprimerSalarie(String code) throws SQLException,IOException {
        Connection cnx = ConnexionBDD.getConnexion();
        PreparedStatement pstmt1 = cnx.prepareStatement("DELETE FROM Suivre WHERE CodeSal = ?");
        PreparedStatement pstmt2 = cnx.prepareStatement("DELETE FROM Salarie WHERE Code = ?");
        pstmt1.setString(1,code);
        pstmt2.setString(1,code);
        pstmt1.executeUpdate();
        pstmt2.executeUpdate();
    }

}
