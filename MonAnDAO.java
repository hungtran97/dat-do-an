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
import model.NhaHang;

/**
 *
 * @author duong
 */
public class MonAnDAO {
    public static ArrayList<MonAn> getMonAnCanTim(String tuKhoa) {
        ArrayList<MonAn> listMonAn = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblMonAn WHERE tenmonan LIKE %" + tuKhoa + "%";
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                MonAn monAn = new MonAn(rs.getInt(1), rs.getString(2), (NhaHang) rs.getObject(3), rs.getFloat(4), rs.getInt(5));
                listMonAn.add(monAn);
            }
            // close connection
            con.close();
            return listMonAn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
