/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MonAn;
import model.MonAnTrongDH;

/**
 *
 * @author duong
 */
public class MonAnTrongDHDAO {
    public static ArrayList<MonAnTrongDH> setThemVaoGH(MonAn monThem, int soLuongDat) {
        ArrayList<MonAnTrongDH> listMonAnTrongDH = new ArrayList<>();
        PreparedStatement st = null;
        try {         
            String query = "INSERT INTO tblMonAnTrongDH (tenMonAn, giaCa, soLuongDat, tblMonAnid)"
                    + "("
                    + monThem.getTenmonan() + ","
                    + monThem.getGiaca() + ","
                    + soLuongDat + ","
                    + monThem.getId() + ")";
            st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                MonAnTrongDH monAnTrongDH = new MonAnTrongDH((MonAn) rs.getObject(1),rs.getInt(2));
                listMonAnTrongDH.add(monAnTrongDH);
            }          
            // close connection
            con.close();
            return listMonAnTrongDH;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
