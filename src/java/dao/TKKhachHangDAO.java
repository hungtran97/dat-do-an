/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;
import model.TKKhachHang;

/**
 *
 * @author Admin
 */
public class TKKhachHangDAO extends DAO{
 
    public TKKhachHangDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ArrayList<TKKhachHang> getTKKhachHang(Date sd, Date ed){
        ArrayList<TKKhachHang> kq = null;
        String sql = "{call TKKhachHang(?)}"; //su dung stored procedure
        try{
            CallableStatement cs = con.prepareCall(sql);
            cs.setDate(0, sd);
            cs.setDate(0, ed);
            ResultSet rs = cs.executeQuery();
             
            while(rs.next()){
                if(kq == null) kq = new ArrayList<TKKhachHang>();
                TKKhachHang tkkh = new TKKhachHang();
                tkkh.setId(rs.getInt("id"));
                tkkh.setHoten(rs.getString("hoten"));
                tkkh.setSdt(rs.getString("sodienthoai"));
                tkkh.setDoanhthu(rs.getFloat("doanhthu"));
                kq.add(tkkh);
            }
        }catch(Exception e){
            e.printStackTrace();
            kq = null;
        }   
        return kq;
    }
}
