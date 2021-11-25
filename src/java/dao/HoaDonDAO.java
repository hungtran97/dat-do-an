/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import model.HoaDon;

/**
 *
 * @author Hung
 */
public class HoaDonDAO extends DAO{
    
    public HoaDonDAO(){
        super();
    }
    
    public boolean luuHoaDon(HoaDon hoadon){
          boolean result = false;
         java.util.Date now = new java.util.Date();
        java.sql.Date date = new java.sql.Date(now.getTime());
        String sql = "INSERT INTO tblHoaDon(thoigianxuat,tienthanhtoan,tblDonHangId) VALUES (?,?,?) ";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, date);
            ps.setFloat(2, hoadon.getTienthanhtoan());
            ps.setInt(3, hoadon.getDonhang().getId());
             result = ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
        
        
    }
    

