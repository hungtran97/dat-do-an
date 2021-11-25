/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;

import model.DonHang;
import model.KhachHang;
import model.MonAn;
import model.MonAnTrongDH;
import model.NhanVienGiaoHang;
import model.NhaHang;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

/**
 *
 * @author Hung
 */
public class DonHangDAO extends DAO {

    public DonHangDAO() {
        super();
    }

    public List<DonHang> getDanhSachDonHang(int idChuNhaHang) {
        List<DonHang> donnhahang = new ArrayList<DonHang>();
        String sql = "SELECT tblDonHang.*,  d.tennhahang FROM tblDonHang,(SELECT tblNhaHang.id, tblNhaHang.tennhahang FROM tblNhaHang, tblChuNhaHang WHERE tblNhaHang.tblChuNhaHangId = tblChunhahang.id AND tblChuNhaHang.id = ?) AS d where trangthaidon = 1 AND tblDonHang.tblNhaHangId = d.id";
        String sql1 = "SELECT tblMonAnTrongDH.id, tblMonAnTrongDH.soluongdat, tblMonAnTrongDH.tblMonAnId,,tblMonAn.tenmonan, tblMonAn.giaca  FROM tblMonAnTrongDH, tblMonAn where tblDonHangId = ? AND tblMonAnTrongDH.tblMonAnId = tblMonAn.id";
        String sql2 = "SELECT c.hoten, c.sdt, c.id FROM (SELECT a.*, b.sdt  FROM tblThanhVien a, tblKhachHang b WHERE a.id = b.tblThanhVienid) as c WHERE c.id = ? ";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idChuNhaHang);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DonHang donhang = new DonHang();
                NhaHang nhahang = new NhaHang();
                KhachHang kh = new KhachHang();
                List<MonAnTrongDH> giohang = new ArrayList<MonAnTrongDH>();
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ps1.setInt(1, rs.getInt("Id"));
                ResultSet rs1 = ps1.executeQuery();
                donhang.setId(rs.getInt("Id"));
                donhang.setThoigiandat(rs.getTimestamp("thoigiandat"));
                donhang.setTongtien(rs.getFloat("tongtien"));
                nhahang.setTennhahang(rs.getString("tennhahang"));
                donhang.setNhahang(nhahang);

                while (rs1.next()) {
                    MonAnTrongDH dathang = new MonAnTrongDH();
                    dathang.setId(rs1.getInt("id"));
                    dathang.setSoluong(rs1.getInt("soluongdat"));
                    MonAn monan = new MonAn();
                    monan.setTenmonan(rs1.getString("tenmonan"));
                    monan.setGiaca(rs1.getFloat("giaca"));
                    dathang.setMonan(monan);
                    giohang.add(dathang);
                }
                donhang.setMondat(giohang);
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, rs.getInt("tblKhachHangId"));
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    kh.setId(rs2.getInt("id"));
                    kh.setHoten(rs2.getString("hoten"));
                    kh.setSdt(rs2.getString("sdt"));
                }
                donhang.setKhachhang(kh);
                donnhahang.add(donhang);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return donnhahang;
    }
    
    public boolean setTrangThaiDonHang(int idDonHang){
       boolean result = false;
        String sql = "UPDATE tblDonHang SET trangthaidonhang = 2 WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDonHang);
             result = ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public List<DonHang> getDanhSachDonHangChuaNhan(){
        List<DonHang> donnhan = new ArrayList<DonHang>();
        String sql = "SELECT tblDonHang.*,  tblNhaHang.tennhahang, tblNhaHang.diachinhahang FROM tblDonHang,tblNhaHang where trangthaidon = 1 AND tblDonHang.tblNhaHangId = tblNhaHang.id";
        String sql1 = "SELECT tblMonAnTrongDH.id, tblMonAnTrongDH.soluongdat, tblMonAnTrongDH.tblMonAnId,,tblMonAn.tenmonan, tblMonAn.giaca  FROM tblMonAnTrongDH, tblMonAn where tblDonHangId = ? AND tblMonAnTrongDH.tblMonAnId = tblMonAn.id";
        String sql2 = "SELECT c.hoten, c.sdt, c.id FROM (SELECT a.*, b.sdt  FROM tblThanhVien a, tblKhachHang b WHERE a.id = b.tblThanhVienid) as c WHERE c.id = ? ";
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DonHang donhang = new DonHang();
                NhaHang nhahang = new NhaHang();
                KhachHang kh = new KhachHang();
                List<MonAnTrongDH> giohang = new ArrayList<MonAnTrongDH>();
                PreparedStatement ps1 = con.prepareStatement(sql1);
                ps1.setInt(1, rs.getInt("Id"));
                ResultSet rs1 = ps1.executeQuery();
                donhang.setId(rs.getInt("Id"));
                donhang.setThoigiandat(rs.getTimestamp("thoigiandat"));
                donhang.setTongtien(rs.getFloat("tongtien"));
                donhang.setDiachigiaohang(rs.getString("diachigiaohang"));
                nhahang.setId(rs.getInt("tblNhaHangId"));
                nhahang.setDiachinhahang(rs.getString("diachinhahang"));
                nhahang.setTennhahang(rs.getString("tennhahang"));
                donhang.setNhahang(nhahang);

                while (rs1.next()) {
                    MonAnTrongDH dathang = new MonAnTrongDH();
                    dathang.setId(rs1.getInt("id"));
                    dathang.setSoluong(rs1.getInt("soluongdat"));
                    MonAn monan = new MonAn();
                    monan.setTenmonan(rs1.getString("tenmonan"));
                    monan.setGiaca(rs1.getFloat("giaca"));
                    dathang.setMonan(monan);
                    giohang.add(dathang);
                }
                donhang.setMondat(giohang);
                PreparedStatement ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, rs.getInt("tblKhachHangId"));
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    kh.setId(rs2.getInt("id"));
                    kh.setHoten(rs2.getString("hoten"));
                    kh.setSdt(rs2.getString("sdt"));
                }
                donhang.setKhachhang(kh);
                donnhan.add(donhang);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return donnhan;
    }
    
    public boolean setTrangThaiNhanDonHang(int idDonHang,int trangthai){
       boolean result = false;
       
        String sql = "UPDATE tblDonHang SET tinhtrangnhandon = ? WHERE id = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, trangthai);
            ps.setInt(2, idDonHang);
             result = ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

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
