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

/**
 *
 * @author hungt
 */
public class MonAnDAO {

    public static ArrayList<MonAn> getAllMonAn(String nhaHangId) {
        ArrayList<MonAn> listMonAn = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblMonAn WHERE tblNhaHangid = " + nhaHangId;
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                MonAn monAn = new MonAn(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
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

    public static ArrayList<MonAn> getListMonAn(String nhaHangId, String name) {
        ArrayList<MonAn> listMonAn = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblMonAn WHERE tblNhaHangid = " + nhaHangId + " AND tenMon LIKE %" + name + "%";
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                MonAn monAn = new MonAn(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
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

    public static MonAn getMonAn(String monAnId) {
        try {
            String query = "SELECT * FROM tblMonAn WHERE id = " + monAnId;
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            MonAn monAn = new MonAn(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            // close connection
            con.close();
            return monAn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean suaMonAn(MonAn monan, String nhaHangId) {
        boolean kq = false;
        PreparedStatement st = null;
        try {
            String query = "UPDATE tblMonAn SET"
                    + "tenMon=" + monan.getTenMon() + ","
                    + "giaMon=" + monan.getGiaMon() + ","
                    + "soLuongTonKho=" + monan.getSoLuongTonKho() + ","
                    + "tblNhaHangid=" + nhaHangId + ")";
            st = con.prepareStatement(query);
            st.executeQuery(query);
            // close connection
            con.close();
            kq = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public static boolean themMonAn(MonAn monan, String nhaHangId) {
        boolean kq = false;
        PreparedStatement st = null;
        try {
            String query = "INSERT INTO tblMonAn (tenMon, giaMon, getSoLuongTonKho, tblNhaHangid)"
                    + "("
                    + monan.getTenMon() + ","
                    + monan.getGiaMon() + ","
                    + monan.getSoLuongTonKho() + ","
                    + nhaHangId + ")";
            st = con.prepareStatement(query);
            st.executeQuery(query);
            // close connection
            con.close();
            kq = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }

    public static boolean xoaMonAn(String monAnId) {
        boolean kq = false;
        try {
            String query = "DELETE FROM tblMonAn WHERE id = " + monAnId;
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            st.executeQuery(query);
            // close connection
            con.close();
            kq = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }
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
