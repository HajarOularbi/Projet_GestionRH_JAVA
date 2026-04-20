import java.sql.*;

public class EmployeDAO {

    public void save(Employe e) throws Exception {
        Connection conn = DBConnection.getInstance();
        String sql="INSERT INTO employes (id, nom, email, departement, date_embauche, type, salaire) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1,e.id);
        ps.setString(2,e.nom);
        ps.setString(3,e.email);
        ps.setString(4,e.departement);
        ps.setDate(5,Date.valueOf(e.dateEmbauche));
        if (e instanceof EmployeFixe){
            ps.setString(6,"FIXE");
        }else{
            ps.setString(6,"Pas FIXE");}
        ps.setDouble(7, e.calculerSalaireBrut());
        ps.executeUpdate();
        System.out.println("Ajout d'employé est bien exécuté ...");
    }
}