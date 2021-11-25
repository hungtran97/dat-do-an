/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.HoaDon;

/**
 *
 * @author Admin
 */
public class HoaDonDAO extends DAO{
 
    public HoaDonDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ArrayList<HoaDon> getHoaDonKH(int idKhachHang,Date sd , Date ed){
        ArrayList<HoaDon> kq = null;
        String sql = "{call HoaDonKH(?)}"; //su dung stored procedure
        try{
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1, idKhachHang);
            cs.setDate(0, sd);
            cs.setDate(0, ed);
            ResultSet rs = cs.executeQuery();
             
            while(rs.next()){
                if(kq == null) kq = new ArrayList<HoaDon>();
                HoaDon hd = new HoaDon();
                hd.setId(rs.getInt("id"));
                hd.setTienthanhtoan(rs.getFloat("tienthanhtoan"));
                hd.setThoigianxuat(rs.getDate("thoigianxuat"));
                kq.add(hd);
            }
        }catch(Exception e){
            e.printStackTrace();
            kq = null;
        }   
        return kq;
    }
    
    public ArrayList<HoaDon> getHoaDonNH(int idNhaHang,Date sd , Date ed){
        ArrayList<HoaDon> kq = null;
        String sql = "{call HoaDonNH(?)}"; //su dung stored procedure
        try{
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1, idNhaHang);
            cs.setDate(0, sd);
            cs.setDate(0, ed);
            ResultSet rs = cs.executeQuery();
             
            while(rs.next()){
                if(kq == null) kq = new ArrayList<HoaDon>();
                HoaDon hd = new HoaDon();
                hd.setId(rs.getInt("id"));
                hd.setTienthanhtoan(rs.getFloat("tienthanhtoan"));
                hd.setThoigianxuat(rs.getDate("thoigianxuat"));
                kq.add(hd);
            }
        }catch(Exception e){
            e.printStackTrace();
            kq = null;
        }   
        return kq;
    }
}
