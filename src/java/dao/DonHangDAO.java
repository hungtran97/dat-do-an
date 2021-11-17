/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;



import model.DonHang;
import model.KhachHang;
import model.MonAn;
import model.MonAnTrongDH;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import model.NhaHang;

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
        String sql = "SELECT tblDonHang.*,  d.tennhahang FROM tblDonHang,(SELECT tblNhaHang.id, tblNhaHang.tennhahang FROM tblNhaHang, tblChuNhaHang WHERE tblNhaHang.tblChuNhaHangId = tblChunhahang.id AND tblChuNhaHang.id = ?) AS d where trangthaidon = 1 ";
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

}
