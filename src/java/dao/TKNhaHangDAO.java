/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.TKNhaHang;

/**
 *
 * @author Admin
 */
public class TKNhaHangDAO extends DAO{
    public TKNhaHangDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ArrayList<TKNhaHang> getTKNhaHang(Date sd, Date ed){
        ArrayList<TKNhaHang> kq = null;
        String sql = "{call TKNhaHang(?)}"; //su dung stored procedure
        try{
            CallableStatement cs = con.prepareCall(sql);
            cs.setDate(0, sd);
            cs.setDate(0, ed);
            ResultSet rs = cs.executeQuery();
             
            while(rs.next()){
                if(kq == null) kq = new ArrayList<TKNhaHang>();
                TKNhaHang tknh = new TKNhaHang();
                tknh.setId(rs.getInt("id"));
                tknh.setTen(rs.getString("ten"));
                tknh.setDiachi(rs.getString("diachi"));
                tknh.setSdt(rs.getString("sodienthoai"));
                tknh.setDoanhthu(rs.getFloat("doanhthu"));
                kq.add(tknh);
            }
        }catch(Exception e){
            e.printStackTrace();
            kq = null;
        }   
        return kq;
    }
}
