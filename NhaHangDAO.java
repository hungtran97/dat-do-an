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
import model.KhachHang;
import model.LoiNhanXet;
import model.MonAn;
import model.NhaHang;

/**
 *
 * @author duong
 */
public class NhaHangDAO {
    public static ArrayList<NhaHang> getNhaHangCanTim(String tuKhoa) {
        ArrayList<NhaHang> listNhaHang = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblNhaHang WHERE tennhahang LIKE %" + tuKhoa + "%";
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                NhaHang nhaHang = new NhaHang(rs.getString(1), rs.getString(2), rs.getString(3), (ArrayList) rs.getArray(4));
                listNhaHang.add(nhaHang);
            }
            // close connection
            con.close();
            return listNhaHang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static NhaHang getMenu(int idNhaHang) {
        try {
            String query = "SELECT * FROM tblNhaHang WHERE id = " + idNhaHang;
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            NhaHang nhaHang = new NhaHang(rs.getString(1), rs.getString(2), rs.getString(3), (ArrayList) rs.getArray(4));
            // close connection
            con.close();
            return nhaHang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<LoiNhanXet> getLoiNhanXet(int idNhaHang) {
        ArrayList<LoiNhanXet> listLoiNhanXet = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblLoiNhanXet WHERE id = " + idNhaHang;
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                LoiNhanXet loiNhanXet = new LoiNhanXet((KhachHang) rs.getObject(1), rs.getString(2), rs.getDate(3));
                listLoiNhanXet.add(loiNhanXet);
            }
            // close connection
            con.close();
            return listLoiNhanXet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
