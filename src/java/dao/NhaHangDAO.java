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
import model.NhaHang;

/**
 *
 * @author tungl
 */
public class NhaHangDAO {

    public static ArrayList<NhaHang> getAllNhaHang() {
        ArrayList<NhaHang> listNhaHang = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblNhaHang";
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                NhaHang nhaHang = new NhaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
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

    public static ArrayList<NhaHang> getListNhaHang(String name) {
        ArrayList<NhaHang> listNhaHang = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblNhaHang WHERE tenNhaHang LIKE %" + name + "%";
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                NhaHang nhaHang = new NhaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
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

    public static NhaHang getNhaHang(String nhaHangId) {
        try {
            String query = "SELECT * FROM tblNhaHang WHERE id = " + nhaHangId;
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            NhaHang nhaHang = new NhaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            // close connection
            con.close();
            return nhaHang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean themNhaHang(NhaHang nh, String chuNhaHangId) {
        boolean kq = false;
        PreparedStatement st = null;
        try {
            String query = "INSERT INTO tblMonAn (tenNhaHang, diaChi, gioHoatDong, tblChuNhaHangid)"
                    + "("
                    + nh.getTenNhaHang() + ","
                    + nh.getDiaChi() + ","
                    + nh.getGioHoatDong() + ","
                    + chuNhaHangId + ")";
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
    
     public static boolean suaNhaHang(NhaHang nh, String chuNhaHangId) {
        boolean kq = false;
        PreparedStatement st = null;
        try {
            String query = "UPDATE tblMonAn SET"
                    + "tenNhaHang=" + nh.getTenNhaHang() + ","
                    + "diaChi=" + nh.getDiaChi() + ","
                    + "gioHoatDong=" + nh.getGioHoatDong() + ","
                    + "tblChuNhaHangid=" + chuNhaHangId + ")";
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

    public static boolean xoaNhaHang(String nhaHangId) {
        boolean kq = false;
        PreparedStatement st = null;
        try {
            String query1 = "DELETE FROM tblMonAn WHERE tblNhaHangid = " + nhaHangId;
            st = con.prepareStatement(query1);
            st.executeQuery(query1);

            String query2 = "DELETE FROM tblNhaHang WHERE id = " + nhaHangId;
            st = con.prepareStatement(query2);
            st.executeQuery(query2);

            // close connection
            con.close();
            kq = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }
}
