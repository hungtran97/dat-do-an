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
import java.util.List;
import model.DonHang;
import model.MonAnTrongDH;
import model.NhaHang;
import model.NhanVienGiaoHang;

/**
 *
 * @author duong
 */
public class DonHangDAO {
    public static boolean luuDonHang(int idNhaHang, ArrayList<MonAnTrongDH> monDat, String diaChiGiaoHang) {
        boolean kq = false;
        PreparedStatement st = null;
        try {
            int thuTu = 0;
            while(!monDat.isEmpty()){
                String query1 = "INSERT INTO tblDonHang (monDat)"
                    + "("
                    + monDat.get(thuTu)
                    + ")";
                monDat.remove(thuTu);
                thuTu++;
                st = con.prepareStatement(query1);
                st.executeQuery(query1);
            }
            String query2 = "INSERT INTO tblDonHang (diaChiGiaoHang, tblNhaHangid)"
                    + "("
                    + diaChiGiaoHang + ","
                    + idNhaHang
                    + ")";
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
    
    public static ArrayList<DonHang> getDonHangTheoTT(int trangThaiDH) {
        ArrayList<DonHang> listDonHang = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblDonHang WHERE trangthaidon = " + trangThaiDH ;
            PreparedStatement st = con.prepareStatement(query);
            System.out.println(st);
            ResultSet rs = st.executeQuery(query);
            System.out.println(rs);
            while (rs.next()) {
                DonHang donHang = new DonHang(rs.getInt(1), rs.getFloat(2),(NhaHang) rs.getObject(3), rs.getDate(4), rs.getInt(5), rs.getInt(6), rs.getString(7),(NhanVienGiaoHang) rs.getObject(8), (List<MonAnTrongDH>) rs.getArray(9));
                listDonHang.add(donHang);
            }
            // close connection
            con.close();
            return listDonHang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean setTrangThaiHuyDon(int idDonHang,int trangThai) {
        boolean kq = false;
        PreparedStatement st = null;
        try {
            String query = "UPDATE tblDonHang SET trangthaidon = ? WHERE id = ?";
            st = con.prepareStatement(query);
            st.setInt(1, trangThai);
            st.setInt(2, idDonHang);
            st.executeQuery(query);
            // close connection
            con.close();
            kq = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }
}
