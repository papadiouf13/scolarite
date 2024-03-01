package com.ecole221;
import com.ecole221.service.DBHelper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FiliereService {
    public Boolean findFiliereByLibelle(String libelle) throws SQLException {
        try {
            DBHelper db =  DBHelper.getInstance();
            String sql = "select * from filiere where libelle = ?";
            Object[] tab = {libelle};
            ResultSet rs = db.executeSelect(sql, tab);
            if (rs.next()){
                rs.close();
                return true;
            }
            rs.close();
            return false;
        } catch (SQLException e) {
            throw e;
        }
    }

    public void addFiliere(String libelle) throws SQLException {
        try {
            DBHelper db =  DBHelper.getInstance();
            String sql = "INSERT into filiere VALUES (null , ?)";
            Object[] tab = {libelle};
            db.executeMaj(sql, tab);
        } catch (SQLException e) {
            throw e;
        }
    }
}
