/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Hung
 */
public class QuanLy extends ThanhVien implements Serializable{
    
    public QuanLy(){
        super();
    }

    public QuanLy(int id, String hoten, String email, String vaitro, boolean dakichhoat) {
        super(id, hoten, email, vaitro, dakichhoat);
    }
    
    
    
    
}
